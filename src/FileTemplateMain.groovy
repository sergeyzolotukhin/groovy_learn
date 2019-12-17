import groovy.text.SimpleTemplateEngine

println("Reading file ....")

def tmpl = new File("template.txt")

def binding = [
        i1: "Groovy",
        i2: "Templates"
].withDefault { "<not found>" }

def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(tmpl).make(binding)

println template