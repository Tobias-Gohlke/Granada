package com.example.granada.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.granada.R

@Composable
fun StartScreen(onStartOrderButtonClicked: () -> Unit) {
    // Gradientenhintergrund
    val gradientBackground = Brush.verticalGradient(
        colors = listOf(Color(0xFF000000), Color(0x80000000))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBackground)
            .padding(top = 16.dp)
            .clip(RoundedCornerShape(32.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = false) // Ripple-Effekt für Feedback
            ) { onStartOrderButtonClicked() }
    ) {
        Image(
            painter = painterResource(id = R.drawable.startscreenpicture),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colorScheme.background, RoundedCornerShape(16.dp)) // Hintergrund mit Material-Design
                .shadow(5.dp, RoundedCornerShape(16.dp)) // Schatten für Tiefe
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = stringResource(R.string.app_description),
            textAlign = TextAlign.Center,
            style = typography.displaySmall, // Überarbeitete Textgröße
            color = Color.White,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp) // Gepaddet für bessere Lesbarkeit
        )
    }
}





@Preview
@Composable
fun StartOrderPreview(){
    StartScreen(
        onStartOrderButtonClicked = {},
    )
}