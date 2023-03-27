fun main(){

    /*
    constructor
    =classes has 2 things -property and methods
    =constructor is used to initialize object and provide default values to properties


    class Person(val name:String,var age:Int) {   //properties

    //methods
    fun canVote():Boolean {
        return age>18
    }


    (val name:String,var age:Int) portion : is called constructor  ,primary constructor


   whenever we want that whenever we want make object certain set of instructions shoudl execute without even calling object ,just by creating object
   we use initalizer block
   init{

   }

  we can have multiple init blocks



  secondary constructor
  we know that no of tyres =4 and max seating capacity =5 ,so we dont need to pass them againa and agiain

       there is rule in kotlin that whenever we make secon constr ,we have to call primary const


     */

    var car =Automobile("car",4,5)

    var person=person()
    println(person.age ) //it will print 0
    println(person.name) // it will print empty string





    var person2 =personmore("b",18)
    println(person2.age)
    println(person2.name)

//after secondary constructor we can stop giving tyres and max seat output and we will not get any error
    //this below code with  call seconday constructor which will call primary constructor using this keyword
    var car1=Automobile1("car1","petrol")

}
//constructor
class Automobile(val name:String ,val tyres:Int,val maxSeating:Int){
    init {
        println("$name is created")
    }
    fun drive(){}
    fun applyBrakes(){}
}

//here we dont have any option to initlaize the property of person class
class person(){

    val name:String =""
    var age:Int =0
}
//here we can initalize the property of class by parameters
//here we have an benefit that we can do some operation with value of paramter
//like print hello  with name

class personmore(nameParam :String,ageParam:Int){

    val name:String ="hi $nameParam" //operation
    var age:Int =ageParam
}

//secondary constructor
class Automobile1(val name:String ,val tyres:Int,val maxSeating:Int,val engineType:String){
    init {
        println("$name is created")
    }
    //here this is secondary constructor ,using  'this' we are calling primary constrcutor
    //after this we passed , by deafult 4=tyres ,5 =max seat
    constructor(nameParam:String,engineParam:String):
            this(nameParam,4,5,engineParam)
    fun drive(){}
    fun applyBrakes(){}
}