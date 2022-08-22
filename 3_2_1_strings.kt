fun main(){
    var name: String="satyam"
    var name2="hello"               //automatically detects as string.

    println("$name $name2")
    
    
    
    // name2=4             //throws error as the variable name2 is defined as string before.
    name2="boi"
    name="haha"
    println("$name $name2")
}