package com.test.groovy

import groovy.xml.MarkupBuilder


def xml = new MarkupBuilder()
println "-----Create XML using MarkupBuilder"
xml.people {
	person (id: "1"){
		name "fn1 ln1"
		age 22
	}
	person (id: "2", gender: "Male"){
		name "fn2 ln2"
		age: 33
	}
	person (id: "3"){
		name "fn3 ln3"
		age 33
		address (){
			street "56 Dream st"
			city "Boston"
			zip 23456
		}
	}
}


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


