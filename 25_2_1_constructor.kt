class Person(_name: String){            //constructor
    val name: String
    init {              //initialiser function
        name=_name
    }

}

fun main(){
    val p1=Person("satyam")
    println(p1.name)
}