fun main(){
    val x=45

    val p=when(x){
        23->{
            println("hello")
            100
        }
        45->{
            println("bro")
            50
        }
        else->{           //this else block (default case) is necessery in kotlin's 'when' conditional.
            println("kuch nhi")
            0
        }
    }


    println("value of p is : $p")
}