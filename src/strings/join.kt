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
