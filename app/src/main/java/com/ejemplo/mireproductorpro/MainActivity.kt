package com.ejemplo.mireproductorpro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ejemplo.mireproductorpro.ui.theme.MiReproductorTheme
import com.ejemplo.mireproductorpro.ui.theme.DarkBackground
import com.ejemplo.mireproductorpro.ui.theme.DarkSurface
import com.mikepenz.iconics.compose.Image
import com.mikepenz.fontawesome_typeface_library.FontAwesome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiReproductorTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MI BIBLIOTECA",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        letterSpacing = 2.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = DarkSurface
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Aquí irá la lógica de seleccionar carpeta */ },
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                shape = RoundedCornerShape(16.dp)
            ) {
                // Icono FontAwesome: Carpeta con un "+"
                Image(
                    asset = FontAwesome.Icon.faw_folder_plus,
                    contentDescription = "Añadir carpeta",
                    modifier = Modifier.size(24.dp)
                )
            }
        },
        containerColor = DarkBackground
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Icono FontAwesome grande para estado vacío
            Image(
                asset = FontAwesome.Icon.faw_music,
                contentDescription = "Sin música",
                modifier = Modifier.size(80.dp),
                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(MaterialTheme.colorScheme.onBackground.copy(alpha = 0.2f))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Tu biblioteca está vacía",
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Toca el botón + para agregar una carpeta",
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
                fontSize = 14.sp
            )
        }
    }
}
