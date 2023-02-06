import java.util.Scanner;

public class calculator {
	
	public static double[] numberArray;
	static Scanner Argus = new Scanner(System.in);
	
   public static void main (String[] args) {
      
      boolean operator = true;
		boolean again = true;
		
		while (again == true) {
         
            while (operator == true) {
            	System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                String operation = Argus.next();
                
               if (operation.equals("+")) { 
            	   System.out.println("How many numbers do you want to add?");
            	   
            	   array();
            	   
    	            double result = addition(numberArray);
    	            System.out.println("Result: "+ result);
    	            operator = false;
               }
               else if (operation.equals("-")) {
                  System.out.println("How many numbers do you want to subtract?");
               
                  array();
                  
                  double result = subtraction(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("*")) {
                  System.out.println("How many numbers do you want to multiply?");
               
                 array();
                 
                  double result = multiply(numberArray);
                  System.out.println("Result: " + result);
                  operator = false;
               }
         
               else if (operation.equals("/")) {
                  System.out.println("How many numbers do you want to divide?");
            
                  array();
                  
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
   
   public static void array () {
   	
	   boolean error = true;
	   String number = Argus.next();
	   int num = 0;
	   double nums = 0;
	   while (error == true) {
		   try {
			   num = Integer.parseInt(number);
			   error = false;
		   }
		   catch(NumberFormatException e) {
			   System.out.println("Input a number above 0");
			   number = Argus.next();
		   }
	   }
	   
     numberArray = new double [num];

	 System.out.println("Enter " +num+ " numbers");

     for (int i = 0; i < num;i++) {
         number = Argus.next();
         try {
        	 nums = Double.parseDouble(number);
        	 numberArray[i] = nums;
         }
         catch(NumberFormatException e) {
        	System.out.println("Input a number");
        	i--;
         }
     }
     
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
