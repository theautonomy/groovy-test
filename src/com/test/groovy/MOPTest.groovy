package com.test.groovy

println "----- Define Dog class"
class Dog{
}
println "----- Add bark() behavior to the Dog class"
Dog.metaClass.bark = { X -> println "${X} is barking!" }
println "----- Call newly added metaClass method"
new Dog().bark("My dog")

class Blog {
	String name
	String message
}
def blogs = [
	new Blog(name:"1", message:"one"),
	new Blog(name:"2", message:"two"),
	new Blog(name:"3", message:"three")
]
blogs.each { println "${it.name} ${it.message}" } 


