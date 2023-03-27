fun main() {
    var i=13
    var j=2


    //arithmetic operator
    println(i + j) //15
    println(i - j) //11
    println(i * j) //26
    println(i.toFloat()/j) //6.5
    println(i % j) //1 remainder

    //relational operators

    println(i >j) // 13>2 true
    println(i < j) //13<2 flase
    println(i >=j) // 13 >=2 true
    println(i <=j) // 13<=2 false
    println(i ==j) //13==2 false
    println(i != j) //13!=2 true

    //increment operator
    var x=10
    x=x+1 //= x++
    println(x)

    //post and pre increment
   // ++i pre increment
    //i++ post increment

    var y =20

    println(y++)  // post ma output same 20   ,it asked y sa k value ha , its said 20 ,so it print 20 and then increase 1 in meomory
    println(y)  //21  // hence now y=21
     //so post ma pehla value used then memory ma increment

    var z=30
    println(++z) //31 , pre pehla ++ kara ga then use the variable
    println(z)   //

    var s=10
    println(s++ + ++s) //10 + 12 ==22 ans


}