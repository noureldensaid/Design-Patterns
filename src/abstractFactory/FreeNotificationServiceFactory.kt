package abstractFactory

import abstractFactory.email.EmailNotificationService
import abstractFactory.sms.SmsNotificationService

class FreeNotificationServiceFactory : NotificationServiceFactory {

    override fun createEmailService(): NotificationService {
        return EmailNotificationService(Plan.FREE)
    }

    override fun createSmsService(): NotificationService {
        return SmsNotificationService(Plan.FREE)
    }
}