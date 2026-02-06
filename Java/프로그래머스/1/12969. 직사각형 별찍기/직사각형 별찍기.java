import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) { //  세로
            for (int j = 1; j <= a; j++) { // 가로
                System.out.print("*");
            }
            System.out.println();
        }
    }
}