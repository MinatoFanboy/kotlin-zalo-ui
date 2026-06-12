package com.example.kotlinapplication.ui.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.util.VelocityTracker
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntSize
import com.example.kotlinapplication.R
import kotlinx.coroutines.launch
import kotlin.math.max

@Composable
fun ZaImageViewer() {
    val imagesRes = R.drawable.viewer_1
    val coroutineScope = rememberCoroutineScope()

    val scale = remember { Animatable(1f) }
    val offsetX = remember { Animatable(0f) }
    val offsetY = remember { Animatable(0f) }

    val minScale = 1f
    val maxScale = 5f

    var containerSize by remember { mutableStateOf(IntSize.Zero) }

    fun getMaxOffsetX(currentScale: Float): Float {
        val scaledWidth = containerSize.width * currentScale
        return max(0f, (scaledWidth - containerSize.width) / 2f)
    }

    fun getMaxOffsetY(currentScale: Float): Float {
        val scaledHeight = containerSize.height * currentScale
        return max(0f, (scaledHeight - containerSize.height) / 2f)
    }

    fun claimOffsetX(x: Float, scale: Float): Float {
        val max = getMaxOffsetX(scale)
        return x.coerceIn(-max, max)
    }

    fun claimOffsetY(y: Float, scale: Float): Float {
        val max = getMaxOffsetY(scale)
        return y.coerceIn(-max, max)
    }

    Box(modifier =
        Modifier.fillMaxSize()
            .onSizeChanged { containerSize = it }
            .pointerInput(Unit) {
                detectTransformGestures { _, pan, zoom, _ ->
                    coroutineScope.launch {
                        val newScale = (scale.value + zoom).coerceIn(minScale, maxScale)
                        scale.snapTo(newScale)

                        offsetX.snapTo(claimOffsetX(offsetX.value + pan.x, newScale))
                        offsetX.snapTo(claimOffsetY(offsetY.value + pan.y, newScale))
                    }
                }
            }
            .pointerInput(Unit) {
                detectTapGestures(
                    onDoubleTap = { tapOffset ->
                        coroutineScope.launch {
                            val targetScale = if (scale.value < 2f) 2f else 1f
                            val scaleFactor = targetScale / scale.value

                            val containerCenter = Offset(
                                containerSize.width / 2f,
                                containerSize.height / 2f
                            )

                            val focalX = tapOffset.x - containerCenter.x - offsetX.value
                            val focalY = tapOffset.y - containerCenter.y - offsetY.value

                            val newOffsetX = (offsetX.value - focalX) * scaleFactor + focalX
                            val newOffsetY = (offsetY.value - focalY) * scaleFactor + focalY

                            val scaleAnim = launch { scale.animateTo(targetScale, tween(300)) }
                            val offsetXAnim = launch {
                                offsetX.animateTo(claimOffsetX(newOffsetX, targetScale), tween(300))
                            }
                            val offsetYAnim = launch {
                                offsetY.animateTo(claimOffsetY(newOffsetY, targetScale), tween(300))
                            }

                            scaleAnim.join()
                            offsetXAnim.join()
                            offsetYAnim.join()
                        }
                    }
                )
            }
            .pointerInput(Unit) {
                awaitEachGesture {
                    awaitFirstDown()
                    val velocityTracker = VelocityTracker()

                    do {
                        val event = awaitPointerEvent()
                        event.changes.forEach {
                            velocityTracker.addPosition(it.uptimeMillis, it.position)
                        }
                    } while (event.changes.any { it.pressed })

                    val velocity = velocityTracker.calculateVelocity()
                    coroutineScope.launch {
                        val targetX = offsetX.value + velocity.x * 0.2f
                        val targetY = offsetY.value + velocity.y * 0.2f

                        offsetX.animateTo(claimOffsetX(targetX, scale.value), tween(500))
                        offsetY.animateTo(claimOffsetY(targetY, scale.value), tween(500))
                    }
                }
            },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imagesRes),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(
                    scaleX = scale.value,
                    scaleY = scale.value,
                    translationX = offsetX.value,
                    translationY = offsetX.value
                )
        )
    }
}
