package edu.fengli.demo2;

import java.util.Scanner;

public class T418 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        Queue queue = new Queue(nextInt);
        for (int i = 0; i < nextInt; i++) {
            String[] s = scanner.nextLine().split(" ");
            int caoZuo = Integer.parseInt(s[0]);
            int number = Integer.parseInt(s[1]);

            switch (caoZuo){
                case 1: queue.enQueue(number); break;
                case 2: if (queue.deQueue()!= 0){
                    System.out.println(queue.deQueue());
                } break;
                case 3: if (queue.size() != 0){
                    System.out.println(queue.size());
                } break;

                default:break;
            }
        }
    }

}

class Queue{
    private int[] arr;
    private int index;

    public Queue(int size){
        this.arr = new int[size];
    }

    public void enQueue(int element){
        arr[index] = element;
        index++;
    }

    public int deQueue(){
        if (index < 1){
            System.out.println("no");
            return 0;
        }
        return arr[index-1];
    }

    public int size(){
        if (index < 0){
            return 0;
        }
        return index;
    }
}
