fun main(){
    var list1=listOf("satyam", "raj", "hello" , "bro")
    println("first occurance of word that starts with \"hell\" : ${list1.find{it.startsWith("hell")}}")
    println("first occurance of word that starts with \"boi\" : ${list1.find{it.startsWith("boi")}}")
}