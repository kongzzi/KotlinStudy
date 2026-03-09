package section1

import com.example.edu.Person as User

fun main(){
    val user1 = User("Kongzzi", 20)
    val user2 = Person("kong", "Kongzzi")
    println(user1.name)
    println(user2.name)
}

class Person(val id: String, val name: String)