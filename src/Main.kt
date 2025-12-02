import singleton.SingletonClassDemo
import singleton.SingletonDemo

fun main() {
    SingletonDemo.sayMyName()
    SingletonDemo.sayMyName()
    SingletonDemo.sayMyName()

    val a = SingletonClassDemo.instance
    val b = SingletonClassDemo.instance
    a.sayMyName()
    b.sayMyName()
    println(a == b)
}