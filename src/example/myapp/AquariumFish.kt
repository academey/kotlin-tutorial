package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

class Shark(override val color: String = "gray") : AquariumFish(), FishAction{
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor:FishColor = GoldColor):
        FishColor by fishColor,
        FishAction by PrintingFishAction("eat eagle")

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color: String = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}


sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

fun main() {
    println(matchSeal(SeaLion()))
    println(matchSeal(Walrus()))
}