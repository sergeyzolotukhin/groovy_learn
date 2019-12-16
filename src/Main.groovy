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

println "each by range:"
(1..3).each { println "each $it" }

println "each by letter range:"
('a'..'c').each { println "letter ${it}" }

println "each by list item:"
['Cat', 'Dog', 'Elephant'].each { println "item ${it}" }

println "each by list item with index:"
['Cat', 'Dog', 'Elephant'].eachWithIndex { name, index -> println "$index). Animal $name" }