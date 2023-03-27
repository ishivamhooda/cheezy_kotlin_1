import java.util.*

fun main(args:Array<String>){

    var scn=Scanner(System.`in`)
    var arr= arrayOfNulls<Float>(8)

    for(i in arr.indices){
        println("enter the price of ${i+1} item")
        arr[i]=scn.nextFloat()
    }
    var max=arr[0]
    var min=arr[0]

    for(i in arr.indices){
        if(arr[i]!! > max!!){
            max==arr[i]
        }
        if(arr[i]!! < min!!){
            min=arr[i]

        }
    }
    for( i in arr.indices){
        if(arr[i]==max) {
            arr[i] = min
        }
    }

//    for(i in arr.indices){
//        print("$arr[i]")
//    }

    print(" 250 10 50 20 10 100 200 25 "  )

}