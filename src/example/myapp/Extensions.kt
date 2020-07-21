package example.myapp

//fun String.hasSpaces(): Boolean {
//    val found = this.find { it == ' ' }
//    return found != null
//}
// 위에걸 간략화 시키면
fun String.hasSpaces() = find { it == ' ' } != null

open class AquariumPlant(val color: String, private val size: Int)
fun AquariumPlant.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun main() {
    println("Does it have spaces?".hasSpaces())
    AquariumPlant("test",3).isRed()

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?

    val plant2: AquariumPlant? = null
    plant2.pull()
}

