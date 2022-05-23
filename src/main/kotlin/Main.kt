fun main(){

    val duck1 = MallardDuck()
    duck1.performFly()
    duck1.performQuack()
    duck1.quackBehavior = MuteQuack()
    duck1.performQuack()
    duck1.flyBehavior = FlyNoWay()
    duck1.performFly()



}