package net.wqrld;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pattern p = Pattern.compile("(\\d+)x \\+ (\\d+)y = (\\d+)", Pattern.CASE_INSENSITIVE);

        // 1-indexed to make the groups and equations easier to deal with.
        int[] eq1 = new int[4];
        int[] eq2 = new int[4];


        boolean haveEquation1 = false;
        do {
            System.out.println("equation 1: (ax + by = c)");

            Matcher m = p.matcher(sc.nextLine());
            if (m.find() && m.groupCount() == 3) {
                // Index 0 is the full string
                for (int i = 1; i < m.groupCount() + 1; i++) {
                    System.out.println(m.group(i));
                    eq1[i] = Integer.parseInt(m.group(i));
                }
                haveEquation1 = true;
            } else {
                System.out.println("invalid equation 1, please try again:");
            }

        } while (!haveEquation1);

        boolean haveEquation2 = false;
        do {
            System.out.println("equation 2: (ax + by = c)");

            Matcher m = p.matcher(sc.nextLine());
            if (m.find() && m.groupCount() == 3) {
                // Index 0 is the full string
                for (int i = 1; i < m.groupCount() + 1; i++) {
                    System.out.println(m.group(i));
                    eq2[i] = Integer.parseInt(m.group(i));
                }
                haveEquation2 = true;
            } else {
                System.out.println("invalid equation 2, please try again:");
            }

        } while (!haveEquation2);

        // Check determinant
        int d = eq1[1] * eq2[2] - eq1[2] * eq2[1];
        if (d == 0) {
            System.out.println("Determinant is 0");
            return;
        }

        double x = (eq2[2] * eq1[3] - eq1[2] * eq2[3]) / d;
        double y = (eq1[1] * eq2[3] - eq2[1] * eq1[3]) / d;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
