
public class Runner {
	public void run() throws CustomException {
		throw new CustomException("Tried runing but failed");
		
	}
	public static void main(String[] args) {
		Runner r = new Runner();
		try { 
			r.run();
		}catch(CustomException e) {
			e.printStackTrace();
		}
	}

}
