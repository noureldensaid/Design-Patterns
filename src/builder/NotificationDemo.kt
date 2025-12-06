package builder

class NotificationDemo private constructor(
    private val title: String,
    private val message: String,
    private val priority: Int,
) {

    fun show() {
        println("showing notification with title: $title , message: $message, priority: $priority")
    }

    class NotificationBuilder(
        private val title: String,
        private val message: String
    ) {

        private var priority = Int.MAX_VALUE

        fun setPriority(priority: Int) = apply {
            this.priority = priority
        }

        fun build() = NotificationDemo(title, message, priority)
    }
}