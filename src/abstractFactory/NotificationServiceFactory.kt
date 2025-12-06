package abstractFactory

interface NotificationServiceFactory {
    fun createEmailService(): NotificationService
    fun createSmsService(): NotificationService
}