package factory.sms

import factory.NotificationSender
import factory.NotificationService

class SmsNotificationService : NotificationService() {
    override fun createSender(): NotificationSender = SmsNotificationSender()
}