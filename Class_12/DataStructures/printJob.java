package Class_12.DataStructures;

import java.util.Scanner;

// this is a pb based on queue data structure. 

public class printJob {

    int job[], newJob, front, rear, capacity;

    printJob() {
        capacity = 20;
        front = -1;
        rear = -1;
        createJob();
    }

    void createJob() {
        job = new int[capacity];
    }

    void addJob() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the new job: ");
        newJob = sc.nextInt();

        if (rear == capacity - 1) {
            System.out.println("Job full! ");
        } else {
            if (front == -1 && rear == -1) {
                front++;
                rear++;
                job[rear] = newJob;
            } else {
                rear++;
                job[rear] = newJob;
            }
        }
    }

    void removeJob() {
        if (front == -1 && rear == -1) {
            System.out.println("No jobs to delete! ");
        } else {
            System.out.println("Deleted Job: " + job[front]);
            if (front == rear) {
                front++;
                rear++;
            } else {
                front++;
            }
        }

    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(job[i] + " ");
        }
    }

    public static void main(String[] args) {
        printJob ob = new printJob();

    }
}
