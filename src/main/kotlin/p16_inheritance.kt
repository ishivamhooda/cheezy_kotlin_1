/*
inheritance
literal meaning =derive(a quality ,characteristics or predispositon)
genetically from one's parents or ancestors

1.it helps us in code reusability :eg phone (parent class bna la)
then feauture phone and smartphone can be derivded from it

2.we must use "open" keyword in front of parent class ,that is to
be inherited

ie we have to tell explicitly in kotlin that this class can be
used as parent by using open keyword
and : parent_class_name in front of child class
open class Phone(){   //parent class
}

class SmartPhone:Phone(){  //child class
}


4.child class cannot inherit from multiple classes

5.parent class constructor is called before child class constructor
by default

simple reason : child cannot exist without/before parent


we also called inheritance as :IS A relationship
car is a vehicle , truck is a vehicle , that means we can make vehicle as parent class

e also called inheritance as :superclass ,subclass
base class ,derived class
parent child
genralization and specializtion class




 */


fun main(){
    //here we called only child constructor and parent constructor
    //got called first then child
    val objChild=Child()    //this child()  is construcotr


    objChild.myMethod()  //inherited from parent
    objChild.myMethod2()




}
open class Parent{

    init {
        println("parents constructor is called ")
    }
    val name:String =""

    fun myMethod(){
        println("I am in parent")
    }
}

class Child :Parent(){

    init {
        println("child   constructor is called ")
    }

    val name2:String=""

    fun myMethod2(){

        println("I am in child ")
    }

}