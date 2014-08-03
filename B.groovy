class MyClass{}

MyClass.metaClass.method = {x,y -> x+y}

println "result: ${new MyClass().method(1,2)}"
