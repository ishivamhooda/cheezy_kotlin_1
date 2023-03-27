fun main(){
    //range ,untill  , when statement and expression

    //range
    var number=5
    val result=number in 1..5  // in keyword ma upper bound included ie 1,2,3,4,5
    println(result)

    val result1=number in 1 until 5  // until keyword ma upper bound  not included  ie 1,2,3,4
    println(result1)


    //when is like switch  , ie when we have complex if else if loop , then we use when  ,when make code more readable
    //when (condition)  or when(name of variable) {
    //  "value of variable" -> statement }

    val animal1="dog1"
    if(animal1=="horse"){
        println("animal is horse")
    }else if(animal1=="cat"){
            println("animal is horse")
    }else if (animal1=="dog")
    {
        println("animal is dog")
    }else{
        println("animal not found")
    }

    val animal="Dog"
    when(animal){
        "Horse" -> println("animal is horse")
        "cat" -> println("animal is cat")
        "Dog" -> println("animal is dog")
        else -> println("animal not found")
    }


    //when can also be used as an expression
    val number1=15
    val result2=when(number1){
        11 ->"eleven"
        12 ->"twelve"
        in 13..19-> "teen"    //range can also be used
        else -> "not in range"
    }
    println(result2)

}
