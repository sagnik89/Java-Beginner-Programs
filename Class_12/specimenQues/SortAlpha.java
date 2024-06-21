package Class_12.specimenQues;

import java.util.Scanner;

public class SortAlpha {

    int n;
    static String sent;

    public SortAlpha() {
        sent = "";
        n = 0;
    }

    void acceptsent() {
        Scanner sc = new Scanner(System.in);
        sent = sc.nextLine().toUpperCase();
        sc.close();
    }

    void sort(SortAlpha p) {
        String str_i = p.sent + " ";
        int num_words = 0, t = 0;
        String ar[], res = "", d = "";

        // counting the number of words
        for (int i = 0; i < str_i.length(); i++) {
            if (str_i.charAt(i) == ' ') {
                num_words++;
            }
        }

        ar = new String[num_words];

        // putting the words in the array
        for (int j = 0; j < str_i.length(); j++) {
            char m = str_i.charAt(j);
            if (m != ' ') {
                d += m;
            } else {
                ar[t] = d;
                d = "";
                t++;

            }
        }

        // bubbleSort
        for (int k = 0; k < num_words; k++) {
            for (int l = 0; l < num_words - 1 - k; l++) {
                if (ar[l].charAt(0) > ar[l + 1].charAt(0)) {

                    String s = ar[l];
                    ar[l] = ar[l + 1];
                    ar[l + 1] = s;
                }
            }
        }

        // updating the final string
        for (int m = 0; m < num_words; m++) {
            res += ar[m] + " ";
        }
        p.sent = res;
    }

    void display() {
        System.out.println(sent);
    }

    public static void main(String[] args) {

        SortAlpha ob = new SortAlpha();

        ob.acceptsent();
        System.out.println("Original: " + sent);
        ob.sort(ob);
        System.out.println("New: " + sent);

    }

}
