package singleton

class SingletonClassDemo private constructor() {

    init {
        println("initializing ${this.javaClass.simpleName} ... ")
    }

    fun sayMyName() {
        println("I'm the singleton class ${this.javaClass.simpleName}")
    }

    companion object {
        // `lazy {}` uses LazyThreadSafetyMode.SYNCHRONIZED by default,
        // which guarantees thread-safe initialization. Only one thread
        // will run the initializer, and the created instance is safely
        // published to all threads. No need for `volatile` or manual `synchronized`—Kotlin handles that automatically.
        val instance by lazy {
            SingletonClassDemo()
        }
    }
}