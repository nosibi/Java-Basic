package ClassInheritance_01;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentID;
	void school() {}
}

class Worker extends Human{
	int workerID;
	void work() {}
}

public class Inheritance {
	public static void main(String[] args) {
		//Human 객체 생성
		Human h = new Human();
		h.name = "Kim";
		h.age = 23;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "Lee";
		s.age = 19;
		s.studentID = 12;
		s.eat();
		s.sleep();
		s.school();
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "Park";
		w.age = 34;
		w.workerID = 300;
		w.eat();
		w.sleep();
		w.work();
	}

}
