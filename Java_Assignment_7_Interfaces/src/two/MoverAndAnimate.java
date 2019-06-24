package two;
import one.Movable;

public class MoverAndAnimate implements Animatable {
	public void move() {
		System.out.println("Going Forward!");
		
	}
	public void animate() {
		System.out.println("Get Animated!");
		
	}
	public static void main(String[] args) {
		MoverAndAnimate c = new MoverAndAnimate();
		c.move();
		c.animate();
	}

}
