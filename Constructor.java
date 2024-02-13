class Employee{
     private String name;
     private int id;
    public Employee(){
id=101;
name="Mahak";
    }
    public Employee(int myid,String myname){
        id=myid;
        name=myname;
            }
    public Employee(String myname){ 
                name=myname;
                    }
public void setname(String name){this.name=name;}
public String getname(){return name;}
public void setid(int id){this.name=name;}
public int getid(){return id;}

}
class Test{
    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        Employee obj2=new Employee("Aditya");
        System.out.println(obj2.getname());
    }
    }
