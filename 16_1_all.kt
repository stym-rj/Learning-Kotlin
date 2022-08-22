fun main(){
    var list1=listOf(1,3,5,-6,2,1)
    println("are all numbers even: ${list1.all{it%2==0}}")
    println("all numbers are less than 6 : ${list1.all{it<6}}")
}