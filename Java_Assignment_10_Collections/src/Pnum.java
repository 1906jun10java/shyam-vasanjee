
public class Pnum {
	public Pnum(int n, int m, int s) {
		this.n = n;
		this.m = m;
		this.s = s;
	}
	private int n;
	private int m;
	private int s;
	
	public int getN() {
		return this.n;
	}
	public int getM() {
		return this.m;
	}
	public int getS() {
		return this.s;	
		}
	public void setN(int n) {
		this.n =n;
	}
	public void setM(int m) {
		this.m =m;
	}
	public void setS(int s) {
		this.s =s;
	}
	public void test1() {
	
	}
	@Override
	public String toString() {
		return "The perfect number is:"+ this.n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pnum p = new Pnum(2,1,0);
		
	}

}
