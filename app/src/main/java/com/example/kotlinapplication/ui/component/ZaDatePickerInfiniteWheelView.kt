package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

@Composable
fun ZaDatePickerInfiniteWheelView(
    modifier: Modifier,
    selection: Int,
    itemCount: Int,
    isEndless: Boolean,
    onFocusItem: (Int) -> Unit,
    selectorOption: SelectorOptions,
    userScrollEnabled: Boolean = true,
    lazyWheelState: LazyListState? = null,
    content: @Composable LazyItemScope.(index: Int, color: Color) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    val haptic = LocalHapticFeedback.current

    val count = if (isEndless) itemCount else itemCount + 2 * 2
    val startIndex = if (isEndless) selection + (itemCount * 1000) - 2 else selection

    val state = lazyWheelState ?: rememberLazyListState()

    LaunchedEffect(startIndex) {
        state.scrollToItem(startIndex)
    }

    val isScrollInProgress = state.isScrollInProgress
    val focusedIndex = remember {
        derivedStateOf { state.firstVisibleItemIndex + 1 }
    }

    LaunchedEffect(key1 = isScrollInProgress) {
        if (!isScrollInProgress) {
            calculateIndexToFocus(state, 54.dp).let {
                val indexToFocus = if (isEndless) {
                    (it + 2) % itemCount
                } else {
                    ((it + 2) % count) - 2
                }

                onFocusItem(indexToFocus)
                if (state.firstVisibleItemScrollOffset != 0) {
                    coroutineScope.launch {
                        state.animateScrollToItem(it, 0)
                    }
                }
            }
        }
    }

    LaunchedEffect(state) {
        snapshotFlow { state.isScrollInProgress }
            .distinctUntilChanged()
            .collect { scrolling ->
                if (!scrolling && selectorOption.selectEffectEnabled) {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                }
            }
    }

    Box(
        modifier = modifier
            .height(270.dp)
            .fillMaxWidth(),
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .border(
                    width = 0.dp,
                    color = LocalZaColors.current.pageBackground3,
                    shape = RoundedCornerShape(8.dp)
                )
                .clip(RoundedCornerShape(8.dp))
        ) {
            Box(modifier = Modifier
                .height(54.dp)
                .background(LocalZaColors.current.pageBackground3)
                .fillMaxWidth())
        }

        LazyColumn(
            modifier = Modifier
                .height(270.dp)
                .fillMaxWidth(),
            state = state,
            userScrollEnabled = userScrollEnabled,
        ) {
            items(itemCount * 2000) {
                val scaleDegree = calculateIndexRotation(focusedIndex.value + 1, it)
                val opacityDegree = calculateIndexOpacity(focusedIndex.value + 1, it)

                Box(
                    modifier = Modifier
                        .height(54.dp)
                        .fillMaxWidth()
                        .graphicsLayer {
                            this.scaleX = scaleDegree
                            this.scaleY = scaleDegree
                            this.alpha = opacityDegree
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    if (isEndless) {
                        content(
                            it % itemCount,
                            if (opacityDegree == 1.0f) LocalZaColors.current.primary else LocalZaColors.current.text1
                        )
                    } else if (it >= 2 && it < itemCount + 2) {
                        content(
                            (it - 2) % itemCount,
                            if (opacityDegree == 1.0f) LocalZaColors.current.primary else LocalZaColors.current.text1
                        )
                    }
                }

            }
        }
    }
}

private fun calculateIndexToFocus(listState: LazyListState, height: Dp): Int {
    val currentItem = listState.layoutInfo.visibleItemsInfo.firstOrNull()
    var index = currentItem?.index ?: 0

    if (currentItem?.offset != 0) {
        if (currentItem != null && currentItem.offset <= -height.value * 3 / 10) {
            index++
        }
    }
    return index
}

private fun calculateIndexRotation(focusedIndex: Int, index: Int): Float {
    val currentIndex = focusedIndex - index

    val scale = when (currentIndex.absoluteValue) {
        0 -> 1.0f
        1 -> 8.toFloat() / 9
        2 -> 15.toFloat() / 18
        else -> ((18 - currentIndex.absoluteValue).toFloat() / 18).coerceAtLeast(0.5f)
    }

    return scale
}

private fun calculateIndexOpacity(focusedIndex: Int, index: Int): Float {
    val currentIndex = focusedIndex - index

    val opacity = when (currentIndex.absoluteValue) {
        0 -> 1.0f
        1 -> 0.7f
        2 -> 0.5f
        else -> 0.3f
    }

    return opacity
}