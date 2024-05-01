fun main() {
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    val age : Int = 10
    var str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    // 코틀린은 삼항 연산자가 없다. if ... else가 표현식
    var a = 1
    var b = 1
    var c = if (b > a) b else a
}