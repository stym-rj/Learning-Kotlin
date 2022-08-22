fun main(){
    val a=4

    if(a in 1..6){          //instead of (a>=1 || a<=6)
        println("$a is in range of 1 to 6")
    }
    else{
        println("$a is not in range of 1 to 6")
    }


    if(a !in 1..10){
        println("$a is not in range of 1 to 10")
    }
    else{
        println("$a is in range of 1 to 10")
    }
}