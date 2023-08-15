package Day5;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueEx {
    public static void main(String[] args) {
        Queue<Integer> nums=new LinkedBlockingQueue<>();
        Queue<Integer> nums1=new ArrayBlockingQueue<>(10);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        for (Integer k:nums){
            System.out.println(k);
        }
        for (Integer k:nums1){
            System.out.println(k);
        }
        System.out.println("Removing from linkedqueue");
        nums.remove(1);
        nums.remove(2);
        for (Integer k:nums){
            System.out.println(k);
        }
        System.out.println("Removing from arrayqueue");
        nums1.remove(1);
        nums1.remove(2);
        for (Integer k:nums){
            System.out.println(k);
        }
        System.out.println("Element operation");
        System.out.println(nums.element());
        System.out.println(nums1.element());
        System.out.println("Peek operation");
        System.out.println(nums.peek());
        System.out.println(nums1.peek());
        System.out.println("Offer operation");
        System.out.println(nums.offer(1));
        System.out.println(nums1.offer(1));
    }
}
