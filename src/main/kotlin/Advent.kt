class Advent {
}

fun main(args: Array<String>) {

    val day1 = ElvenFood()
    day1.readInput()
    val topFoodCarry : Int = day1.part1()
    val top3FoodCarry : Int = day1.part2()

    println("Top food carry: ${topFoodCarry}")
    println("Top 3 Food Carry: ${top3FoodCarry}")
}