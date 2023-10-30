package com.example.granada.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.granada.data.Options

@Composable
fun OptionsScreen(
    options: List<Options>,
    onCardScreenPressed: (Options) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
    ) {
        items(options) { options ->
            OptionsListItem(
                options = options,
                selected = false,
                onCardClick = onCardScreenPressed,
                modifier = Modifier
            )
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionsListItem(
    options: Options,
    selected: Boolean,
    onCardClick: (Options) -> Unit,
    modifier: Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.medium,
        onClick = { onCardClick(options) },
        colors = CardDefaults.cardColors(
            containerColor = if (selected)
                MaterialTheme.colorScheme.primaryContainer
            else
                MaterialTheme.colorScheme.secondaryContainer
        ),
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Das Bild ausfüllen
            Image(
                painter = painterResource(id = options.picture),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )

            // Text über das Bild legen
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = options.placeNameResId),
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White // Textfarbe anpassen
                )
                Text(
                    text = stringResource(id = options.descriptionResId),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White // Textfarbe anpassen
                )
            }
        }
    }
}


