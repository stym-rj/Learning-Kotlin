//higher order functions are those which takes functions as parameters.

fun main(){
    var fn: (a: Double, b: Double)-> Double=::sum
    println(fn(2.0, 4.0))
    calculator(5.0,5.0, ::sum)

    var funct=sum(4.6, 3.5)
    println(funct)
    calculator(4.7,3.6, ::sum)

}

fun sum(a: Double, b: Double): Double{
    return a+b
}

fun calculator(a: Double, b: Double, gn: (Double, Double)-> Double){
    val result= gn(a+32.4,b+32.4)
    println(result)
}