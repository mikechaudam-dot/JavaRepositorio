package exercism;

public class AnnalysnInflitration {
	
	 public static boolean canFastAttack(boolean knightIsAwake) {
	        if(knightIsAwake){
	        	 System.out.println("You can't use fast Attack, the knight is Awake");
	        	 return false;
	            }else{
	            	System.out.println("The knight is sleeping, Attack!!!!");
	            }return true;
	    }
	 
	 public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisionerIsAwake) {
		 if(knightIsAwake || archerIsAwake || prisionerIsAwake) {
			 System.out.println("Spy the enemies, be quiete!!!!!");
			 return true;
		 }else {
			 System.out.println("Spying is a waste of time");
			 return false;
			 
		 }
		 
	 }
	 
	 public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisionerIsAwake){
		 if(!archerIsAwake && prisionerIsAwake) {
			 System.out.println("Is time to sing little bird!!!!!");
			 return true;
		 }else {
			 System.out.println("The silenc is a virtue");
			 return false;
		 }
	 }
	 
	 public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisionerIsAwake, boolean petDogIsPresent) {
		 if(knightIsAwake && !archerIsAwake && prisionerIsAwake && petDogIsPresent) {
			 System.out.println("Attack dog, time to go home boys!!!!!!");
			 return true;
		 }else if(!knightIsAwake && !archerIsAwake && prisionerIsAwake && !petDogIsPresent){
			 System.out.println("Shiiii Time to go home man!!!!!!");
			 return true;
		 }else {
			 System.out.println("Wait for the right moment");
			 return false;
		 }
	 }

	public static void main(String[] args) {
		
		boolean knightIsAwake = false;
		boolean archerIsAwake = false;
		boolean prisionerIsAwake = true;
		boolean petDogIsPresent = false;
		
		AnnalysnInflitration.canFastAttack(knightIsAwake);
		AnnalysnInflitration.canSpy(knightIsAwake, archerIsAwake, prisionerIsAwake);
		AnnalysnInflitration.canSignalPrisoner(archerIsAwake, prisionerIsAwake);
		AnnalysnInflitration.canFreePrisoner(knightIsAwake, archerIsAwake, prisionerIsAwake,petDogIsPresent);

	}
}
