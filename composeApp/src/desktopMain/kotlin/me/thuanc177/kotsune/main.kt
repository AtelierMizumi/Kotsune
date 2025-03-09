package me.thuanc177.kotsune

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kotsune",
    ) {
        App()
    }
}