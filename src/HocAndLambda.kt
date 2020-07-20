fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun test(dirty: Int, operation: (Int) -> Int, operation2: (Int) -> Int): Int {
    return operation(dirty)
}
fun main() {
    var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    fun increaseDirty( start: Int ) = start + 1

    println(waterFilter(dirtyLevel))
    println(updateDirty(30, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    // 이렇게 하면 에러남.
//    println(updateDirty(15, increaseDirty))

    // 맨 마지막에 { 로 쓰면 Lambda 가 마지막 파라미터로 넘어감
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
    dirtyLevel = test(dirtyLevel, {dirtyLevel -> dirtyLevel + 23}, { dirtyLevel -> dirtyLevel + 23})
    println(dirtyLevel)
}