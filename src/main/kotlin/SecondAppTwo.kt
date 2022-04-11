const val DIVIDER = 10u
const val DIVIDER2 = 100u
const val REMAINDER = 1u
const val REMAINDER2 = 11u
fun main() {
    print("Введите количество лайков: ")
    val likes = readLine()?.toUInt() ?: return
    val liked = "Понравилось"

    if (likes % DIVIDER2 == REMAINDER2) {
        println("$liked $likes людям")
    } else if (likes % DIVIDER == REMAINDER) {
        println("$liked $likes человеку")
    } else {
        println("$liked $likes людям")
    }
}