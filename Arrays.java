class Test{
    public static void main(String[] args) {
        //array is a collection of similar type of data.
        int[] arr=new int[5]; // first method to declare a array
        int[] arr1;// second method to declare a array
        int arr2[]={1,2,3,4,5} ; // third method of declaration and initialization of array
        //how to access the elements of array
        arr[0]=12;
        arr[1]=13;
        arr[2]=14;
        System.out.println(arr[0]);
        System.out.println(arr[1]); 
        System.out.println(arr[2]);
        //access the elements of 1-D array using loops
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        //decalartion off 2-d array
        int a[][]=new int[2][3];
        int a1[][];
        a[0][0]=12;
        a[0][1]=13;
        a[0][2]=14;
        a[1][0]=15;
        a[1][1]=16;
        a[1][2]=17;
       //access the elements of 2-D array using loops
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]);
            System.out.print("  ");}
            System.out.println(" ");
       }

    }
}