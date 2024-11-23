fun main() {
    val totalSeconds: Int = 6480
    val minutes = totalSeconds / 60
    val remainingSeconds = totalSeconds % 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)

    println(formattedTime)
}