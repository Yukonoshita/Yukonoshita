package com.intellij;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class cache {

    static int[][] f;
    static long[][] g;
    public static long calculate(int l, int r, int[] a) {
        if (l > r) {
            return 1;
        } else if (l == r) {
            return a[l];
        } else if (g[l][r] > 0) {
            return g[l][r];
        } else {
               for (int i = l; i <= r; i++) {
                long point = calculate(l, i - 1, a) * calculate(i + 1, r, a) + a[i];
                if (point > g[l][r]) {
                    g[l][r] = point;
                    f[l][r] = i;
                }
            }
            return g[l][r];
        }
    }
    public static void build(int l, int r, ArrayList<Integer> path) {
        if (l == r) {
            path.add(l + 1);
            return ;
        }
        int root = f[l][r];
        path.add(root + 1);
        if (l < root) build(l, root - 1, path);
        if (root < r) build(root + 1, r, path);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//        f = new int[n][n]; // f[l][r] 表示[l, r]中最大得分树的根节点
//        g = new long[n][n]; // g[l][r] 表示[l, r]中的最大得分
//        long ans = calculate(0, n - 1, a);
//        ArrayList<Integer> path = new ArrayList<>();
//        build(0, n - 1, path);
//        System.out.println(ans);
//        System.out.printf("%d", path.get(0));
//        for (int i = 1; i < path.size(); i++) {
//            System.out.printf(" %d", path.get(i));
//        }
//    }
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(100, 100, 100, 100);
    frame.setVisible(true);
}
}
