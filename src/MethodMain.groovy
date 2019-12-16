def method1() {
    println "invoke method1"
}

def method2(param1) {
    println "invoke method2 $param1"
}

def method3(param1 = "default") {
    println "invoke method2 $param1"
}

method1()
method2 "PARAM-01"
method3()
method3 "DEFAULT"