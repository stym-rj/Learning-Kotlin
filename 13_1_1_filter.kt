fun main(){
    val numbers=listOf(1, 3,5,-2,-1, 6,3,-9)
    println("all positive numbers : ${numbers.filter{it>0}}")
    println("all positive numbers : ${numbers.filter{x->x>0}}")

    println("all negative numbers : ${numbers.filter{it<0}}")
    println("all negative numbers : ${numbers.filter{x->x<0}}")
}