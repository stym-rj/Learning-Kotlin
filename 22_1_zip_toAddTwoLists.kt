fun main(){
    var x=listOf("a","b","c","d","e","f")
    var y=listOf(44,74,87)

    println("x to y:  ${x zip y}")
    println(" : ${x.zip(y){x, y -> "$x$y"}}")
}