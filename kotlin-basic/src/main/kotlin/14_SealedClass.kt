sealed class Developer1 {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper1(override val name: String) : Developer1() {
    override fun code(language: String) {
        println("저는 백엔드 개발자 입니다 ${language}를 사용합니다")
    }
}

data class FrontendDeveloper1(override val name: String) : Developer1() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다 ${language}를 사용합니다")
    }
}

object DeveloperPool {
    private val pool = mutableMapOf<String, Developer1>()

    fun add(developer1: Developer1)  = when(developer1) {
        is BackendDeveloper1 -> pool[developer1.name] = developer1
        is FrontendDeveloper1 -> pool[developer1.name] = developer1
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper1(name = "토니")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper1(name = "카즈야")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("토니"))
    println(DeveloperPool.get("카즈야"))
}