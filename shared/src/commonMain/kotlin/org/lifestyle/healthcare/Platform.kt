package org.lifestyle.healthcare

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform