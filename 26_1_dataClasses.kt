data class User(val name: String, val id: Int)

fun main(){
    val user1= User("satyam", 1)
    println(user1)

    val user2=User("satyam", 1)
    val user3=User("raj", 2)

    println("user1 == user2 : ${user1==user2}")         //this means if data inside user1 and user2 are same
    println("user1 === user2 : ${user1===user2}")        //this means if user1 and user2 is same(means same reference).

    println(user1.hashCode())
    println(user3.hashCode())

    //copy() function
    println(user1.copy())
    println(user1.copy("Raj"))
    println(user1.copy(id=2))

    println("name= ${user1.component1()}")
    println("id= ${user1.component2()}")
}