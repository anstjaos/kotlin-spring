import java.lang.Exception

fun main() {
    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!$e")
    } finally {
        println("finally 실행!")
    }

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생 !")
    }

    println(a)

    failFast("예외 발생!!")
}

fun failFast(message: String) {
    throw IllegalArgumentException(message)
}