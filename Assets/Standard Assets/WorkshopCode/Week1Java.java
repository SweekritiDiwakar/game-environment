// public class qno1 {
//     public static void main(String[] args) {
//         String name = "Sweekriti Diwakar";
//         int age = 20;
//         int studentNumber = 2431369;
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(studentNumber);

//     }
// }


// public class qno2{
//     public static void main(String[] args) {
//         int difference = 45-32;
//         int product= 45*32;
        
//         System.out.println(difference);
//         System.out.println(product);
//     }
// }


// public class qno3 {
//     public static void main(String[] args) {
//         // Define the variables
//         int myInt = 20;
//         double myDouble = 4.44;
//         char myChar = 'S';
        
//         // Print the variables
//         System.out.println("Integer: " + myInt);
//         System.out.println("Double: " + myDouble);
//         System.out.println("Character: " + myChar);
//     }
// }


// import java.util.Scanner;

// public class qno4 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             // Prompt the user to enter the sides of the triangle
//             System.out.println("Enter the length of side a:");
//             double a = in.nextDouble();

//             System.out.println("Enter the length of side b:");
//             double b = in.nextDouble();

//             System.out.println("Enter the length of side c:");
//             double c = in.nextDouble();

//             // Calculate the semi-perimeter
//             double s = (a + b + c) / 2;
           
//             double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
          
//             System.out.println("The area of the triangle is: " + area);
            
//         }
//     }
// }


// import java.util.Scanner;

// public class qno5 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             // Prompt the user to enter the sides of the triangle
//             System.out.println("Enter the length of the rectangle: ");
//             double length = in.nextDouble();

//             System.out.println("Enter the width of the rectangle: ");
//             double width = in.nextDouble();
           
//             double perimeter = (length + width)*2;
          
//             System.out.println("The perimeter of rectangleis: " + perimeter); 
//         }
//     }
// }


// import java.util.Scanner;

// public class qno6 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             // Prompt the user to enter the sides of the square
//             System.out.println("Enter the length of the square: ");
//             double length = in.nextDouble();
           
//             double area = length*length ;
          
//             System.out.println("The area of square is: " + area); 
//         }
//     }
// }


// import java.util.Scanner;

// public class qno7 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter the current temperature to change into the Fahrenheit: ");
//             double C = in.nextDouble();
           
//             double F = C * 9/5 + 32;
          
//             System.out.println("The temperature in Fahrenheit is: " + F); 
//         }
//     }
// }


// import java.util.Scanner;

// public class qno8 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter the radius of the cylinder:");
//             double radius = in.nextDouble();
            
//             System.out.println("Enter the height of the cylinder:");
//             double height = in.nextDouble();
            
//             double volume = Math.PI * Math.pow(radius, 2) * height;
            
            
//             System.out.println("The volume of the cylinder is: " + volume);
//         }
//     }
// }



// import java.util.Scanner;

// public class qno9 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter the principal amount:");
//             double principal = in.nextDouble();
            
//             System.out.println("Enter the rate of interest:");
//             double rate = in.nextDouble();

//             System.out.println("Enter the time period:");
//             double time = in.nextDouble();
            
//             double interest = (principal * rate * time) / 100;
            
            
//             System.out.println("The simple interest is: " + interest);
//         }
//     }
// }


// import java.util.Scanner;

// public class qno10 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter a number:");
//             int a = in.nextInt();
            
//             System.out.println("Enter another number:");
//             int b= in.nextInt();

//             int sum = a+b;
//             int sub = a-b;
//             int mul = a*b;
//             int div = a/b;
            
            
//             System.out.println("The sum is: " + sum);
//             System.out.println("The sub is: " + sub);
//             System.out.println("The mul is: " + mul);
//             System.out.println("The div is: " + div);
//         }
//     }
// }


// import java.util.Scanner;
// public class qno11 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter the distance in miles:");
//             double miles = in.nextDouble();
            
//             double km = miles*1.6;
            
            
//             System.out.println("The distance in kilometer is: " + km);
//         }
//     }
// }


// import java.util.Scanner;

// public class qno12 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
     
//             System.out.println("Enter the radius of the circle:");
//             double radius = in.nextDouble();

//             double area = Math.PI * radius * radius;

//             System.out.println("The area of the circle is: " + area);
//         }
//     }
// }
 

// import java.util.Scanner;

// public class qno13 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
     
//             System.out.println("Enter the price:");
//             double price = in.nextDouble();

//             System.out.println("Enter the quantity:");
//             double quantity = in.nextDouble();

//             double total = price * quantity;

//             System.out.println("The total price for a given quantity is: " + total);
//         }
//     }
// }
 

// import java.util.Scanner;

// public class qno14 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
     
//             System.out.println("Enter the amount of money:");
//             double amount = in.nextDouble();

//             System.out.println("Enter the exchange rate:");
//             double rate = in.nextDouble();

//             double convertedAmount = amount * rate;

//             System.out.println("the converted amount is: " + convertedAmount);
//         }
//     }
// }


// import java.util.Scanner;

// public class qno15 {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.println("Enter a number:");
//             int a = in.nextInt();
            
//             System.out.println("Enter another number:");
//             int b= in.nextInt();

//             int sum = a+b;
//             int difference = a-b;
//             int product = a*b;
//             int quotient = a%b;
            
            
//             System.out.println("The sum is: " + sum);
//             System.out.println("The difference is: " + difference);
//             System.out.println("The product is: " + product);
//             System.out.println("The quotient is: " + quotient);
//         }
//     }
// }


// public class qno16 {
//     public static void main(String[] args) {
//         boolean exp1, exp2;

//         exp1 = (5 > 3);
//         exp2 = (8 > 5);
//         boolean And = exp1 && exp2;
//         System.out.println("Logical AND (5 > 3) && (8 > 5): " + And);

//         exp1 = (5 > 3);
//         exp2 = (2 > 5);
//         boolean Or = exp1 || exp2;
//         System.out.println("Logical OR (5 > 3) || (2 > 5): " + Or);

//         exp1 = !(5 == 10);
//         System.out.println("Logical NOT !(5 == 10): " + exp1);
//     }
// }
