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



