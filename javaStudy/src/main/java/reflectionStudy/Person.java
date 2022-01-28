package reflectionStudy;

public class Person extends Animal implements Head {
	public String name;
	public int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
