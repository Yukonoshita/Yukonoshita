package com;

import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
      System.out.println("排序前：" + Arrays.toString(arr));
      Arrays.sort(arr);
      System.out.println("排序后：" + Arrays.toString(arr));
      
   } 
}