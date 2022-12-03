class ElvenFood {

    private var lines : List<String> = ArrayList()

    fun readInput() {
        val fileContent = ElvenFood::class.java.getResource("/day1-input.txt").readText()
        this.lines = fileContent.lines()
    }

    private fun processInput() : MutableList<Int> {
        var elfFood : MutableList<Int> = ArrayList()

        var currentFoodTotal = 0
        for (food in lines) {
            if (food.isEmpty()) {
                elfFood.add(currentFoodTotal)
                currentFoodTotal = 0
            } else {
                currentFoodTotal += food.toInt()
            }
        }

        return elfFood
    }

    fun part1() : Int {
        val elfFood : MutableList<Int> = processInput()
        elfFood.sortDescending()
        return elfFood.get(0)
    }

    fun part2() : Int {
        val elfFood : MutableList<Int> = processInput()
        elfFood.sortDescending()
        return elfFood.get(0) + elfFood.get(1) + elfFood.get(2)
    }
}