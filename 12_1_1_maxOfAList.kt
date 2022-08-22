fun main(){
    var list1=listOf<Int>(1,3,6,3,7,4,9,3)
    println("maximum of list1 is : ${list1.maxOrNull()}")

    var list2=emptyList<Int>()
    println("max of list2: ${list2.maxOrNull()}")

    var list3=listOf(3)
    println("max of list3: ${list3.maxOrNull()}")
}