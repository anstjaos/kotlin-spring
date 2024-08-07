fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage() = println("확장 출력")

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())

    println("ABCD".addFirst('Z'))

    // 클래스 멤버 함수가 우선됨
    MyExample().printMessage()

    var myExample: MyExample? = null
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}