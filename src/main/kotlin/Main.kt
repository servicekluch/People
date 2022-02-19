import kotlin.random.Random

fun main() {

    val likes= Random.nextInt(from = 1, until = 100)
    println("Понравилось ${likes.let { getPeople(it) }}")

}
fun getPeople(likes: Int): String {
    return when {
        likes.mod(10) == 1 -> "$likes человеку"
        likes.mod(100) == 11 -> "$likes людям"
        else -> "$likes людям"
    }
}