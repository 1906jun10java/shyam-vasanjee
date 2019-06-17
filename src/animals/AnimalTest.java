package animals;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs();

	}
	public static void dogs() {
		Dog d = new Dog("Pompek", "Very fluffy!", 3.14, "Pye");
		d.playDead();//upcasting
		d.howl();
		d.shake();
		d.rollInMud();
		System.out.println(d.name+" the "+d.age+ " year old dog, "+d.Breed+", is "+d.FluffFactor);
		
	}

}
