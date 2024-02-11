class A{
    int id ;
    String name;
    int salary;
public void getdetails(){
    System.out.println("id is "+id);
System.out.println("Name is "+name);
}
public int getsalary(){
return salary;
}}
class Test{
    public static void main(String[] args) {
       A obj=new A(); //Instantiating a new class  A object
       A obj1=new A();
       //Setting  Attributes for Mahak
       obj.id =101;
       obj.name="Mahak";
       obj.salary=1200;
       obj.getdetails();
       //    System.out.println(obj.id);
    //    System.out.println(obj.name);
       int salary=obj.getsalary();
       System.out.println("salary is "+salary);
    //Setting  Attributes for Eshika
       obj1.id =102;
       obj1.name="Eshika";
       obj1.salary=12000;
       obj1.getdetails();
       int salary1=obj1.getsalary();
       System.out.println("salary is "+salary1);

    }
}
/*
 Output=
 id is 101
Name is Mahak
salary is 1200
id is 102
Name is Eshika
salary is 12000
 */