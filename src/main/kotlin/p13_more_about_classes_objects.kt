fun main(){

    /*

    why do we need classes : to make user defined data type , to store complex data
    eg
    var age:Int =10

    what if we want to store info abount student or car or account do we have any data type for that

    var myCarc: Car =info about car


    properties of class :store data
    function : work on that data

    real world example

    cookies cutter=class
    cookies =acutal object
     */

    var i :Int =20            //property ki value 20 ka basis pa nicha wala fun behave kara ga
    println(i.plus(30))
    println(i.toFloat())

    var p1=Person("A",21)
    var p2=Person("B",17)

    println(p1.canVote())
    println(p2.canVote())


}
class Person(val name:String,var age:Int) {   //properties

    //methods
    fun canVote():Boolean {
        return age>18
    }
}