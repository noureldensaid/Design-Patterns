package abstractFactory.email

import abstractFactory.NotificationService
import abstractFactory.Plan
import factory.NotificationSender
import factory.email.EmailNotificationSender

class EmailNotificationService(
    plan: Plan
) : NotificationService(plan) {

    override fun createSender(): NotificationSender = EmailNotificationSender()
}
