package factory.email

import factory.NotificationSender
import factory.NotificationService

class EmailNotificationService : NotificationService() {
    override fun createSender(): NotificationSender = EmailNotificationSender()
}