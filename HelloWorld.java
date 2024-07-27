// Online Java Compiler
// wap a program to square every element of a array

class HelloWorld {
    public static void main(String[] args) {
        int a[]={4,9,5,7,3};
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        System.out.println("the squared values are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}