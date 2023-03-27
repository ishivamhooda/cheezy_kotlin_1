fun main(){
/*default constructor
 whenever we define a class and we don't define a constructor ,kotlin by default adds a constructor
 that constrcutor is parameter less ,constrcutor


  //lateinit
  kotlin was mainly formed to reduce runtime errors
  so it is a rule in kotlin that ,whenever we define any property of class it must be initilzed

  but sometimes we dont know the initial value , so we have a method to say :baad ma initlaize kara ga
   it is called  lateinit

  rules for it
  1.lateinit should only be var and never val
  2.and int float boolean


  //getter and setters
  setters :
  sometime we may assign the wrong value to property using . operator , like age can't be negative
  so setter method validate the value before assigning

  jisbi property ka setter use karna ho , uska just nicha setter liko
  see below code
  field is a keyword that seets value

  so setter is used to set valid value in varibale

  getter:

  use to get and value and perform ooperaitosn
  jisbi property ka setter use karna ho , uska just nicha setter liko
  see below code
  field is a keyword that gets value

whenever we make a property and dont add getter and setter
kotlin by default add getter and setter method to it



 */
    //default constructor
    var ob=Calculator()
    println(ob.add(3,5))

    val p1=Person1("shivam",21)
    println(p1.age)  //using dot operator we get the value
    p1.age=23        //using dot operator we set the value
    p1.age=-12
    println(p1.name)

}
class Calculator(){

    // this will give error ,as it is not initalized
    // var message:String

    lateinit var message:String
    fun add(a:Int,b:Int):Int{
        return a+b
    }

    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}

//for getter and setter

    class Person1(nameParam:String ,ageParam:Int){
    var name:String=nameParam
     get() {
         println("name getter is called")
         return field.toUpperCase()
     }

    var age:Int =ageParam
        //setter
        set(value) {
            if(value>0){
                field=value
            }
            else
            {
                println("age can't be negative")
            }
        }
    }
