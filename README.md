# PM Conversion

Aplicación Android simple que demuestra la conversión de imágenes entre formatos, específicamente de JPG a PNG.

## Funcionalidad

La aplicación permite:
1. Cargar una imagen de ejemplo (actualmente hardcodeada como "android.jpg" en la carpeta de assets)
2. Convertir la imagen de formato JPG a PNG
3. Mostrar tanto la imagen original como la convertida en la interfaz de usuario

## Características técnicas

- Desarrollada en Kotlin
- Utiliza Jetpack Compose para la interfaz de usuario
- Manejo de imágenes con las APIs nativas de Android

## Librerías utilizadas

El proyecto utiliza las siguientes dependencias principales, las cuales ya vienen incluidas 
en el proyecto por defecto

- `androidx.core:core-ktx` - Extensiones de Kotlin para Android
- `androidx.lifecycle:lifecycle-runtime-ktx` - Componentes del ciclo de vida de Android
- `androidx.activity:activity-compose` - Integración de Activity con Compose
- `androidx.compose` - Componentes de UI modernos:
  - `androidx.compose.ui`
  - `androidx.compose.material3`
  - `androidx.compose.ui-tooling`
  - `androidx.compose.ui-test-junit4`
- `junit` y `espresso-core` para pruebas unitarias y de interfaz

## Permisos

La aplicación no requiere permisos especiales en el AndroidManifest.xml ya que solo trabaja con archivos en el almacenamiento interno de la aplicación.

## Estructura del proyecto

- `MainActivity.kt` - Actividad principal que contiene la lógica de la aplicación
- `AndroidManifest.xml` - Configuración de la aplicación y declaración de actividades
- Directorio `res/` - Recursos de la aplicación (layouts, strings, estilos, etc.)

## Cómo ejecutar

1. Clona el repositorio
2. Abre el proyecto en Android Studio
3. Sincroniza el proyecto con los archivos Gradle
4. Ejecuta la aplicación en un emulador o dispositivo Android


## Requisitos

- Android Studio Giraffe o superior
- Android SDK 21 o superior
- Kotlin 1.8.0 o superior

