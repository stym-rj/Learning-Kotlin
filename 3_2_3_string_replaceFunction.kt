fun main(){
    val s1="hello"
    println(s1)

    s1.replace("hello", "this is cool")
    println(s1)

    val s2="${s1.replace("cool", "bad")}"
    println("$s2")

    val s3="${s1.replace("cool", "hot")}, and cool at the same time"
    println("$s3")
}