class Test{
    public static void main(String[] args) {
       /* string is a sequence of characters.
        * string is an object in a java.
        */
        //first  method to declare string 
        String a="mahak";
        //second  method to declare string 
        String str= new String("mahak");
        String str1= new String("     mahak   ");
        String str2=new String("MAHAK");
        System.out.println("first string : "+a);
        System.out.println("second  string : "+str); 
         System.out.println("third string : "+str1);  
         System.out.println("fourth string : "+ str2);
        //string method in java
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str1.trim());
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,2));
        System.out.println(str.replace('k','l'));
        System.out.println(str.startsWith("mah"));//return  boolean value
        System.out.println(str.endsWith("ak"));  //return boolean value
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a',3));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf('a',3));
        System.out.println(str.indexOf('a'));
        System.out.println(str.equals("mahak")); //return  boolean value
        System.out.println(str.equalsIgnoreCase("Mahak"));
    }

}