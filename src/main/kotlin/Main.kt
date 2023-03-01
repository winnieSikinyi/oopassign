fun main() {
   val myname =Human("Zara",35,70)
    myname.eat(27)
    myname.speak("Jesus loves me")
    myname.birthday(1)
    println(myname.age)

    //Qn2
val owner =User("Kadogo", "Mumbi", "mumbikadogo@gmail.com", 767854321)
    println(owner.email)
    println(owner.phoneNumer)

}
//Qn1
class Human(var name: String, var age: Int, var weight: Int){
 public   fun eat (foodWeight: Int){
     println("i am eating $foodWeight kgs of food")

 }
    fun  speak(speech: String){
        println("$speech")
    }
    fun birthday(older: Int){
    age += older

    }

}

//Qn2
data class User(var firstName: String,var lastName: String, var email: String, var phoneNumer: Int){

}


