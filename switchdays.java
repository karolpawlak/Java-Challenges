import java.util.Scanner;

//Create a program that prints out number of days of a selected month
//Hint: Be careful of February

public class switchdays{
    public static void main(String[] args) {
    	Scanner scannerInput = new Scanner(System.in);
    	
    	System.out.println("Please type in a number of the month (1-12)=>");
    	int month = scannerInput.nextInt();
    	
    	System.out.println("Please type in a year =>");
        int year = scannerInput.nextInt();
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);
        scannerInput.close();
    }
}
