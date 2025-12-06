package abstractFactory

import abstractFactory.email.EmailNotificationService
import abstractFactory.sms.SmsNotificationService

class PremiumNotificationServiceFactory : NotificationServiceFactory {

    override fun createEmailService(): NotificationService {
        return EmailNotificationService(Plan.PREMIUM)
    }

    override fun createSmsService(): NotificationService {
        return SmsNotificationService(Plan.PREMIUM)
    }
}