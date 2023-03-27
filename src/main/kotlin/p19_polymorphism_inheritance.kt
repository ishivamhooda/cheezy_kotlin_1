///*
//polymorphism
//
//poly means many and morph means form
//in computer science ,it is defined as----method name is same but it will behave differently based on object
//
//
//polymorphism and inheritance
//1.is a relationship :jaha b aya ga :it is inheritance  eg circle is a shape
//2.so whenever shape is required ,we can use any of sub classes ie we can easily pass circle , square or triangle
//because they all inherit from shape
//
//
//but we cannot pass shape object where circle is required.because all shapes are not circle
//
//
//
// */
//
//fun main(){
//val shape=Shape()
//    printArea(shape)
//}
//
//fun printArea(shape:Shape){
//    println(shape.area())
//}
//
//open class shape{
//  open fun area() :Double =0.0
//}
//
//class circle(val radius:Double):Shape(){
//    override fun area(): Double =Math.PI *radius * radius
//    }
//
//class square(val side:Double):Shape(){
//    override fun area() :Double =side*side
//}
//
//class Trinagle(val base:Double,val height:Double):Shape(){
//    override fun area() :Double =0.5 * base * height
//}
