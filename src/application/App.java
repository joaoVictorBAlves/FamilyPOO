package application;

import entities.Person;

public class App {

	public static void main(String[] args) {
		Person p = new Person("Antonio", null, null);
		Person m = new Person("Roberta", null, null);
		Person f = new Person("João", m, p);
		
		System.out.println(f);

	}

}
