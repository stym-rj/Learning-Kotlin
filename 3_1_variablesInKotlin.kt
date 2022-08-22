fun main(){
    var x: Int=5            //'var' are mutable variables.
    println("$x")

    var x1=56               //this will also be treated as int. no need to write "var x: Int=5".
    println("$x1")


    val y: Int=10               //'val' are unmutable variables.
    val y1=68
    println("$y  $y1")


    x = 45            //this wont throw error as x is a 'var'
    // y=32            //this will throw error as y is a 'val' and cant be mutated.
    println("$x")

    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    print(c)

}