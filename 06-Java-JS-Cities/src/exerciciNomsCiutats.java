import java.util.*;

public class exerciciNomsCiutats {

	public static void main(String[] args) {
		
		System.out.println("\n" + "Step 1" + "\n");
		
		String city1;
		String city2;
		String city3;
		String city4;
		String city5;
		String city6;
		
		Scanner askCity1 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city1 = askCity1.next();
		
		Scanner askCity2 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city2 = askCity2.next();
		
		Scanner askCity3 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city3 = askCity3.next();
		
		Scanner askCity4 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city4 = askCity4.next();
		
		Scanner askCity5 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city5 = askCity5.next();
		
		Scanner askCity6 = new Scanner(System.in);
		System.out.println("Write a city name: ");
		city6 = askCity6.next();
		
		System.out.println("Cities: " + city1 + ", " + city2 + ", " +  city3 + ", " +  city4 + ", " +  city5 + " and " +  city6+ ".");
		
		
		System.out.println("\n" + "Step 2" + "\n");
		
		ArrayList<String> arrayCities = new ArrayList<>();
		arrayCities.add(city1);
		arrayCities.add(city2);
		arrayCities.add(city3);
		arrayCities.add(city4);
		arrayCities.add(city5);
		arrayCities.add(city6);

		Collections.sort(arrayCities); 

        for (String city : arrayCities) {
            System.out.println(city);
        }
		 
		System.out.println("\n" + "Step 3" + "\n");
        
		ArrayList<String> arrayModCities = new ArrayList<>();
		
		for (String i : arrayCities) {
            i=i.replace('a', '4');
            arrayModCities.add(i);
        }
		
		Collections.sort(arrayModCities); 
        
        for (String i : arrayModCities) {
            System.out.println(i);
        }
  
        
        System.out.println("\n" + "Step 4" + "\n");

        char[] charCity1 = city1.toCharArray();
        for(int i=city1.length()-1; i>=0; i--) {
            System.out.println(charCity1[i]);
        }
        
        char[] charCity2 = city2.toCharArray();
        for(int i=city2.length()-1; i>=0; i--) {
            System.out.println(charCity2[i]);
        }
        
        char[] charCity3 = city3.toCharArray();
        for(int i=city3.length()-1; i>=0; i--) {
            System.out.println(charCity3[i]);
        }
        
        char[] charCity4 = city4.toCharArray();
        for(int i=city4.length()-1; i>=0; i--) {
            System.out.println(charCity4[i]);
        }
        
        char[] charCity5 = city5.toCharArray();
        for(int i=city5.length()-1; i>=0; i--) {
            System.out.println(charCity5[i]);
        }
        
        char[] charCity6 = city6.toCharArray();
        for(int i=city1.length()-1; i>=0; i--) {
            System.out.println(charCity6[i]);
        }
        
	}

}


