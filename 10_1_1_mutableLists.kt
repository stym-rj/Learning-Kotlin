fun main(){
    val names= mutableListOf("satyam", "raj", "hello", "bro",1)

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

    names[0]="alag"             //can be done since mutableLists in kotlin are mutable.

    names.forEach{
        println(it)
    }
}