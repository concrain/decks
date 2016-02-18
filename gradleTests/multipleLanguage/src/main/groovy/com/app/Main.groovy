package com.app

class Main {

	static void main(String[] args) {
		println 'main is running'

		JavaPerson jp = new JavaPerson()
		jp('Russel')

		PersonList pl = new PersonList()
		println(pl.find('Russel')).dump()
	}

}