class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when (name) {
                "Moscow" -> if (value < -92 || value > 57) 5 else value
                "Hanoi" -> if (value < -92 || value > 57) 20 else value
                "Dubai" -> if (value < -92 || value > 57) 30 else value
                else -> value
            }
        }
}


fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()

    val firstCity = City("Dubai").apply { degrees = first }
    val secondCity = City("Moscow").apply { degrees = second }
    val thirdCity = City("Hanoi").apply { degrees = third }

    //implement comparing here
    val cities = listOf(firstCity, secondCity, thirdCity)
    val coldestTemp = cities.minOf { it.degrees }
    val citiesWithColdestTemp = cities.filter { it.degrees == coldestTemp }

    if (citiesWithColdestTemp.size > 1) {
        println("neither")
    } else {
        println(citiesWithColdestTemp.first().name)
    }
}