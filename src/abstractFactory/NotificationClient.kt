package abstractFactory


class NotificationClient(
    private val factory: NotificationServiceFactory
) {
    private val emailService: NotificationService = factory.createEmailService()
    private val smsService: NotificationService = factory.createSmsService()

    fun sendEmail(userId: String, message: String) {
        emailService.notifyUser(userId, message)
    }

    fun sendSms(userId: String, message: String) {
        smsService.notifyUser(userId, message)
    }
}