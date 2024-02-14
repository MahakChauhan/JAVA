class Base{
    int x;
    int y;
    public void setx(int x){
        this.x=x;
    }
    public int getx(){
        return x;
    }
    public void sety(int y){
        this.y=y;
    }
    public int gety(){
        return y;
    }
}
class Derived extends Base{
    int z;
    public void setz(int z){
        this.z=z;
    }
    public int getz(){
        return z;
    }
}
 class Inheritance {
    public static void main(String[] args) {
       //creating base class object
        Base b=new Base();
        b.setx(15);
        System.out.println(b.getx());
        b.sety(109);
        System.out.println(b.gety());
        // Not Accessible  b.setz(15);
        // System.out.println(b.getz());
        //Creating object class object
        Derived d=new Derived();
        d.sety(10);
        System.out.println(d.gety());
        d.setx(13);
        System.out.println(d.getx());
        d.setz(10);
        System.out.println(d.getz());
    }
}
/*
 Output=
 15
109
10
13
10
 */