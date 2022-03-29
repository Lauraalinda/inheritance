fun main(){
    var car=Car("Toyota","Legacy","yellow",4)
    car.carry(7)
    car.identity("white","Subaru","Legacy")
    car.calculateParkingFees(9)
    var bus=Bus("Kalita","airbus","green",30)
    bus.maxTripFare(300.0)
    bus.calculateParkingFees(3)
}
open class Car(var make:String, var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")

        }
    }
    fun identity( color:String, make:String,model:String){
        println("I am a $color $make $model")

    }
    open fun calculateParkingFees(hours:Int):Int{
        var y=hours*20
        println(y)
        return y
    }

}
class Bus(make:String, model:String,color:String,capacity:Int): Car(make,model,color,capacity) {
    fun maxTripFare(fare: Double):Double {
        var maximumFare=fare*capacity
        println(maximumFare)
        return(maximumFare)

    }
    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var product = hours * capacity
        println(product)
        return(product)

    }
}