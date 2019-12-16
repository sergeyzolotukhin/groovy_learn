println "for:"
for (int i = 0; i < 3; i++) {
    println "Hello World $i"
}

println "upto:"
0.upto(3) { println "upto $it" }

println "times:"
3.times { println "times $it" }

println "step:"
0.step(7, 2) { println "step $it" }