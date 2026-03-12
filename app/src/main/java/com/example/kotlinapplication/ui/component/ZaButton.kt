package com.example.kotlinapplication.ui.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZaButton(
    modifier: Modifier = Modifier,
    label: String = "Button",
    level: ZaButtonLevel = ZaButtonLevel.Primary,
    type: ZaButtonType = ZaButtonType.Highlight,
    onClick: () -> Unit,
    fullWidth: Boolean = false,
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
            ZaButtonType.Highlight -> LocalZaColors.current.linkPressed
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

    val textColor = when (level) {
        ZaButtonLevel.Primary -> when (type) {
            ZaButtonType.Neutral -> LocalZaColors.current.text1
            ZaButtonType.Danger -> LocalZaColors.current.dangerPressed
            else -> white100
        }
        ZaButtonLevel.Secondary ->  when (type) {
            ZaButtonType.Neutral -> LocalZaColors.current.text1
            ZaButtonType.Danger -> LocalZaColors.current.dangerSecondaryText
            else ->  LocalZaColors.current.primarySecondaryText
        }
        else -> when (type) {
            ZaButtonType.Neutral -> LocalZaColors.current.text1
            ZaButtonType.Danger -> LocalZaColors.current.tertiaryDangerText
            else ->  LocalZaColors.current.tertiaryHighlightText
        }
    }

    Button(
        modifier = modifier
            .then(
                if (fullWidth) Modifier.fillMaxWidth()
                else Modifier.width(120.dp)
            )
            .height(48.dp), onClick = { onClick() },
        shape = RoundedCornerShape(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isPressed) backgroundPressedColor   else backgroundColor,
        ),
        interactionSource = interactionSource,
    ) {
        Text(label, color = textColor, style = LocalZaTypography.current.textNormalM)
    }
}
