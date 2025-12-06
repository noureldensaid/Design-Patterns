import factory.email.EmailNotificationService
import factory.sms.SmsNotificationService

fun main() {
    val userId = "111"
    val message = "check new offers!!"

    val smsNotificationService = SmsNotificationService()
    smsNotificationService.notifyUser(userId, message)

    val emailNotificationService = EmailNotificationService()
    emailNotificationService.notifyUser(userId,message)

}