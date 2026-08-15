// Kök proje build dosyası. Modüllere ortak plugin sürümlerini bildirir,
// başka hiçbir şey yapmaz.
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "1.9.24" apply false
}
