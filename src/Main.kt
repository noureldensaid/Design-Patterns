import builder.NotificationDemo

fun main() {
    val notification = NotificationDemo.NotificationBuilder(
        title = "New Order",
        message = "You have a new order"
    )
        .setPriority(111)
        .build()
    notification.show()
}