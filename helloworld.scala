println("Hello world")

var li = List(20,56,78,90)
println(li(2))

def tomi(x :Int) :Double = {
    x * 0.62
}
println(tomi(42))

var mi = li.map(tomi)

println(mi)

var a = 10
10

def sq(x :Int) :Int = {
    x * x
}
println(li.map(sq))
println(li.map(x => x *x))

var nums = List.range(1,100)
var evens = nums.filter( x => x%2==0 )
println(evens)

println(nums.filter(x => x %3 ==0).map(x => x * x))

var s = "hello,what,when"
var tokens = s.split(",")
println(s.split(",")(2))
//tokens.foreach(x => println(x))

import scala.io.Source
val lines = Source.fromFile("data.csv").getLines().toList
var teams = lines.filter(line => line.contains("info,team")).map(x => x.split(",")(2))

println(teams(0), "V/S", teams(1))

var inn1 = lines.filter(x => x.contains("ball,1")).
        filter(x => ! x.split(",")(9).equals("\"\""))
        
println(inn1.length)

var inn2 = lines.filter(x => x.contains("ball,2")).
        filter(x => ! x.split(",")(9).equals("\"\""))
        
println(inn2.length)













