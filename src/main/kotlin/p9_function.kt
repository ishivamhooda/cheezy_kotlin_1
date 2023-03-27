fun main(){
    /*
    function is a block of code to perform certain functionality
    it helps to reuse the code

    fun methodname{
    block of code
    }
    whenver we need this method ,i will call it

     fun methodname(parameter1,parameter2..):Return type{
    //block of code
    return result
    }

     */


    //fun call

    val result=add(1,2)
    println(result)

    val result1=add(3,4)
    println(result1)


    val result2=add1(5,6)
    println(result2)

    oddOrEven(12)
    oddOrEven(11)

    printMessage()  //it will print by default
    printMessage(5)

}

fun add(num1:Int,num2:Int):Int{
    val sum=num1 + num2
    return sum
}

//we can also make inline function
fun add1(num1:Int,num2:Int):Int=num1 + num2




fun oddOrEven(num1 :Int) : Unit {   //when fun does not return anything ,
// it return can be callled ""unit" type  ,here unit is wrtiten in dull ,
// bcoz kotlin samaja gya ha , fun does nto have any result type , so "unit" is reducdant
    val result = if (num1 % 2 == 0) "even" else "odd"
    println(result)

}

     //default argument  ie if not argument passed then function take default arguemtn

    fun printMessage(count:Int = 2){   //count is called parameter
        // count have bydefault value of 2 , if not value given , if given it take what is given

        //count=3   this line will show error BCOZ PARAMETER ARE OF TYPE VAL , they cant be reassigned
         for(i in 1..count){
             println("Hello $i")
         }
    }



