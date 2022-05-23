abstract class Duck {

    lateinit var quackBehavior: QuackBehavior
    lateinit var flyBehavior: FlyBehavior



    fun performQuack(){
        quackBehavior.quack()
    }

    fun performFly(){
        flyBehavior.fly()
    }

    fun display(){
        println("Look at me, I'm fly and swim")
    }



}