/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YN
 */
public class Queue {

    int Front = 0;
    int Rear = 0;
    int Length = 0;
    int array[];

    Queue(int Size) {
        this.Length = Size;
        this.Front = 0;
        this.Rear = 0;
        array = new int[this.Length];
    }

    public boolean isEmpty() {
        return (Front == 0 && Rear == 0);
    }

    public boolean isFull() {
        return (Front == Rear && Rear != 0);
    }

    public void Enqueue(int Value) {
        if (isFull()) {
            System.out.print("Queue Is Full");
        } else {
            Rear = (Rear + 1) % Length;
            array[Rear] = Value;
        }

    }

    public int Dequeue() {
        int Temp = array[Front];
        if (isEmpty()) {
            System.out.print("Queue Is Empty");
            return -1;
        } else {

            Front = (Front + 1) % Length;
            if (Front == Rear) {
                Front = 0;
                Rear = 0;
            }

        }
        return Temp;
    }

    void PrintArr() {
        for (int i = 0; i < Length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue Q = new Queue(5);
        Q.Enqueue(10);
        Q.Enqueue(20);
        Q.Enqueue(30);
        Q.Enqueue(40);
        Q.Enqueue(50);

        Q.PrintArr();

        Q.Dequeue();
        Q.Enqueue(40);
        Q.Enqueue(50);
        Q.PrintArr();
    }
}
