fun main() {
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result)

    // else를 생략할 수 있다
    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    // 여러 개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다
    when (getNumber()) {
        0, 1 -> print("0 또는 1")
        else -> print("0 또는 1이 아님")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED

fun getNumber() = 2