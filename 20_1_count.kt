fun main(){
    val  numbers= listOf(3,5,2,6,-3,6)

    println("total elements in numbers : ${numbers.count()}")
    println("elements that are even: ${numbers.count{it%2==0}}")
}