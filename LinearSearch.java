// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int arr[]={1,2,3,4,5};
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int arr [] =new int [size];
        System.out.println("Insert elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" Position:"+i+"-");
         arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int b=sc.nextInt();
        boolean v=false;
        for(int z=0;z<arr.length;z++){
            if(b==arr[z]){
                v=true;
                break;
            }
        }
        if(v){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}