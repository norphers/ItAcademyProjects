import java.util.*;

public class exerciciVariables {

	public static void main(String[] args) {
		
		System.out.println("Step 1" + "\n");

        String name="Oriol";
        String surname1="Canadés";
        String surname2="Díez";
        int day=26;
        int month=2;
        int year=2020;
        System.out.print(surname1 + " " + surname2 + ", " + name + "\n");
        System.out.print(day + "/" + month + "/" + year);

       
        
        System.out.println("Step 2" + "\n");

        final int constantLeapYear=1948;

        int [] arrayLeapYears = new int[1000];
        for (int i=4; i<2024; i+=4)
            if (i%400==0 || i%4==0 || i/100!=0) {
                System.out.println(i);
            }

        Scanner entryYear = new Scanner(System.in);
        System.out.println("Introduce a year, please");

        int birthDate=entryYear.nextInt();
        int resultLYCount=(birthDate-constantLeapYear)/4;

        System.out.println("Between 1948 and " + birthDate + " there are " + resultLYCount + " leap years.");

        
        
        
        System.out.println("Step 3" + "\n");

        Scanner entryBirthYear = new Scanner(System.in);

        System.out.println("Introduce your birth year, please.");

        int birthYearDate = entryBirthYear.nextInt();

        int leapYear = 1948;

        for (int i=leapYear; i<birthYearDate; i+=4)
            System.out.println(i);

        String booLeapYearTrue="It's a leap year";
        
        String booLeapYearFalse="It isn't a leap year";

        boolean booLeapYear=false;

        if (birthYearDate%400==0 || birthYearDate%4==0 && birthYearDate/100!=0) {
            booLeapYear=true;
            System.out.println(booLeapYearTrue);
        }

        else {
            System.out.println(booLeapYearFalse);
        }

        
        
        
        System.out.println("Step 4" + "\n");

        Scanner entryName = new Scanner(System.in);
        System.out.println("Introduce your name, please.");
        String yourName=entryName.nextLine();

        Scanner entrySurname = new Scanner(System.in);
        System.out.println("Now, introduce your surname, please.");
        String yourSurname=entrySurname.nextLine();

        String completeName = yourName + " " + yourSurname; // complete variable name

        Scanner entryDay = new Scanner(System.in);
        System.out.println("Introduce your day birth, please.");
        int dayBirth=entryDay.nextInt();

        Scanner entryMonth = new Scanner(System.in);
        System.out.println("Now, introduce your month birth, please.");
        int monthBirth=entryMonth.nextInt();

        Scanner entryYear2 = new Scanner(System.in);
        System.out.println("Finally, introduce your year birth, please.");
        int yearBirth=entryYear2.nextInt();

        String completeDate = Integer.toString(monthBirth) + "/" + Integer.toString(dayBirth) + "/" + Integer.toString(yearBirth); 

        if (yearBirth%400==0 || yearBirth%4==0 && yearBirth/100!=0) {
            System.out.println(completeName + ", " + completeDate + ". " + yearBirth + " was a leap year");
        }

        else {
            System.out.println("Your name is " + completeName + "\n" + "You were born " + completeDate + " and " + yearBirth + " was a leap year.");
        }

	}

}
