
class Test{
  /* static void change(int a){
      a=12;
   }
   static void change2(int[] arr){
    arr[0]=10;
   }
    public static void main(String[] args) {
        int x=30;
        change(x);     //it will not change value of x
        System.out.println(x);
        int[] a={1,2,3,4}; //incase of arrays the referenced is passed. It is same case as object passing to methods.
        change2(a);
        System.out.println(a[0]);
        */
        // Two or more methods can have same name but different parameters ,its called method overloading . It can not be performed by changing the return type of method
        static void fun(){
            System.out.println("hey");
        }
        static void fun(int x,int y) //x and y are parameter.
  {
            System.out.println("sum "+ (x+y) );
        }
        public static void main(String[] args) {
           fun();
           fun(2,3)// 2 and 3 are argument.Arguments are actual.;
        }
    }
