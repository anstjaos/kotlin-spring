import java.util.*
import kotlin.collections.ArrayList

fun main() {
    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("유로")
    mutableCurrencyList.add("원")

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap.put("two", 2) // literal 문법을 추천
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더는 내부에선 mutable, 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("===============")

    for (currency in currencyList) {
        println(currency)
    }

    println("===============")

    currencyList.forEach {
        println(it)
    }

    println("===============")

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()

    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    println(upperList)

    println("===============")

    val upperList1 = lowerList.map { it.uppercase() }
    println(upperList1)

    println("===============")

    val filteredList = mutableListOf<String>()
    for (upperCase in upperList1) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }
    println(filteredList)

    println("===============")

    val filterdList1 = upperList1.filter { it == "A" || it == "C" }
    println(filterdList1)
}