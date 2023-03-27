fun main(){
    //logical operators and short circuiting
    //prints boolean

    val above70=true
    val knowsProgramming=false

        //&& AND  both true
    var calledForInterview=above70 && knowsProgramming
    println(calledForInterview)

// || or
//make val  calledForInterview to var so that or can be assigned
    calledForInterview=above70 || knowsProgramming
    println(calledForInterview)



    //short circuiting  if in or operator first condition is true , it wont check the other
    //
    var i=10
    var j=11

    var result=i==10 || j++==11
    println(i)
    println(j)

    // ! negate
    val ans=false
    val result1=!ans
    println(result1)
}