fun main() {
    val time_s: Int = 60 * 60 * 1 + 3

    println("Был в сети ${agoToText(time_s)}")
}

fun agoToText(seconds: Int): String {
    val minute = 60
    val hour = minute * 60
    val day = hour * 24

    return when {
        seconds <= minute -> "только что"
        seconds <= hour -> mAgo(seconds / minute) + " назад"
        seconds <= day -> hAgo(seconds / hour) + " назад"
        seconds <= day * 2 -> "вчера"
        seconds <= day * 3 -> "позавчера"
        else -> "давно"
    }
}

fun mAgo(minutes: Int) = when (minutes % 10) {
    1 -> "$minutes минуту"
    2, 3, 4 -> "$minutes минуты"
    else -> "$minutes минут"
}

fun hAgo(hours: Int) = when (hours % 10) {
    1 -> "$hours час"
    2, 3, 4 -> "$hours часа"
    else -> "$hours часов"
}
