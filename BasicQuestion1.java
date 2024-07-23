import java.util.Scanner;

public class BasicQuestion1{
 public static void main(String args[])
 {
 
 //part 1
    String Firstname;
	String Lastname;
	
    Scanner mykeyboard = new Scanner(System.in);
	
	System.out.println("Enter Firstname:");
	Firstname = mykeyboard.nextLine();
	
	System.out.println("Enter Middlename:");
	String Middlename = mykeyboard.nextLine();
	
	System.out.println("Enter Lastname:");
	Lastname = mykeyboard.nextLine();
	
	String Fullname1 = (Firstname+" "+Middlename+" "+Lastname);
	System.out.printf("%s \n", Fullname1);
	
	//part2
	
	System.out.printf("Enter another fullname:");
	String SecondFullname = mykeyboard.nextLine();
	
	if(Fullname1.equalsIgnoreCase(SecondFullname)){
	  //Names are same
	  System.out.printf("The names are in the same \n");
	  }
	  else {
	   //Names are different
	   System.out.printf("The names are in the different \n");
	}
	
	// part 3
	// replace 'a' wiht '@' and replace 'e' with '3'
	String modifyFullname = Fullname1.replace('a','@').replace('e','3');
	
	// convert the modified fullname to uppercase
	modifyFullname = modifyFullname.toUpperCase();
	
	//Display the modiefied fullname
	System.out.printf("%s\n", modifyFullname);
	
	
	// part 4
	
	String[] parts = Fullname1.split(",\\s|\\s");
	System.out.printf("The firstname is: %s \n",parts[0]);
	System.out.printf("The middlename is: %s \n",parts[1]);
	System.out.printf("The lastaname is: %s \n",parts[2]);
	
	// part 5
	
	
	mykeyboard.close();
	
	
   
 }
}
