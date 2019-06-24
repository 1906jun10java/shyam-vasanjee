package Game;

public class game {
	
	public static void main(String[] args) {
		GameObject player = new Player();// creates a new player object called player
		GameObject monster = new Enemy();// creates a new enemy called monster
		player.update();// calls update method from GameObject and prints out Player's update method
		monster.update();// call update method from GameObject and prints out Enemy's update method
	}

}
