//  import java.util.Scanner;
// public class qno1 {
    
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the length");
//         double length = in.nextDouble();

//         System.out.println("Enter the length");
//         double breadth = in.nextDouble();
        
//         if (length == breadth){
//             System.out.println("It is a square.");
//         }else{
//             System.out.println("It is a rectangle");
//         }
//     in.close();
//     }
// }


// import java.util.Scanner;

// public class qno2 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
    
//         System.out.print("Enter a number to print its multiplication table: ");
//         int num = in.nextInt();
        
//         System.out.println("Multiplication table for " + num + ":");
        
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }
    
//         in.close();
//     }
// }


// import java.util.Scanner;
// public class qno3 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);

//         System.out.println("Enter your grade");
//         int grade = in.nextInt();

//         if(grade>0  && grade<100){
//             if (grade>40 && grade<50){
//                 System.out.println("You got a C grade");
//             }else if(grade>50 && grade<60){
//                 System.out.println("You got a C+ garde");
//             }else if(grade>60 && grade<70){
//                 System.out.println("You got a B grade");
//             }else if(grade>70 && grade<80){
//                 System.out.println("You got a B+ grade");
//             }else if(grade>80 && grade<90){
//                 System.out.println("You got an A gradae");
//             }else if(grade>90){
//                 System.out.println("You got an A+ grade");
//             }else{
//                 System.out.println("You are failed.");
//             }
//         }else{
//             System.out.println("Invalid marks");
//         }
//     }
// }


// import java.util.Scanner;

// public class qno4 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("ENter the age of first person");
//         int age1 = in.nextInt();

//         System.out.println("Enter the age of second person");
//         int age2 = in.nextInt();

//         if(age1> age2){
//             System.out.println("The first person is the youngest and the second person is oldest");
//         }else{
//             System.out.println("The second person is the oldest and the first person is youngest");
//         }
//     }
// }


// import java.util.Scanner;

// public class qno5 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Do you have a medical cause? type'y' for yes and 'n' for no.");
//         char medicalCause = in.next(). charAt(0);


//         if(medicalCause == 'y'){
//             System.out.println("You're not allowed to sit in the examination");
//         }else if(medicalCause =='n'){
//             System.out.println("you're allowed to sit in the eamination");
//         }else{
//             System.out.println("Invalid input.");
//         }
//     in.close();
//     }
// }


// import java.util.Scanner;

// public class qno6 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int num1 = in.nextInt();

//         if(num1%2==0){
//             System.out.println("The given number is even");
//         }else{
//             System.out.println("The given number is odd");
//         }
//     }
// }


// import java.util.Scanner;

// public class qno7 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int num = in.nextInt();

//         if(num%2==0){
//             System.out.println("The given number is even");
//             if(num%4==0){
//                 System.out.println("The given number is divisible by 4");
//             }else{
//                 System.out.println("The given number is not divisible by 4");
//             }
//         }else{
//             System.out.println("The given number is odd");
//             if(num%7==0){
//                 System.out.println("The given number is divisible by 7");
//             }else{
//                 System.out.println("The given number is not divisible by 7");
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class qno8 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int physics, chemistry, biology, mathematics, computer;

//         System.out.print("Enter marks for Physics: ");
//         physics = in.nextInt();

//         System.out.print("Enter marks for Chemistry: ");
//         chemistry = in.nextInt();

//         System.out.print("Enter marks for Biology: ");
//         biology = in.nextInt();

//         System.out.print("Enter marks for Mathematics: ");
//         mathematics = in.nextInt();

//         System.out.print("Enter marks for Computer: ");
//         computer = in.nextInt();
       
//         int totalMarks = physics + chemistry + biology + mathematics + computer;
//         double percentage = (totalMarks / 5.0);

//         char grade;
//         if (percentage >= 90) {
//             grade = 'A';
//         } else if (percentage >= 80) {
//             grade = 'B';
//         } else if (percentage >= 70) {
//             grade = 'C';
//         } else if (percentage >= 60) {
//             grade = 'D';
//         } else if (percentage >= 40) {
//             grade = 'E';
//         } else {
//             grade = 'F';
//         }
     
//         System.out.println("Percentage: " + percentage + "%");
//         System.out.println("Grade: " + grade);
//         in.close();
//     }
// }
 

// import java.util.Scanner;

// public class qno9 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int num = in.nextInt();

//         switch (num % 2) {
//             case 0:
//                 System.out.println(num + " is even number.");
//                 break;
//             case 1:
//                 System.out.println(num + " is odd number.");
//                 break;
//             default:
//                 System.out.println("unvalid input");
//                 break;
//     }
// } 
    
// }


// import java.util.Scanner;

// public class qno10 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Enter a number to print its multiplication table: ");
//         int num = in.nextInt();

//         int i = 1;
//         System.out.println("Multiplication table for " + num + ":");
//         while (i <= 10) {
//             System.out.println(num + " x " + i + " = " + (num* i));
//             i++; 
//         }
//         in.close();
//     }
// }


// import java.util.Scanner;

// public class qno11{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Enter the value of n to sum the first n even numbers: ");
//         int n = in.nextInt();

//         int count = 0; 
//         int sum = 0;   
//         int number = 2; 

//         while (count < n) {
//             sum += number; 
//             number += 2;   
//             count++;      

//         System.out.println("The sum of the first " + n + " even numbers is: " + sum);
//         in.close();
//     }
// }
// }


// import java.util.Scanner;

// public class qno12 {
//     public static void main(String[] args) {
  
//         Scanner in= new Scanner(System.in);

//         System.out.print("Enter a number to find its factorial: ");
//         int number = in.nextInt();
//         long factorial = 1;

//         for (int i = 1; i <= number; i++) {
//             factorial *= i;
//         }

      
//         System.out.println("The factorial of " + number + " is: " + factorial);
//         in.close();
//     }
// }



// public class qno13 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// } 


// import java.util.Scanner;

// public class qno14 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the number of rows for the pyramid: ");
//         int rows = in.nextInt();

//         in.close();

     
//         for (int i = 1; i <= rows; i++) {
//             for (int j = i; j < rows; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



// public class qno15 {
//     public static void main(String[] args) {
//         int number = 1;
//         while (number <= 20) {
//             if (number % 2 == 0) {
//                 number++; 
//                 continue; 
//             }

//             System.out.println(number);
//             number++;
//         }
//     }
// }
