import java.util.Scanner;

public class calculator {
   public static void main (String[] args) {
      Scanner Argus = new Scanner(System.in);
      String scifi = "Scientific";
		String stand = "Standard";
		boolean operator = true;
		boolean again = true;
		
		while (again == true) {
         System.out.println("Enter the calculator mode: Standard/Scientific?");
         String mode = Argus.next();
      
         boolean standard = stand.equalsIgnoreCase(mode);
         boolean sci = scifi.equalsIgnoreCase(mode);
      
         
         if (standard == true) {
            System.out.println("The calculator will operate in standard mode.");
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            String operation = Argus.next();
         
            while (operator == true) {
               if (operation.equals("+")) { 
    	            System.out.println("How many numbers do you want to add?");
    	
    	            int number = Argus.nextInt();
    	            double[] numberArray = new double [number];
    	
            	   System.out.println("Enter " + number + " numbers");
    	
                  for (int i = 0; i < number;i++) {
    		            numberArray[i] = Argus.nextDouble();
    	            }
    	            double result = addition(numberArray);
    	            System.out.println("Result: "+ result);
    	            operator = false;
               }
               else if (operation.equals("-")) {
                  System.out.println("How many numbers do you want to subtract?");
               
                  int number = Argus.nextInt();
                  double[] numberArray = new double [number];
               
                  System.out.println("Enter " + number+ " numbers");
               
                  for (int i = 0; i < number; i++) {
                     numberArray[i] = Argus.nextDouble();
                  }
                  double result = subtraction(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("*")) {
                  System.out.println("How many numbers do you want to multiply?");
               
                  int number = Argus.nextInt();
                  double[] numberArray = new double [number];
               
                  System.out.println("Enter " + number + " numbers");
               
                  for (int i = 0; i < number; i++) {
                     numberArray[i] = Argus.nextDouble();
                  }
                  double result = multiply(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("/")) {
                  System.out.println("How many numbers do you want to divide?");
            
                  int number = Argus.nextInt();
                  double[]numberArray = new double [number];
            
                  System.out.println("Enter "+ number + " numbers");
            
                  for (int i = 0; i<number; i++) {
                     numberArray[i] = Argus.nextDouble();
                  }
                  double result = division(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else { 
                  System.out.println("Invalid operator " + operation);
                  System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
                  operation = Argus.next();
               }
            }
         }
         
         if (sci == true) {
            System.out.println("The calculator will operate in scientific mode.");
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            String operation = Argus.next();
            while (operator == true) {
               if (operation.equals("+")) { 
    	           System.out.println("How many numbers do you want to add?");
    	
    	           int number = Argus.nextInt();
    	           double[] numberArray = new double [number];
    	
            	  System.out.println("Enter" +number+ " numbers");
    	
                 for (int i = 0; i < number;i++) {
    		            numberArray[i] = Argus.nextDouble();
    	            }
    	            double result = addition(numberArray);
    	            System.out.println("Result: "+ result);
    	            operator = false;
               }
               else if (operation.equals("-")) {
                  System.out.println("How many numbers do you want to subtract?");
               
                  int number = Argus.nextInt();
                  double[] numberArray = new double [number];
               
                  System.out.println("Enter " + number + " numbers");
               
                  for (int i = 0; i < number; i++) {
                     numberArray[i] = Argus.nextDouble();
                  }
                  double result = subtraction(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("*")) {
                  System.out.println("How many numbers do you want to multiply?");
               
                  int number = Argus.nextInt();
                  double[] numberArray = new double [number];
               
                  System.out.println("Enter" + number + " numbers");
               
                  for (int i = 0; i < number; i++) {
                     numberArray[i] = Argus.nextDouble();
                  }
                  double result = multiply(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("/")) {
                  System.out.println("How many numbers do you want to divide?");
            
                  int number = Argus.nextInt();
                  double[]numberArray = new double [number];
            
                  System.out.println("Enter " + number + " numbers");
            
                  for (int i = 0; i<number; i++) {
                  numberArray[i] = Argus.nextDouble();
                  }
                  double result = division(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equalsIgnoreCase("sin")) {
                  System.out.println("Enter a number in radians to find the sine");
                  double sin = Argus.nextDouble();
               
                  double result = sinne(sin);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equalsIgnoreCase("cos")) {
                  System.out.println("Enter a number in radians to find the cosine");
                  double cos = Argus.nextDouble();
               
                  double result = cosine(cos);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equalsIgnoreCase("tan")) {
                  System.out.println("Enter a number in radians to find the tangent");
                  double tan = Argus.nextDouble();
               
                  double result = tangent(tan);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else { 
                  System.out.println("Invalid operator " + operation);
                  System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                  operation = Argus.nextLine();
               }
            }
         }
        System.out.println("Do you want to start over? (Y/N)");
        String Determination = Argus.next();
        
        boolean mistake = true;
        int counter = 0;
        while (mistake == true) {
        	
        	if (Determination.equalsIgnoreCase("Y")) {
        		operator = true;
        		break;
        	}
        	else if (Determination.equalsIgnoreCase("N")) {
        		System.out.println("Goodbye");
        		mistake = false;
        		again = false;
        	}
        	else {
        		System.out.println("It seems you made a mistake. Try again. (Y/N)");
        		Determination = Argus.next();
        		counter = counter + 1;
        		if (counter == 3) {
        			new GameFrame();
        		}
        	}
        }
      }
		Argus.close();
   }
   public static double addition(double [] numberArray) {
	   double sum = numberArray[0];
	   for (int i = 1; i<numberArray.length; i++) {
	      sum = sum + numberArray[i];
	   }
	   return sum;
   }
   public static double subtraction(double[]numberArray) {
      double difference = numberArray[0];
      for (int i = 1; i<numberArray.length; i++) {
         difference = difference - numberArray[i];
      }
      return difference;
   }
   public static double multiply(double[]numberArray) {
      double multi = numberArray[0];
      for (int i = 1; i<numberArray.length; i++) {
         multi = multi * numberArray[i];
      }
      return multi;
   }
   public static double division(double [] numberArray) {
      double divis = numberArray[0];
      for (int i = 1; i<numberArray.length; i++) {
         divis = divis / numberArray[i];
      }
      return divis;
   }
   public static double sinne(double sin) {
      return Math.sin(sin);
   }
   public static double cosine(double cos) {
      return Math.cos(cos);
   }
  public static double tangent(double tan) {
      return Math.tan(tan);
   }
}
