// Compiler will generate a JavaClass StringFunctions as opposed to StringKt
@file:JvmName("StringFunctions")
package strings

import java.lang.StringBuilder

/**
 * Utility function
 */
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "[",
    suffix: String = "]"
): String {
    val buffer = StringBuilder(prefix)
    for( (index, element) in collection.withIndex() ) {
        if (index > 0) buffer.append(separator)
        buffer.append(element)
    }
    buffer.append(suffix)
    return buffer.toString()
}

/**
 * Extension property over class String
 */
val String.firstChar: Char
    get() = get(0)

/**
 * Example of an extension function. This cannot be overridden
 */
fun String.lastChar() : Char = get(length -1)
