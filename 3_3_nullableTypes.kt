//there are two types of variables : 1- null types                2- non-null types

fun main(){
    var name: String?=null              //this '?' defines that the string is of 'null type string'     // in kotlin, null is written as 'null' and not as 'NULL' or 'Null'
    println("$name")


    if (name!=null){
        println("byeeeeeeeeee $name")
    }



    
    name="satyam"

    if (name!=null){
        println("hello $name")
    }
}