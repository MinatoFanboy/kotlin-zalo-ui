package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class SelectorOptions(
    val enabled: Boolean = true,
    val selectEffectEnabled: Boolean = true,
    val color: Color = Color.Black.copy(alpha = 0.7f),
    val width: Dp = 0.5.dp,
    val alpha: Float = 0.5f
)

@Composable
fun ZaDatePickerWheelView(
    modifier: Modifier = Modifier,
    selection: Int = 0,
    itemCount: Int,
    isEndless: Boolean = true,
    onFocusItem: (Int) -> Unit,
    userScrollEnabled: Boolean = true,
    selectorOption: SelectorOptions = SelectorOptions(),
    lazyWheelState: LazyListState? = null,
    content: @Composable LazyItemScope.(index: Int, color: Color) -> Unit,
) {
    ZaDatePickerInfiniteWheelView(
        modifier = modifier,
        selection = selection,
        itemCount = itemCount,
        isEndless = isEndless,
        onFocusItem = onFocusItem,
        userScrollEnabled = userScrollEnabled,
        selectorOption = selectorOption,
        lazyWheelState = lazyWheelState
    ) { index, color ->
        content(index, color)
    }
}
