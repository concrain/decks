package com.app

class PersonList {

	List people = ['Anna','Trevor','Russel','Dave', 'Brian']

    String find(String name) {
        people.each {
        	if (it == name) {
        		return name
        	}
        }
    }

    def addToPeople(String name) {
    	people.push(name)
    }
}
