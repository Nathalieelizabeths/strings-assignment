fun main(){
   val school="akirachix"
    println(school[0])
    println(school[2])
    println(school[3])

    person(name ="Nana", age = "20")
    println(sumn())
    println(identify())


}

fun school(){
    val school="akirachix"

}
fun person(name :String, age:String){
    println("hi,my name is $name and im $age years old")

}
fun sumn():Int{
    val sumn = "Nathalie"
    val len = sumn.length
    return len

}
fun identify(){
    val name1="Dina"
    val name2="Diana"
    if (name1==name2)
        println("i know you")else
            println("i dont know you")
}
