package io.github.vihangpatil.kotlin.modules.app

// import io.github.vihangpatil.java9modules.lib.impl.Circle
import io.github.vihangpatil.kotlin.modules.lib.inf.Shape
import io.github.vihangpatil.kotlin.modules.lib.inf.getShape

fun main() {

    // Circle and Square should be found, but Rectangle should not be found
    listOf("Circle", "Square", "Rectangle")
            .forEach { shapeName ->
                val shape: Shape? = getShape(shapeName)
                if (shape != null) {
                    println("Found ${shape.getName()}.")
                } else {
                    println("$shapeName implementation of Shape not found.")
                }
            }

    // This should fail at compile-time.
    // Circle should be runtime-only.
    // val shape: Shape = Circle()

//    println(shape.getName())
}