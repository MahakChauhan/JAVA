/*Java Recursion occurs when a function calls itself
With the help of recursion, we can break down complex problems into simple problems.
Example: Factorial of a number */
class Test{
 static  int factorial(int x){
    if(x==0||x==1){
        return 1;
    }
    else{
        return x*factorial(x-1);
 }
    }
    public static void main(String[] args) {
        System.out.println(" factorial is "+factorial(5));
    }
}