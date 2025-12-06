package abstractFactory

import factory.NotificationSender


abstract class NotificationService(
    private val plan: Plan
) {

    // Factory Method
    protected abstract fun createSender(): NotificationSender

    fun notifyUser(userId: String, message: String) {
        val sender = createSender()
        sender.send(userId, "$message \n type:${plan.name}")
    }
}

