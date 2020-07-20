package example.myapp

// 이것도 가능함
// class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height
    // public getter private setter
    var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }
    init {
        println("aquarium initializing")
    }
    // 2번째 컨스트럭터, 얘네들은 첫번째 꺼 이후에 실행된다.
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()

    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}