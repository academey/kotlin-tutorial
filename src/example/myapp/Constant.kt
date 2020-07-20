package example.myapp
const val rocks = 3 // created when compile time.
// object 키워드는 싱글톤 객체를 의미한다.
object Constants {
    const val CONSTANT2 = "object constant"
}
fun main() {
//    const val rocks = 3 this will be an error

//    val value1 = complexFunctionCall() // OK
//    const val CONSTANT1 = complexFunctionCall() // NOT ok
    val foo = Constants.CONSTANT2


    println("hihi" + MyClass.CONSTANT3)
}

class MyClass {
    // 클래스 내에 상수를 쓰기 위해서는 companion 키워드로 감싸줘야 한다.
    // companion object 는 클래스내의 싱글톤 객체다.
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
    // Companion objects 들은 static constructor 에서 생성된다. 객체를 생성하면 내부의 companion object 들이 동시에 초기화된다.
    // 그러나 다른 객체들은 lazily 하게 초기화된다. 즉, 객체에 접근해야지만 생성된다.
}