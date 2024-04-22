var x = 5

fun main(args: Array<String>) {
    x += 1
    println(x)

    val a : Int = 1

    // 타입 추론
    var b = 1

    // 지연 할당
    // 타입 필수 설정
    val c : Int
    c = 3

    // val (value)      한 번 초기화 이후 재할당 불가, readonly
    // var (variable)   가변 변수
    var d : String = "Hello"
    d = "World"

    // 최초 타입이 세팅되면 이후에 타입 변경 불가능
    var e = 123
    // compile error!
    // e = "hi"
}