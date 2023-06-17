import java.util.Scanner;
    class Input{
        public static void main(String args[]){
            Scanner obj1= new Scanner(System.in);
            
            int a;
            System.out.println("Enter integer");
            a= obj1.nextInt();
            System.out.println("integer is= " +a);
     
            float b;
            System.out.println("Enter float");
            b=obj1.nextFloat();
            System.out.println("float is= " +b);
 
            double c;
            System.out.println("enter double");
            c=obj1.nextDouble();
            System.out.println("double is= " +c);

            char d;
            System.out.println("Enter character");
            d=obj1.next().charAt(0);
            System.out.println("character is= " +d);
        }
    }