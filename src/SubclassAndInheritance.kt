import example.myapp.OpenAquarium
import example.myapp.TowerTank

fun buildAquarium() {
    val aquarium6 = OpenAquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
}