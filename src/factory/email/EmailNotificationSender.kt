package factory.email

import factory.NotificationSender

class EmailNotificationSender : NotificationSender {

    override fun send(to: String, message: String) {
        println("sending using email... \nto: $to\nmessage: $message")
    }

}