class Employee{
    String name;
    int salary;
public String getname(){
return name;
}
public int getsalary(){
return salary;
}
public void setname(String n)
{
    name=n;
}}
class cellphone{
    public void calling(){
System.out.println("Calling mahak");
    }
public void ringing(){
    System.out.println("ringing");
}
public void vibrating(){
    System.out.println("vibrating");
}
    }
class rectangle{
      int l,b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
class Test{
    public static void main(String[] args) {
       //problem1
       Employee obj=new Employee(); //Instantiating a new class  A object
       obj.setname("Mahak");
       obj.salary=1200;
       System.out.println("name is "+obj.getname());
       System.out.println(obj.getsalary());
       //problem2
       cellphone ob= new cellphone();
       ob.calling();
       ob.ringing();
       ob.vibrating();
       //problem3
       rectangle ob2=new rectangle();
       ob2.l=2;
       ob2.b=3;
       int c=ob2.area();
       System.out.println("area is="+c);
      ob2.l=4;
       ob2.b=6;
       int d=ob2.perimeter();
       System.out.println("perimeter is : "+d);
    }
}
