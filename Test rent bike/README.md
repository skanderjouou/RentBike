## Company Rents Bikes

In this project i model a logic for bike renting company under the following options 
1. Rental by hour, charging $5 per hour

2. Rental by day, charging $20 a day

3. Rental by week, changing $60 a week

4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount

of 30% of the total price

# Technologies
**Back End**
- Java 

**Tools**

- Eclipse IDE

##  Source Code Review
 
 this code print a title in the screen and the 4 type of renting using the methode print and take the user answer using the methode scanner 


	System.out.println("\n\nWelcome to the Bikes Rental Company"); 
		System.out.println("=================================================");
		Scanner clavier = new Scanner(System.in);
	    System.out.print("1. Rental by hour, \r\n" + 
	    		"2. Rental by day, \r\n" + 
	    		"3. Rental by week, \r\n" + 
	    		"4. Family Rental 30% of the total price ");
	    System.out.print("\rYour Answer :");
	    int Rent = clavier.nextInt();
this code is going to run if the user chose to rent by hour , it print in the screen the price per hour and ask the user how many hours he would like to rent using the methode print , and its going to take the user answer using the methode scanner , and at the end is going to calculate and print the total price . 

! the same logic happen for rent by day and by week 

     if (Rent == 1 ){ 
        	        System.out.println("Rental by hour, charging"+" "+ RH +"$ Per Hour ");
        	        Scanner clavier1 = new Scanner(System.in);
        	        System.out.print("How many hours Would you like to rent : ");
        	        System.out.print("\rYour Answer :");
        	        int Hour = clavier.nextInt();
        	        // this line calculate and print the total price 
        	        System.out.print("total amount of "+Hour+" "+"hours is"+" "+Hour*RH+"$");
Rent by day 

    if (Rent == 2 ){ 
    	        System.out.println("Rental by Day , charging"+" "+ RD +"$ Per Day ");
    	        Scanner clavier2 = new Scanner(System.in);
    	        System.out.print("How many days Would you like to rent : ");
    	        System.out.print("\rYour Answer :");
    	        int Day = clavier.nextInt();
    	        // this line calculate and print the total price 
    	        System.out.print("total amount of "+Day+" "+"days is"+" "+Day*RD+"$");

rent by week 

    if (Rent == 3 ){ 
    	        System.out.println("Rental by Week , charging"+" "+ RW +"$ Per Week ");
    	        Scanner clavier3 = new Scanner(System.in);
    	        System.out.print("How many weeks Would you like to rent : ");
    	        System.out.print("\rYour Answer :");
    	        int WeeK = clavier.nextInt();
    	        // this line calculate and print the total price 
    	        System.out.print("total amount of "+WeeK+" "+"weeks is"+" "+WeeK*RW+"$");
    	        
this following code it run if the user chose the option 4 family rental , the code is going to print a message to explaine the promotion for the user and ask him how many bikes he woul like to rent , then the code is going to test the answer of the user if its between 3 and 5 , if the test is false a error message appear , if its true is going to ask the user about wich type of renting then calculate the total and print the answer 

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


