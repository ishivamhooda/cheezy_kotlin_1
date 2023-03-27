import kotlin.math.pow

fun main(){
    /*
    function overloading
    same name different paramters
    1.either number or parameters is different
    2.or type is different
     */
    println(addition(1,2))
    println(addition(2.4,3.4))


    /*suppose our function accepts 100 or arguments like addition(3,4,5,6,7,8,9,2,4,3,1)
    it would be difficult to map a , b , c ki ka value ha
    so we have NAMEED ARGUMENTS METHODS IN KOTLIN LIKE
     */
    println(addition(a=5,b=6))
    println(addition(b=5,a=8))  //we can change sequence as well


    //in kotlin we store function as well in varibale  , not only values
    //syntax hoga  , var fun_name= :: fun

    var fn=::subtract
    println(fn(5.4,4.0))

    var gn=::power
    println(gn(2.0,10.0))

}

fun addition(a:Int ,b:Int):Int{
    return a+b
}
fun addition(a:Double  ,b:Double):Double{
    return a+b
}

fun subtract(a:Double  ,b:Double):Double{
    return a-b
}

fun power(a:Double,b:Double):Double{
    return a.pow(b)
}


