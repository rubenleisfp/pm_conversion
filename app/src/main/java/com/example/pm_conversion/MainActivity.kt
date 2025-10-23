package com.example.pm_conversion

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import java.io.File
import java.io.FileOutputStream

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageTransformApp()
        }
    }
}

@Composable
fun ImageTransformApp() {
    val context = LocalContext.current
    var originalBitmap by remember { mutableStateOf<Bitmap?>(null) }
    var convertedBitmap by remember { mutableStateOf<Bitmap?>(null) }
    val imageDir = context.filesDir

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text("Conversión de imagen PNG → JPG", style = MaterialTheme.typography.titleLarge)

        Button(onClick = {
            // 1️⃣ Simulamos carga de una imagen desde el almacenamiento interno o assets
            val inputStream = context.assets.open("android.jpg")
            val bitmap = BitmapFactory.decodeStream(inputStream)
            originalBitmap = bitmap

            // 2️⃣ Guardamos la versión PNG
            val outputFile = File(imageDir, "android_convertida.png")
            val output = FileOutputStream(outputFile)
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, output)
            output.close()

            // 3️⃣ Leemos la imagen convertida
            val converted = BitmapFactory.decodeFile(outputFile.absolutePath)
            convertedBitmap = converted
        }) {
            Text("Convertir imagen")
        }

        originalBitmap?.let {
            Text("Original (JPG)")
            Image(bitmap = it.asImageBitmap(), contentDescription = null, modifier = Modifier.size(150.dp))
        }

        convertedBitmap?.let {
            Text("Convertida (PNG)")
            Image(bitmap = it.asImageBitmap(), contentDescription = null, modifier = Modifier.size(150.dp))
        }
    }
}
