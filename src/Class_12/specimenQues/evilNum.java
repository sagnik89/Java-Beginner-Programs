package Class_12.specimenQues;

import java.util.Scanner;

public class evilNum {

    static int num, bin;

    evilNum() {
        num = 0;
        bin = 0;
    }

    static void acceptNum() {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }

    static void rec_bin(int x) {

        if (x > 1) {
            rec_bin(x / 2);
        }
        bin = (bin * 10) + (x % 2);
    }

    static void check() {
        int c = 0, d, e;
        rec_bin(num);
        d = bin;
        while (d > 0) {
            e = d % 10;
            d /= 10;
            if (e == 1) {
                c++;
            }
        }
        if (c % 2 == 0) {
            System.out.println("Evil Number. ");
        } else {
            System.out.println("Not Evil Number. ");

        }
    }

    public static void main(String[] args) {
        evilNum ob = new evilNum();

        ob.acceptNum();
        ob.check();

    }

}
