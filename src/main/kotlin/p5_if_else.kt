fun main(){
    val isRaining=true
//if(condition)  , here condition should be boolean
    if(isRaining==true){  // if(isRaining) better
        println("take umbrella")
    }
    else{
        println("enjoy the day no rain")
    }

    //if else if
    val x=10
    val y=14

    if(x >y) {
        println("x is greater than y ")
    }
    else if(x<y)

    {
        println("x is less than y")
    }else{
        println("x is  equal to y1")
    }

    //in kotlin we can use if.else as an expression also

    val x1=10
    val y1=14
    val result= if(x1 >y1) {
        "x is greater than y "
    }
    else if(x1<y1)

    {
        "x1 is less than y1"
    }else{
        "x1 is  equal to y "
    }

    println(result)


    val number1=21
    val result1=if(number1 %2==0) "Even" else "odd"   //if as an expression and if else loop
    println(result1)

}

