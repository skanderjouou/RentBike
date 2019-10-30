import java.util.Scanner;

public class RentBike {

	public static void main(String[] args) {
		
// her is storred the variables for price RH = Rent by hour , RD = Rent By day , RW = Rent By Week 
		int RH = 5;
		int RD = 20;
		int RW = 60;
	//in this part i use println to print a title 	
		System.out.println("\n\nWelcome to the Bikes Rental Company"); 
		System.out.println("=================================================");
		//her we present for the user the 4 type of renting using the print methode and we let the use enter the answer using the scanner methode
		Scanner clavier = new Scanner(System.in);
	    System.out.print("1. Rental by hour, \r\n" + 
	    		"2. Rental by day, \r\n" + 
	    		"3. Rental by week, \r\n" + 
	    		"4. Family Rental 30% of the total price ");
	    System.out.print("\rYour Answer :");
	    int Rent = clavier.nextInt();
	    
	    // if the user chose to rent by hour this script will run 
	    if (Rent == 1 ){ 
	        System.out.println("Rental by hour, charging"+" "+ RH +"$ Per Hour ");
	        Scanner clavier1 = new Scanner(System.in);
	        System.out.print("How many hours Would you like to rent : ");
	        System.out.print("\rYour Answer :");
	        int Hour = clavier.nextInt();
	        // this line calculate and print the total price 
	        System.out.print("total amount of "+Hour+" "+"hours is"+" "+Hour*RH+"$");
	        
	    }
	    //if the user chose to rent by day this script will run 
	    if (Rent == 2 ){ 
	        System.out.println("Rental by Day , charging"+" "+ RD +"$ Per Day ");
	        Scanner clavier2 = new Scanner(System.in);
	        System.out.print("How many days Would you like to rent : ");
	        System.out.print("\rYour Answer :");
	        int Day = clavier.nextInt();
	        // this line calculate and print the total price 
	        System.out.print("total amount of "+Day+" "+"days is"+" "+Day*RD+"$");
	        
	    }
		// if the user chose to rent by week this script Will run 
	    if (Rent == 3 ){ 
	        System.out.println("Rental by Week , charging"+" "+ RW +"$ Per Week ");
	        Scanner clavier3 = new Scanner(System.in);
	        System.out.print("How many weeks Would you like to rent : ");
	        System.out.print("\rYour Answer :");
	        int WeeK = clavier.nextInt();
	        // this line calculate and print the total price 
	        System.out.print("total amount of "+WeeK+" "+"weeks is"+" "+WeeK*RW+"$");
	        
	    }
	    
	    // this is the family rent part , make the user rent from 3 to 5 bikes with a 30% discount 
	    if (Rent == 4 ){ 
	        System.out.println("Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount\r\n" + 
	        		"of 30% of the total price ");
	        Scanner clavier3 = new Scanner(System.in);
	        System.out.print("How many Bikes Would you like to Rent  : ");
	        System.out.print("\rYour Answer :");
	        int Nbikes = clavier.nextInt();
	        /* this test if the user put the right number of bikes if its less then 3 
	         * or greater then 5 a message will appear in the screen 
	         */
	        if (Nbikes < 3 || Nbikes > 5){ 
	        System.out.print("\rSorry But this promotion is avaible for renting From 3 To 5 Bikes  :"); }
	        //this script will run if the user chose to rent from 3 to 5 bikes 
	        else
	        { 
	          	 System.out.print("Which Type of renting \r\n");
	        Scanner clavier4 = new Scanner(System.in);
	        System.out.print("1. Rental by hour \r\n" + 
		    		"2. Rental by day\r\n" + 
		    		"3. Rental by week\r\n" );
	        System.out.print("\rYour Answer :");}
	        int Rtype = clavier.nextInt();
	        
	        //if the user chose to rent family by hour
	        if (Rtype == 1){ 
	        	System.out.print("How Many Hours would you like to rents the bikes ? ");
	        	Scanner clavier5 = new Scanner(System.in);
		        System.out.print("\rYour Answer :");
		        int Rhours = clavier.nextInt();
		        //calculating the total price with 30% discount 
		       int FT = Nbikes*Rhours*RH;
		       int DS = FT*30/100;
		       int FP = FT-DS;
		      //prining a message with the final price 
		        System.out.print("Total Amount of Renting "+" "+Nbikes+" "+"Bikes"+" "+Rhours+"hours"+" "+"is"+" "+FT+"$"+" "+"with 30% Discount Final price is "+" "+FP+"$");
	    	}	
	        // if the user chose to rent family by day this script will run
            	if (Rtype == 2)  { 
    	        	System.out.print("How Many Days would you like to rents the bikes ? ");
    	        	Scanner clavier6 = new Scanner(System.in);
    		        System.out.print("\rYour Answer :");
    		        int Rdays = clavier.nextInt();    
    		     //  calculating the total price with 30% discount  
    		        int FTD = Nbikes*Rdays*RD;
    			       int DSD = FTD*30/100;
    			       int FPD = FTD-DSD;
    			     //prining a message with the final price 
    			       System.out.print("Total Amount of Renting "+" "+Nbikes+" "+"Bikes"+" "+Rdays+"Days"+" "+"is"+" "+FTD+"$"+" "+"with 30% Discount Final price is "+" "+FPD+"$");

	             
	        }
	// if the user chose the rent family by week this script will run       
            	if (Rtype == 3) { 
            		System.out.print("How Many Weeks would you like to rents the bikes ? ");
    	        	Scanner clavier7 = new Scanner(System.in);
    		        System.out.print("\rYour Answer :");
    		        int RWeeks = clavier.nextInt();    
    		        //calculating the total price with 30% discount 
    		        int FTW = Nbikes*RWeeks*RW;
    			       int DSW = FTW*30/100;
    			       int FPW = FTW-DSW;
    			       // printing a message with the final price 
    			       System.out.print("Total Amount of Renting "+" "+Nbikes+" "+"Bikes"+" "+RWeeks+"Weeks"+" "+"is"+" "+FTW+"$"+" "+"with 30% Discount Final price is "+" "+FPW+"$");

            	}
            	
	    }
	    
	    
	    
	}
	
	
	
	
}
