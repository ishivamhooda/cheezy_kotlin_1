fun main(){

    //for loop used when we know number of iteration
    for(i in 1..5){ // here increment is by 1   //1 2 3 4 5
        print(i)
    }
     println("\tsimple")
    for(i in 1..5 step 2){  //here counter increase by two   //1  3  5
        print(i)
    }
    println("\tstep")
    for(i in 1 until 5){  //here counter increase by two   //1 2 3 4
        print(i)
    }
    println("\tuntil")
  //************************************reverse loop
    for(i in 10 downTo 1){
        print(i)
    }
    println("\tdown to ")



    for(i in 10 downTo 1 step 3) {
        print(i)
    }
    println("\tdown to and step")


    //wap to print table
    val number=2
    for(i in 1..10){
        print(number * i)
    }
    println(" well formatted table")

    for(i in 1..10){

        //2 x 1 =2
        //2 x 2 =4
        //print(number + " x "+ i + " = " + (number * i))  //number is int type  and we appended string and kotlin is strictly type so we need to convert
        print(number.toString() + " x "+ i + " = " + (number * i))

        //not nicely readable
        //so we use string templating  ,whenever we need to refer to a varibable in string , we use $ symbol in front of it's name
        //for evaluating an expression , we need to use ${expression}  , curly braces as well
        println("$number x $i =  ${number *i}")  // it is more readable

        //to covert any format just type to_desiredformat  number.toString()
    }

}
