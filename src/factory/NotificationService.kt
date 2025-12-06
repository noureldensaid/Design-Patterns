package factory

abstract class NotificationService {
    // This is the Factory Method
    protected abstract fun createSender(): NotificationSender

    fun notifyUser(userId: String, message: String) {
        val sender = createSender()
        sender.send(userId, message)
    }
}