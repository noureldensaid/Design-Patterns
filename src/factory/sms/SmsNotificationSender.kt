package factory.sms

import factory.NotificationSender

class SmsNotificationSender : NotificationSender {
    override fun send(to: String, message: String) {
        println("sending using SMS... \nto: $to\nmessage: $message")
    }
}