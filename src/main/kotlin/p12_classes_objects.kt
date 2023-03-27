fun main(){
/*
oops is a paradign which allows us to solve problems with the help of objects which represents the real world entities
eg i want to service my car , i go to car mechanic , and he repair my car with many objects , so i , my car , mechanic are all real world
object to solve the real world problem (car service)

in oops we make set of objects which interact to solve problems . we have classes to make those objects  ,these objects are real world entities
eg i want to make mobiles , first i need to have blue print (color , size , battery type , features)

class is a blueprint or template
objeects are real thing
you can create objects in your program and they interact with each other to complete the work

***design a class
we make classes based on  what objects we need

1.property or field (objects knows)
2.methods(object does)
class --->>> objects

eg 1 : switch == ison , color , company , on , off
eg 2 :second hand car selling website ==name , type , price , year ,display(),get ownerdetails
eg3 :youtube video : ==titile , channel name ,duration , published date , play(),pause()
class == blueprint


making class

class class_name(properties ){
class functions
}

making  objects
val object_name=Classname(value of property)

accessing objects property and methids
. operator eg object name.property


 */

    val mustang=Car("mustang","petrol",100)
    val bettle=Car("bettle","diesel",200)


    println(mustang.name)
    println(mustang.type)

    println(bettle.name)

    mustang.driveCar()

}

class Car(val name:String,val type :String , var kmRun :Int) {   //properites

    fun driveCar() {   //class methods  , methods are also called function
        println("$name  car is driving ")
    }

    fun applyBreakes() {
        println("Applied breakes")
    }
}