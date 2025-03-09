package me.thuanc177.kotsune

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform