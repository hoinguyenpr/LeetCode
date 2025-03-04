package com.pattern.slowfastpointer;

public class L202HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(totalSquareNumber(fast) != 1) {
            slow = totalSquareNumber(slow);
            fast = totalSquareNumber(totalSquareNumber(fast));
            if (slow == fast) return false;
        }
        return true;
    }

    public static int totalSquareNumber(int number) {
        int result = 0;
        while (number > 0) {
            result += (number % 10) * (number % 10);
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 17;
        int var3 = 10;
        int var4 = 13;
        int var5 = 32;
        int var6 = 44;
        int var7 = 45;

        // Test totalSquareNumber
        System.out.println("Total square of " + var1 + " is " + totalSquareNumber(var1));
        //Test isHappy
        System.out.println("Number: " + var1 + (isHappy(var1) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var2 + (isHappy(var2) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var3 + (isHappy(var3) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var4 + (isHappy(var4) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var5 + (isHappy(var5) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var6 + (isHappy(var6) ? " is Happy " : " is UnHappy "));
        System.out.println("Number: " + var7 + (isHappy(var7) ? " is Happy " : " is UnHappy "));
    }
}
