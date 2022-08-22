fun main(){
    var list1=listOf(3,6,2,9,-3,-1)
    println("if all numbers are even : ${list1.none{it%2==1}}")
    println("if no number is greater than 10 : ${list1.none{it>10}}")
}