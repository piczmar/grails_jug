import demo.*

def q = new Quiz()

Quiz.metaClass.methods.each{
    println it.name
}

q.validate()

println q.errors

null