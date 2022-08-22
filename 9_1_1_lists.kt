//lists in kotlin is immutable. so, once a list is created, it cant be mutated using by accessing with indexies.

fun main(){
    val names= listOf("satyam", "raj", "hello", "bro", 4)

    println(names[0])

    println("-------------------------------------")

    for(name in names){
        println(name)
    }

    println("-------------------------------------")
    
    names.forEach{
        println(it)
    }

    println("-------------------------------------")

    // names[0]="alag"             //cant be done since lists in kotlin are immutable.
}