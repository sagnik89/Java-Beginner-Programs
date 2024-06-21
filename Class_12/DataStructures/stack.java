package Class_12.DataStructures;

public class stack {

    String st[];
    int size, top, ctr;

    stack(int cap) {
        top = -1;
        size = cap;
        ctr = 0;
        st = new String[size];
    }

    void push(String n) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! ");

        } else {
            top++;
            st[top] = n;
            ctr++;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! ");
        } else {
            System.out.println("Element removed: " + st[top]);
            top--;
            ctr--;
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(st[i] + " ");
        }
    }

    public static void main(String[] args) {
        stack ob = new stack(20);

        ob.push("Salmon");
        ob.push("Pizza");
        ob.display();
        ob.pop();
        ob.push("Pistachios");
        ob.display();
    }
}
