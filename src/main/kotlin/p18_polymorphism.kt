/*
we will make reference of parent class but we will store objects of child classes
but here we have to explicitly(khol ka) type the objeect

parent can hold a reference to its child
 and call methods of its child classes(which are common)

 eg shape = circle ,square
just see claases as data type and object as variable
like int x=10


EXPLICITY


var language: String = "French"
val score: Int = 95


advantages
helps to write maintianble and extensible code
helps in interacting with objects via common interface
 */



fun main(){
    //explicitly declare
    //val variable name :type =constrcutor
    val circle:Circle=Circle(4.0)
    val Square:Square=Square(4.0)
    println(circle.area())
    println(Square.area())
    //since circle and square is  a shape , we can replace its name with shape
    //bcoz of polymorphism
    val circle1:Shape=Circle(5.0)
    val Square1:Shape=Square(5.0)

    println(circle1.area())
    println(Square1.area())
    println()


val shapes= arrayOf((Circle(3.0)),Square(4.0),Triangle(3.0,4.0))
calculateAreas(shapes)



}
//all shapes will be passed ,it will automaicaaly see which area to be used according to objects
fun calculateAreas(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}


open class Shape(){
    open fun area() :Double {
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){
    override fun area():Double {
        return  Math.PI*radius *radius
    }
}

class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}


class Triangle(val base:Double,val height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
}
