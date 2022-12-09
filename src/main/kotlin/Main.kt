fun main() {
    solution(
        mutableListOf(
            "a(1)",
            "a(6)",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a"
        )
    )
}

//fun solution(names: MutableList<String>): MutableList<String> {
//    val map = HashMap<String, Int>()
//    for (i in 0 until names.size) {
//
//        map[names[i]] = (map[names[i]] ?: 0) + 1
//
//        if ((map[names[i]] ?: 0) > 1) {
//
//            val temp = names[i] + "(${(map[names[i]] ?: 0) - 1})"
//
//            if (map.containsKey(temp)) {
//                map[temp] = (map[temp] ?: 0) + 1
//                names[i] = names[i] + "(${(map[names[i]] ?: 0)})"
//            } else {
//                names[i] = names[i] + "(${(map[temp] ?: 0) - 1})"
//            }
//
//            map[names[i]] = (map[names[i]] ?: 0) + 1
//        }
//    }
//    return names
//}

fun solution(names: MutableList<String>): MutableList<String> {
    val tempList = mutableListOf<String>()
    for (i in 0 until names.size) {
        var tempString = names[i]
        var tempCount = 1
        while (tempList.contains(tempString)) {
            tempString = names[i] + "($tempCount)"
            tempCount++
        }
        tempList.add(tempString)
    }
    return tempList
}