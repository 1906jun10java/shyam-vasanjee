
public class MyObject {
	long id;
	public MyObject(long id) {
		this.id = id;
	}
	public boolean equals(Object obj) {
		if (obj instanceof MyObject) { // compares types of objects with eachother
			return (((MyObject) obj).id == this.id);
		}
		return false;
	}
	public static void main(String[] args) {
		MyObject obj1 = new MyObject(222L);
		MyObject obj2 = new MyObject(222L);
		
		if (obj1.equals(obj2)) {
			System.out.println("The two objects are equivalent!");
		}
		else {
			System.out.println("The two objects are not the same.");
		}
	}

}
