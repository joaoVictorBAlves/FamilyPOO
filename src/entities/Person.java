package entities;

public class Person {
	private String name;
	private Person mon;
	private Person dad;

	public Person() {
	}

	public Person(String name, Person mon, Person dad) {
		super();
		this.name = name;
		this.mon = mon;
		this.dad = dad;
	}

	public String getName() {
		return name;
	}

	public Person getMon() {
		return mon;
	}

	public Person getDad() {
		return dad;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " filho de " + dad.getName() + " e " + mon.getName();
	}

}
