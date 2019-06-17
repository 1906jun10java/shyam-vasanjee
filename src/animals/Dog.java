package animals;

public class Dog extends Animal implements Arooooo {
	public Dog() {
		super();
	}
	public Dog(String Breed, String FluffFactor, double age, String name) {
		this.Breed = Breed;
		this.FluffFactor = FluffFactor;
		this.age = age;
		this.name = name;
	}
	
	public String Breed;
	public String FluffFactor;
	public double age;
	public String name;
	
	
	

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		System.out.println("The"+this.Breed +" is howling");
	}

	@Override
	public void shake() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" can shake! ");
		
	}

	@Override
	public void rollInMud() {
		// TODO Auto-generated method stub
		System.out.println("The dog is dirty!");
		
	}

	@Override
	public void playDead() {
		// TODO Auto-generated method stub
		System.out.println("Are you alive? Howl twice if true!");
		
	}
	
	

}
