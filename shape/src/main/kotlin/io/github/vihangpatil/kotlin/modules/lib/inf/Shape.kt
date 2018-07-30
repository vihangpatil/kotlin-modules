package io.github.vihangpatil.kotlin.modules.lib.inf

import java.util.*

interface Shape {
    fun getName(): String
}

fun getShape(shapeName: String): Shape? {
    return ServiceLoader
            .load(Shape::class.java)
            .firstOrNull { it.getName() == shapeName }
}