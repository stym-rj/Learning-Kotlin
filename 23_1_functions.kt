fun trial1(){
    println("hello trail-1")
}

// fun trial2(){            //non return type cant return a return value
//     return 90
// }



fun trial3(a:Int, b: Int) : Int{
    return a+b
}

fun trial4(a:Int, b: Int){
    println("hello trial-4 $a $b")
}

fun trial5(a:Int, b:Int): Int=a+b       //for single line operational function.

fun trial6(b:Int, a:Int=5){             //default parameters. (default parameters are assigned at the last of the parameters)
    println("value of a : $a and value of b : $b")
}

fun trial7(a:Int, b:Int, c:Int):Int=(a*b)/c

fun main(){
    trial1()

    // var f=trial2()
    // println(f)

    var x=trial3(4,5)
    println(x)

    trial4(65,87)

    var v=trial5(78,34)
    println(v)

    trial6(4)

    var g=trial7(b=6, a=8, c=4)         //we can change the order of parameters by assigning the values to it as the the parameters variables name in the function.
    println(g)
}