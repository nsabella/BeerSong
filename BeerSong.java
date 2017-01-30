
public class BeerSong {
	
	public static void Ninety_Nine_Bottles_of_Beer(){
		int numBottles = 99;
		do{
			System.out.println(numBottles + " bottles of beer on the wall, " + numBottles + " bottles of beer");
			numBottles--;
			if (numBottles > 0)
				System.out.println("take one down, pass it around, " + numBottles + " bottles of beer on the wall.");
			else
				System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
				
		}while (numBottles > 0);
	}
	
	public static void main(String args[]){
		
	}
}
