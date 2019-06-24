package three;

public class TalkablePerson {
	private String name;
	private int age;
	
	public TalkablePerson(String name, int age) {
		this.name =  name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String talk() {
		return "Hello my name is " + this.name;
	}

	public static void main(String[] args) {
		TalkablePerson Todd = new TalkablePerson("Todd", 28);
		System.out.println(Todd.talk());
		// TODO Auto-generated method stub

	}

}
