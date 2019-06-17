package animals;

public abstract class Animal {
	
	public Animal() {
		super();
	}
	
	private int numLegs = 4;
	
	//getters and setters

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public abstract void playDead(); 
	
	
	
	

}
