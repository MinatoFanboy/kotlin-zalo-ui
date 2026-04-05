package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.kotlinapplication.ui.theme.LocalZaColors
import com.example.kotlinapplication.ui.theme.LocalZaTypography
import com.example.kotlinapplication.ui.theme.white100

enum class ZaButtonLevel {
    Primary,
    Secondary,
    Tertiary,
}

enum class ZaButtonType {
    Highlight,
    Danger,
    Neutral,
}

enum class ZaButtonSize {
    Large,
    Medium,
    Small,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaButton(
    modifier: Modifier = Modifier,
    label: String = "Button",
    level: ZaButtonLevel = ZaButtonLevel.Primary,
    type: ZaButtonType = ZaButtonType.Highlight,
    size: ZaButtonSize = ZaButtonSize.Large,
    onClick: () -> Unit,
    fullWidth: Boolean = false,
    iconPrefix: String = "",
    iconSuffix: String = "",
    defaultPressed: Boolean = false,
    enabled: Boolean = true,
    loading: Boolean = false
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val backgroundColor = when (level) {
        ZaButtonLevel.Primary -> when (type) {
            ZaButtonType.Highlight -> LocalZaColors.current.primary
            ZaButtonType.Danger -> LocalZaColors.current.danger
            else -> Color.Transparent
        }

        ZaButtonLevel.Secondary -> when (type) {
            ZaButtonType.Highlight -> LocalZaColors.current.secondary
            ZaButtonType.Danger -> LocalZaColors.current.dangerSecondary
            else -> LocalZaColors.current.uiBackgroundPressed
        }

        ZaButtonLevel.Tertiary -> Color.Transparent
    }

    val backgroundPressedColor = when (level) {
        ZaButtonLevel.Primary -> when (type) {
            ZaButtonType.Neutral -> LocalZaColors.current.uiBackgroundPressed
            ZaButtonType.Danger -> LocalZaColors.current.dangerPressed
            else -> LocalZaColors.current.linkPressed
        }

        ZaButtonLevel.Secondary -> when (type) {
            ZaButtonType.Highlight -> LocalZaColors.current.secondaryHighlightPressed
            ZaButtonType.Danger -> LocalZaColors.current.secondaryDangerPressed
            else -> LocalZaColors.current.secondaryNeutralPressed
        }

        ZaButtonLevel.Tertiary -> when (type) {
            ZaButtonType.Highlight -> LocalZaColors.current.tertiaryPressed
            ZaButtonType.Danger -> LocalZaColors.current.tertiaryDangerPressed
            else -> LocalZaColors.current.uiBackgroundPressed
        }
    }

    val textColor = if (enabled) {
        when (level) {
            ZaButtonLevel.Primary -> when (type) {
                ZaButtonType.Neutral -> LocalZaColors.current.text1
                else -> white100
            }

            ZaButtonLevel.Secondary -> when (type) {
                ZaButtonType.Neutral -> LocalZaColors.current.text1
                ZaButtonType.Danger -> LocalZaColors.current.dangerSecondaryText
                else -> LocalZaColors.current.primarySecondaryText
            }

            else -> when (type) {
                ZaButtonType.Neutral -> LocalZaColors.current.text1
                ZaButtonType.Danger -> LocalZaColors.current.tertiaryDangerText
                else -> LocalZaColors.current.tertiaryHighlightText
            }
        }
    } else {
        LocalZaColors.current.text3
    }

    val buttonHeight = when (size) {
        ZaButtonSize.Large -> 48.dp
        ZaButtonSize.Medium -> 40.dp
        else -> 32.dp
    }

    val buttonMinWidth = when (size) {
        ZaButtonSize.Large -> 72.dp
        ZaButtonSize.Medium -> 48.dp
        else -> 24.dp
    }

    val buttonPadding = when (label) {
        "" -> 12.dp
        else -> {
            when (size) {
                ZaButtonSize.Small -> 16.dp
                else -> 24.dp
            }
        }
    }

    Button(
        modifier = modifier
            .then(
                if (fullWidth) Modifier.fillMaxWidth()
                else {
                    if (label.isNotEmpty()) {
                        Modifier
                    } else {
                        Modifier.width(48.dp)
                    }
                }
            )
            .height(buttonHeight)
            .defaultMinSize(minWidth = 0.dp, minHeight = 0.dp),
        contentPadding = PaddingValues(0.dp),
        enabled = enabled && !loading,
        onClick = { onClick() },
        shape = RoundedCornerShape(buttonHeight),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isPressed || defaultPressed) backgroundPressedColor else backgroundColor,
            disabledContainerColor = if (loading) backgroundPressedColor else LocalZaColors.current.uiBackgroundDisabled,
        ),
        interactionSource = interactionSource,
    ) {
        Row(
            modifier = Modifier.padding(horizontal = buttonPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.then(
                    if (label.isNotEmpty()) {
                        Modifier.defaultMinSize(buttonMinWidth)
                    } else {
                        Modifier
                    }
                ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                if (loading) {
                    CircularProgressIndicator(
                        color = white100, strokeWidth = 3.dp, modifier = Modifier.size(24.dp)
                    )
                } else {
                    if (iconPrefix.isNotEmpty()) {
                        ZaIcon(iconPrefix, color = textColor)

                        Spacer(Modifier.width(8.dp))
                    }

                    if (label.isNotEmpty()) {
                        Text(
                            label,
                            color = textColor,
                            style = if (size == ZaButtonSize.Small) LocalZaTypography.current.textSmallM else LocalZaTypography.current.textNormalM
                        )
                    }

                    if (iconSuffix.isNotEmpty()) {
                        Spacer(Modifier.width(8.dp))

                        ZaIcon(iconSuffix, color = textColor)
                    }
                }
            }
        }
    }
}
