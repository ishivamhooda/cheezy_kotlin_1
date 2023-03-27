/*
abstract is something not defined or or is complete

ek shape ha usko area print kar do , but your dont know the shape

abstract  methods : whose methods whose body is not/cant be defined
or we want that their subclasses should define the abstract method
jitni be iski inherited classes vo us abstract method ko define kara gi



 abstract assi chiza ha ==jo abhi define nhi ha ,vo child classes define kara gi
 generally abstract class is parent class ,jaha pa jo iski child classes ho vo inski proepryt define kara gi

*******we cannot make object of abstract class
or abstract class can not be instantiated  bcoz complier does not know how to calls its method
area method ki ka body ha ,usko ka execute karna ha

 by default all the abstract method are open , we dont need to wirte open alag sa


 we override the abstract method in child classes to give them body



abstract
1.class cant be instantiated
2.abstract class can have both abstract non abstract properties and methods
3.if a class has abstract method or property then class must be declared as abstract

we delcare a class abstract when we want ki usko koi b instance   na kar ska
 */









fun main(){
    // abstract class cannnot be instanisted
//val shape=Shape1()
//    println(shape.area())
//    shape.display()

     val circle=Circle1(4.0)
    println(circle.area())
    circle.display()

}
abstract class Shape1{
//    var name:String=""
//    open fun area() :Double =0.0
//    open fun display() =println("Shape is getting displayed")

    var name:String=""
    abstract fun area() :Double
//    abstract fun area() :Double =0.0  //will give error ,we cannot define the body of abstract class  bco z uska pata hi nhi ha + class shoudl also be abstract
    abstract fun display()
}


 class Circle1(val radius:Double) :Shape1() {
    override  fun area():Double = Math.PI*radius * radius
     override fun display(){
        println("circle is getting printed")
    }
}
