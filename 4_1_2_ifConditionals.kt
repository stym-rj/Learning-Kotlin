fun main(){
    var x=54

    val value: Int=if(x==54){
        println("hellow bhai")
        30          //this will be assigned as the value of 'val value'. and this is always written at the last.
    }
    else{
        println("nikal yha se")
        40
    }

    println("value : $value")
}