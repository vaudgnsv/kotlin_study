package chap02.section

import com.example.edu.Person as User

fun main() {
    val user1 = User("myeonghoon", 29)
    val user2 = Person("id123", "myeonghoon")

    println("user1 name: ${user1.name}, age: ${user1.age}")
    println("user2 id: ${user2.id}, name: ${user2.name}")
}

class Person (val id: String, val name: String)