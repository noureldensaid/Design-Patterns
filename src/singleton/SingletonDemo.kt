package singleton

object SingletonDemo {

    fun sayMyName() {
        println("I'm the singleton class ${this.javaClass.simpleName}")
    }

}