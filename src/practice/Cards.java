package practice;

public class Cards {
	public int rank;
	public int suit;

	
	//constructor w/ no args
	public Cards() {
		this.rank = 0;
		this.suit = 0;
	}
	// constructor w/ args
	public Cards(int rank, int suit) {
		this.suit =suit;
		this.rank = rank;
	}
	public String toString() {
		String[] Rank = {"A", "2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] Suit = {"Clubs", "Hearts","Spades","Diamonds"};
		return Rank[this.rank] +" of " +Suit[this.suit];
	}
	//Make an array of 52 cards
	//public static Cards[] makeDeck() {
		Cards[] cards = new Cards[52];//makes an array 52 open boxes
		
	}


