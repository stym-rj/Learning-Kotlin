import kotlin.math.abs

fun main (){
    val list1=listOf(3,5,2,6,1,-3,6)

    println("the sorted list is: ${list1.sorted()}")
    println("inverted sorted list is : ${list1.sortedBy{-it}}")
    println("sorted in descending order: ${list1.sortedDescending()}")
    println("sorted by taking absolute value of elements: ${list1.sortedByDescending{abs(it)}}")

}