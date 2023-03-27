/*
overriding
 1.assi chiza(methods , behavioir ,property) jo mujja mera parents sa milli  ha
 but ma usma kuch change karna chayata hu

 eg mobile parent class ha jimsa property ha =size jo 5 inches ha as most mobiles are of 5 inches
 but i want to create a class of oneplus "mobile" jo mobile class ko inherit
  jiska size=6 inch kara ga , so oneplus ko size property chnage karni hogi


we have to make the method or property "open"  in order to make it overridable

way to overide is
1.open in parent class
2.override fun exact same name as parent class =different value

//suppose the parent class has paramterized constructor
//ie accept some parameter

//whenever we inherit from paramterized constructor class
//we must pass the parameter in child class as well
bcoz first parent class constructor will be called
 */

/*
suppose some methods are there in parent class and and i have overriden them in child class
and now i want that
whenever i call those methods ,both parent orginal  method and  child ka overriden method call ho
then we use SUPER keyword ,super.parent_method_name

super means superclass


we can also overide getter and setter methods as well




**********************************************&^%$#@
every kotlin class has ANY class as its superclass   just like object class in java

we can also overide its method
 */


fun main(){
val oneplusmob=OnePlus()
    oneplusmob.display()
    println()
    oneplusmob.makeCall()

    println()


    println(oneplusmob.toString())
}

open class mobile(){
    open val name:String="mobile"
     open val size:Int=5
    fun makeCall()=println("calling from mobile")
    fun powerOff()=println("shutting down")
    open fun display() =println("Simpe mobile display") //make it open just like class
}
class OnePlus:mobile(){

    override val name: String="One plus"
    override val size: Int=6
    override fun display(){
        super.display()
        println("one plus display")}

    override fun toString(): String {
        return " Name -$name - size -$size"
    }

    }



//shortcut to override
//put cursor and press alt+insert