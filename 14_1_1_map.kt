fun main(){
    val list1=listOf(1,-3,5,3,-6,-8)
    println("double of the list1 is : ${list1.map{x->x*2}}")
    println("triple of the list1 is : ${list1.map{it*3}}")
}