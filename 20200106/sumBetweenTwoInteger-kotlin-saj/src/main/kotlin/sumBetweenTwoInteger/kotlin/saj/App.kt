/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package sumBetweenTwoInteger.kotlin.saj

fun sumBetweenTwoInteger(a: Int, b: Int): Long {
    if(a==b) return a.toLong()

    val min = Integer.min(a,b)
    val max = Integer.max(a,b)

    return (min..max).sum().toLong()
}
