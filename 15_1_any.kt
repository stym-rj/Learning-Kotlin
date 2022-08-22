fun main(){
    var list1=listOf(1,3,-5,-3,6,4,9)
    println("is there any number less than 0 : ${list1.any{it<0}}")       //tells if list has number smaller than  0.
    println("is there any number greater than 10 : ${list1.any{it>10}}")      //tells if list has number greater than 10
}