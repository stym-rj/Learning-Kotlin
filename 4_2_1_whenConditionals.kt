// 'when' is like 'switch' cases from other programming languages

//no need to add 'break' after each case here.
//default case (else block ) is necessery in kotlin.

fun main(){
    val name= "raj"

    when (name){        //switch(name)
        "satyam"->{         //case "satyam":
            println("naam shi h, aur naam h : $name")
        }
        "raj"->{        //case "raj":
            println("naam hai : $name")
        }
        "hello"->{      //case "hello":
            println("naam alag hai : $name")
        }
        else->{         //default case hai ye.
            println("match nhi kiya yaar")
        }
    }
}