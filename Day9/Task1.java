package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        System.out.print("Enter the space separated elements: ");
        String[] arr1=s.nextLine().split(" ");
        System.out.println("Enter the required element:");
        String req=s.next();
        s.nextLine();
        arr.addAll(Arrays.asList(arr1));
        System.out.println(arr.indexOf(req));
        System.out.println(arr.lastIndexOf(req));
    }
}


