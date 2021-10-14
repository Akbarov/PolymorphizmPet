fun main() {


    val dog = Dog()
    val cat = Cat()
    println(speak(dog))
    println(speak(cat))

}

fun speak(pet: Pet) = pet.speak()

open class Pet{
    open fun speak() = "Pet speak"
}
class Dog:Pet(){
    override fun speak() = "Wow"
}
class Cat:Pet(){
    override fun speak(): String {
        return "Meow"
    }
}