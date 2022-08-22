fun main(){
    var list1=listOf<Int>(1,3,6,3,7,4,9,3)
    println("minimum of list1 is : ${list1.minOrNull()}")

    var list2=emptyList<Int>()
    println("min of list2: ${list2.minOrNull()}")

    var list3=listOf(3)
    println("min of list3: ${list3.minOrNull()}")
}