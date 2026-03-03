// public class Practice {         //class --> blueprint
//     public static void main(String[] args){     // starting point of program
//         System.out.println("Hello Java");      //printinf statement
//     }
// }


// public class Practice{
//     public static void main(String[] args){
//         System.out.println("My Name is Sushma");
//         System.out.println("Studied at Aditya College of Engineering & Technology");
//         System.out.println("Pursuing MCA");
//     }
// }


// public class Practice{
//     public static void main(String[] args){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }



// public class Practice{
//     public static void main (String[] args){
//         int age = 21;               //These are the data types used in Java
//         double marks = 85.5;
//         char grade = 'A';
//         String name = "Sushma";
//         boolean isStudent = true;

//         System.out.println("Name : " +name);
//         System.out.println("Age : " +age);
//         System.out.println("Marks : "+marks);
//         System.out.println("Grade : "+grade);
//         System.out.println("Student or not: "+isStudent);
//     }
// }





// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your Name: ");
//         String name = sc.nextLine();
//         System.out.println("Enter your Age: ");
//         int age = sc.nextInt();
//         sc.nextLine();

//         System.out.println("Hello " +name+ " Your Age is " +age);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any 2 values: ");
//         int val1 = sc.nextInt();
//         int val2 = sc.nextInt();
//         System.out.println("Sum of Given Values: " +(val1 + val2));
//         System.out.println("Difference of Given Values: " +(val1 - val2));
//         System.out.println("Product of Given Values: " +(val1 * val2));
//         System.out.println("Quotient of Given Values: " +((double)val1 / val2));
//         System.out.println("Remainder of Given Values: " +(val1 % val2));

//     }
// }




// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 subjects: ");
//         int sub1= sc.nextInt();
//         int sub2 = sc.nextInt();
//         int sub3 = sc.nextInt();

//         int total = (sub1+sub2+sub3);
//         System.out.println("Total marks obtained: " +total);
//         int avg = (sub1+sub2+sub3) / 3;
//         System.out.println("Average of 3 subjects: "+avg);
//         double perc = (total/300.0)* 100;
//         System.out.println("Percentage: "+perc);
//     }   
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter radius: ");
//         int r = sc.nextInt();
//         double pie = 3.14;
//         double area = pie * r * r;
//         System.out.println("Area of Circle: "+area);
//         double pm = 2 * pie * r;
//         System.out.println("Perimeter of Circle: "+pm);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         if(num % 2 == 0)
//             System.out.println(num+ " is Even.");
//         else
//             System.out.println(num+ " is Odd.");
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         boolean isPrime = true;
//         if(num <= 0){
//             isPrime = false;
//         }else {
//             for(int i = 2; i <= num / 2; i++){
//                 if(num % i == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime)
//             System.out.println(num + " is Prime Number.");
//         else 
//             System.out.println(num + " is NOT a Prime Number.");
//     }
// }



// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Emter any Number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int sum = 0;
//         while(num > 0){
//             int digit = num % 10;
//             sum = sum + (digit * digit * digit);
//             num = num / 10;
//         }
//         if(sum == original)
//             System.out.println(original + " is an Armstrong Number.");
//         else
//             System.out.println(original + " is NOT an Armstrong Number.");
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int rev = 0;
//         while(num > 0){
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }
//         if(rev == original)
//             System.out.println(original + " is Palindrome Number.");
//         else 
//             System.out.println(original + " is NOT Palindrome Number.");
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int rev = 0;
//         while(num > 0){
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }
//         System.out.println("Reversed Number: "+rev);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int sum = 0;
//         while(num > 0){
//             int digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.println("Sum of Digits: "+sum);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of Steps: ");
//         int num = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.println(a + " " +b+ " ");
//         for(int i = 3; i <= num; i++){
//             int c = a + b;
//             System.out.println(c + " ");
//             a = b;
//             b = c;
//         }
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any Number: ");
//         int num = sc.nextInt();
//         int fact = 1;
//         for(int i = 1; i <= num; i++){
//             fact = fact * i;
//         }
//         System.out.println("Factorail : "+fact);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " +n+ " Numbers: ");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Array Elements: ");
//         for(int i = 0; i < n; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Size of Array: ");
//         int n = sc.nextInt();
//         int[] array = new int[n];
//         System.out.println("Enter " +n+ " Elements: ");
//         for(int i = 0; i < n; i++){
//             array[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum = sum + array[i];
//         }
//         System.out.println("Sum of Elements in Array: " +sum);
//     }
// }

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " +n+ " Elements: ");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for(int i = 1; i < n; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("Max Number: "+max);
//     }
// }


// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter " +n+ " Elements: ");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int min = arr[0];
//         for(int i = 1; i < n; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }
//         System.out.println("Max Number: "+min);
//     }
// }





// String Methods: 

// length()   ---------------------------- to find the length of String

// charAt(index)  ------------------------ trace the character at specific index

// substring(start, end) ----------------- 

// toUpperCase(), toLowerCase() ---------- converts lower to uppercase and upper to lowercase characters in given string

// equals() ------------------------------ 

// equalsIgnoreCase() --------------------

// contains() ----------------------------

// indexOf() -----------------------------

// replace() -----------------------------

// import java.util.Scanner;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any String: ");
//         String name = sc.nextLine();
//         System.out.println("Length: " +name.length());
//         System.out.println("UpperCase Format: " +name.toUpperCase());
//         System.out.println("First Character: " +name.charAt(0));
//     }
// }

import java.util.Scanner;

public class Practice{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Total Vowels: "+count);
    }
}