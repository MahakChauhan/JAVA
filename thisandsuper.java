 class A{
    int a;
    A(){
        System.out.println("I am a base class constructor");
    }
    public int  geta(){
        return  a;
    }
    A(int a){
        //this keyword is a way for us to reference an object of the class which is being created/refernced.
this.a=a;
    }
 }
 class B extends A{
    B( ){
        super(); //super keyword is a reference variable used to refer immediate parent class object.
        System.out.println("I am a derived class constructor");
    }
 }
 class Test {
    public static void main(String[] args) {
        A ob=new A(34);
        B ob1=new B();
        System.out.println(ob.geta());
    }
}
