fun main(){
    var names=listOf("satyam", "raj", "hello", "bro", "kuch nhi")

    println("the last word starting with \"br\" : ${names.findLast{it.startsWith("br")}}")
}