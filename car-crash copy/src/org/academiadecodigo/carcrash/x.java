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
