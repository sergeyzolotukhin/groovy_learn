import groovy.text.SimpleTemplateEngine

def engine = new SimpleTemplateEngine()

def template = engine.createTemplate('''
Dear $firstname $lastname,
So nice to meet you in.
See you in Jun'''
).make(["firstname": "Serhij", "lastname": "Zolotukhin"])

println template.toString()