import static ua.in.sz.second.*

println("Hello, Groovy!")

def methodName(param1, age) {
    println("Hello, $param1! Age is $age. Params")
}

def methodName(map) {
    println("Hello, $map.param1! Age is $map.age. Map")
}

def methodName(Object ... args) {
    println("Hello, ${args[0]}! Age is ${args[1]}. Args")
}

methodName "Methods", 10
methodName "Methods", 10, 30
methodName param1: "Methods", age: 20

secondMethodName()