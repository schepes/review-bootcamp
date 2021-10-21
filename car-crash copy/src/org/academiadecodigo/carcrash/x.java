package org.academiadecodigo.carcrash;

public class x {
    public static void main(String[] args) {
        System.out.println(1+2.5);
        int[] arr = {1,2,3,4};
        a(new int[]{1, 2, 3});
        int[] b = arr;
        b[1] = 10;
        System.out.println(arr[1]);


    }
    public static void a(int[] a){
        System.out.println(a[0] + " " + a[1]);
    }
}
class Faculty extends Employee {
    public Faculty(String aa) {
        super(aa);
    }

    public static void main(String[] args) {Faculty a = new Faculty();}
    public Faculty() { System.out.println("(4) Faculty's no-arg constructor is invoked");}
}
class Employee extends Person {
    public Employee() {
        this("(2) Invoke Employee’s overloaded constructor");
        System.out.println("(3) Employee's no-arg constructor is invoked");
    }
    public Employee(String s) {
        super();
        System.out.println(s); }
}
class Person {
    public Person() { System.out.println("(1) Person's no-arg constructor is invoked"); }
}
