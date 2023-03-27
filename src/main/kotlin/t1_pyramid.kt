fun main(){
    var k=0

    for(i in 1..6){
        for(space in 1..6-i){
            print(" ")

        }
        while(k !=2*i-1){
            print("* ")
            ++k
        }
        println()
        k=0
    }
}