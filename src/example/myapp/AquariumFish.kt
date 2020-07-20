package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

class Shark(override val color: String = "gray") : AquariumFish(), FishAction{
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: FishColor by GoldColor, FishAction {
    override val color = "gold"
    override fun eat() {
        println("sheat")
    }
}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color: String = "gold"
}