/* loops make it easy  for us to tell the computers that a given set of instructions need to be  executed repeatedly .
 There are three types of loops -
 1.while loop
 2.do-while
 3.for loop */
class Test{
    public static void main(String[] args) { 
      int a=1;
      while(a<6)//while loop checks the condition and executes the code 
      {
        System.out.println(a);
        a++;
      }
      int a1=1;
      // do while executes the code then check the conditions
      do {
            System.out.println(a1);
            a1++;
        }while(a1<6);
//for loop
        for(int i=0;i<6;i++){
            System.out.println(i);
        }
    }

}