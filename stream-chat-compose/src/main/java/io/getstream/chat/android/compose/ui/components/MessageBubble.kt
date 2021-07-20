package io.getstream.chat.android.compose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import io.getstream.chat.android.compose.ui.theme.ChatTheme

/**
 * Wraps the content of a message in a bubble.
 *
 * @param content - The content of the message.
 * @param modifier - Modifier for styling.
 * @param color - The color of the bubble.
 * @param shape - The shape of the bubble.
 * */
@Composable
fun MessageBubble(
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    color: Color = ChatTheme.colors.cardBackground,
    shape: Shape = ChatTheme.shapes.messageBubble
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        border = BorderStroke(1.dp, Color.LightGray),
    ) {
        content()
    }
}