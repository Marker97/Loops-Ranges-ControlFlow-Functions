fun main (){
    for(i in 1..100 step 2){
        if(i<50){
            println("Numbers under 50: ${i}")
        }else {
            println("Numbers over 50: ${i}")
        }
    }
}