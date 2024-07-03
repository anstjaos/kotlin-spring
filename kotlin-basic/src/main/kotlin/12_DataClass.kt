data class Person(var name: String, var age: Int)
class Person1(var name: String, var age: Int)

fun main() {
    // 객체 동등성 비교
    println("======== Equals")

    val person1 = Person1(name = "tony", age = 12)
    val person2 = Person1(name = "tony", age = 12)
    println(person1 == person2)

    val person3 = Person(name = "tony", age = 12)
    val person4 = Person(name = "tony", age = 12)
    println(person3 == person4)

    // hash code
    println("======== Hash code")

    val set = hashSetOf(person1)
    println(set.contains(person2))

    val set1 = hashSetOf(person3)
    println(set1.contains(person4))

    // toString
    println("======== ToString")
    println(person1.toString())
    println(person3.toString())

    // copy
    // 불변성을 지켜주는 것이 좋음
    println("======== copy")
    person3.name = "strange"
    println(set1.contains(person3))

    val copyPerson = person3.copy(name = "strange")
    println(copyPerson)

    // component N
    // 클래스의 property와 개수가 동일함
    println("======== Component")
    println("이름=${person3.component1()}, 나이=${person3.component2()}")
    val (name, age) = person3
    println("이름=$name, 나이=$age")
}