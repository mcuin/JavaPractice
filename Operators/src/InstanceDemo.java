
public class InstanceDemo {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		
		System.out.println("obj1 instance of Parent: " + (obj1 instanceof Parent));
		System.out.println("Obj1 instance of Child: " + (obj1 instanceof Child));
		System.out.println("Obj1 instance of Interface: " + (obj1 instanceof MyInterface));
		System.out.println("obj2 instance of Parent: " + (obj2 instanceof Parent));
		System.out.println("Obj2 instance of Child: " + (obj2 instanceof Child));
		System.out.println("Obj2 instance of Interface: " + (obj2 instanceof MyInterface));
	}

}

class Parent{}
class Child extends Parent implements MyInterface{}
interface MyInterface{};

