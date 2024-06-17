@main def main(): Unit = 
    def area_of_disk(r:Double):Double=math.Pi*r*r //for question 1
    println("The area of the disk is :"+area_of_disk(5))
    def temp_con(c:Double):Double=c*1.8000+32.00 //que2
    println("35C in fahrenheit is:"+temp_con(35))
    def sphere_vol(r:Double):Double=4/3*math.Pi*r*r*r //que3
    val volume = sphere_vol(5)
    println(s"The volume of the sphere is $volume")
    def cover_price(copies: Int):Double = copies*24.95*0.6 //que4
    def shipping_cost(copies:Int):Double = if(copies>50) {50*3+(copies-50)*0.75} else{ copies*3}
    def total(copies:Int):Double = cover_price(copies)+shipping_cost(copies)
    println("Total wholesale cost for 60 copies is " +total(60))
    def total_runtime (easy:Double,tempo:Double):Double=easy*8+tempo*7
    println("The total time is: "+total_runtime(4,3)+" s")