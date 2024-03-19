fun main() {
   myName("Raziah","Abdullahi","Mohamed","Haji")
    digits(2,9)
    println(names("Raziah","Abdullahi" ))
    println(sentence("faith",20))
    println(fact("Raziah", "baker"))
    multiply(12,24)
    println(split(4,4))
    myName("Joy","Farah","Hamdi","Luna")
    places("dodoma","jakarta","nairobi","kigali")
    nouns("cat","mt.kenya","mercy")
    data("Raziah",23,"0711345920",50.5, kenyan = true )
}
fun myName(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())

}

fun digits(num1:Int, num2:Int){
     var result = num1 + num2
    println(result)

}
fun names(name1:String, name2:String):String{
    var fullName = "$name1 $name2"
    return(fullName)
}

fun sentence(name:String, age:Int):String{
    var statement = "my name is $name I am $age years old"
    return statement
}
fun fact(name : String, fact : String): String{
    var fact = "my name is $name I am a $fact"
    return fact
}
fun multiply(num1:Int,num2:Int){
    var product = num1 * num2
    println(product)


}
fun split(num3:Int,num4:Int):Int{
    var result= num3/num4
    return result


}
fun places(nameA:String,nameB:String,nameC:String,nameD:String) {
    var xArray = arrayOf(nameA, nameB, nameC, nameD)
    println(xArray.contentToString())

    xArray.forEachIndexed { index, s ->
        if (index in arrayOf(0, 2,))
            (println(s.capitalize()))
    }

}
fun nouns(word1:String,word2:String,word3:String){
    var yArray= arrayOf(word1,word2,word3)
    println(yArray.contentToString())
    yArray.forEachIndexed{ index, s ->
        if (index in arrayOf(1,0,2,3))
            (println(s.capitalize()))
    }
}
fun data(name:String,age:Int,number:String,weight:Double,kenyan:Boolean){
    var dArray= arrayOf(name,age,number,weight,kenyan)
    println(dArray.contentToString())

}





