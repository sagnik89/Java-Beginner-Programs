package Class_12.specimenQues;

//This was the 2024 specimen paper question. 
// https://cisce.org/wp-content/uploads/2023/06/868-COMPUTER-SCIENCE-PAPER-1.pdf

public class _try {

    static void Try(char ch[], int x) {
        System.out.println(ch);
        char temp;
        if (x < ch.length / 2) {
            temp = ch[x];
            ch[x] = ch[ch.length - x - 1];
            ch[ch.length - x - 1] = temp;
            Try(ch, x + 1);
        }
    }

    static void Try1(String n) {
        char c[] = new char[n.length()];
        for (int i = 0; i < c.length; i++)
            c[i] = n.charAt(i);
        Try(c, 0);
    }

    public static void main(String[] args) {

        char c[] = { 'P', 'L', 'A', 'Y' };

        Try1("SAGLNIK");

        System.out.println("Other program is: ");
    }

}

/*
 * This function reverses the string.
 * in the first input as x = 1 it only interchanges the position of the l and y.
 */
