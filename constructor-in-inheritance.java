class Base{
    Base(){
        System.out.println("I am a base class constuctor");
    }
    Base(int x){
        System.out.println("I am a base class constuctor of value of  x as "+x);
    } 
}
class Derived extends Base{
    Derived(){
        System.out.println("I am a child class constuctor");
    }
    Derived(int x,int y){super(x);
        System.out.println("I am a derived class constuctor of value  of y as"+y);
    }
}
class Childofderived extends Derived{
    Childofderived(){
    System.out.println("I am a childofderived class constuctor");}
    Childofderived(int x,int y,int z){super(x,y);
    System.out.println("I am a derived class constuctor of value  of z as "+z);
    }
}
class Test{
public static void main(String[] args) {
    Base b=new Base();
    Base b1=new Base(15);
    Derived d=new Derived();
    Derived d1=new Derived(12,32);
    Childofderived cd=new Childofderived();
    Childofderived cd1=new Childofderived(10,23,90);
}
}
/*
 Output=
 I am a base class constuctor
I am a base class constuctor of value of  x as 15
I am a base class constuctor
I am a child class constuctor
I am a base class constuctor of value of  x as 12
I am a derived class constuctor of value  of y as32
I am a base class constuctor
I am a child class constuctor
I am a childofderived class constuctor
I am a base class constuctor of value of  x as 10
I am a derived class constuctor of value  of y as23
I am a derived class constuctor of value  of z as 90
 */
