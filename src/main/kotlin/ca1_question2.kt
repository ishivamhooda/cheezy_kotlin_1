import java.util.*

fun main(args:Array<String>){
    var scn=Scanner(System.`in`)
    var arr= arrayOfNulls<Float>(5)

    for(i in arr.indices){
        println("enter the price of ${i+1} product")
        arr[i]=scn.nextFloat()
    }

    for(i in arr.indices){
        if(arr[i]!! > 100){
            arr[i] = arr[i]!! - arr[i]!! *1/5
        }
    }
    var sum=0.0

    for(i in arr.indices){
        sum=sum + arr[i]!!
    }
    println("the final amount is : Rs $sum")
}