/*conditionals statement are like decision  statement  which is depend on certain condition .It is of two types-
1.if-else statement
2.switch statement */
import java.util.Scanner;
class Test{
    public static void main(String[] args) { 
       System.out.println(" enter your age ");
       int age=sc.nextInt();
    if(age<18){
        System.out.println("you are a  teenager ");
    }
    else {
        System.out.println(" you are  an adult");
    }
       Scanner sc= new Scanner(System.in);
       System.out.println(" enter your age ");
       int age1=sc.nextInt();
    switch(age1){
        case 18:
        System.out.println(" you are child");
        break;
        case 20:
        System.out.println(" you are an adult");
        break;
    }
    }

}