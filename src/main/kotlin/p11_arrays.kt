fun main(){
    /*
    if i want to store 50 favourite songs of a user
    defining 50 variables will be mess
    to solve these kinds of problems we have arrays

    object that stores MULTIPLE VALUES  of SAME TYPE
    fixed size

 val array = arrayOfNulls<IntArray>(0)


    var arr=arrayOf("one","two","three")

     */
    var arr=arrayOf("one","two","three")  //IMPLICITY DECLARATION
    var arr1=arrayOf(1,2,3)

    var arr3=arrayOf<Int>(3,4,5)

    //it will loop thru all the elemtn in arr
    for(i in arr){
        println(i)
    }

    //i want to print index as well
    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    //to access the particular  element in array  2 ways
    println(arr[0])
    println(arr.get(1))

    //we can also set value  arr.set(index, value)
    arr.set(0,"hello")
    println(arr[0])
    //to check the size
    println(arr.size)

    //if we ask beyound index  we ge index out of bound exception ,
    println(arr[4])


}