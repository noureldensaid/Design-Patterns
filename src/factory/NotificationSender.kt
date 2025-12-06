package factory

interface NotificationSender {
    fun send(to: String, message: String)
}