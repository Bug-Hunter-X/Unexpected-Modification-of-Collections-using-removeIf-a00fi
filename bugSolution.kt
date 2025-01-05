fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.toMutableList()
    newList.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.toMutableSet()
    newSet.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val newMap = map.toMutableMap()
    newMap.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 2=two, 3=three, 4=four, 5=five}
    println(newMap) // Output: {1=one, 3=three, 5=five}
}