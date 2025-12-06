package abstractFactory.sms

import abstractFactory.NotificationService
import abstractFactory.Plan
import factory.NotificationSender
import factory.sms.SmsNotificationSender

class SmsNotificationService(
    plan: Plan
) : NotificationService(plan) {
    override fun createSender(): NotificationSender = SmsNotificationSender()
}