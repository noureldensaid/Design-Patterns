package singleton

object SingletonDemo {

    init {
        println("initializing ${this.javaClass.simpleName} ... ")
    }

    fun sayMyName() {
        println("I'm the singleton class ${this.javaClass.simpleName}")
    }

}