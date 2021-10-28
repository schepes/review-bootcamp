package org.academiadecodigo.carcrash;

import java.util.LinkedList;

public class x {
    public static void main(String[] args) {
        System.out.println(1+2.5);
        int[] arr = {1,2,3,4};
        a(new int[]{1, 2, 3});
        int[] b = arr;
        b[1] = 10;
        System.out.println(arr[1]);

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        int a = Solution.addTwoNumbers(l1,l2);
        System.out.println("this is a" + a);

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
class Solution {
    public static int addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int result=0;
        for (int i = 0; i<l1.size(); i++){
            int temp = l1.get(i) + l2.get(i);
            if(temp>=10){
                temp = temp%10;
                if(l1.get(i+1)!= null){
                    l1.set(i+1,l1.get(i+1)+1);
                }
                else{
                    temp +=10;
                }
            }
            result += temp * Math.pow(10,i);
        }
        return result;
    }
}
