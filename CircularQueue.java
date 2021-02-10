//AboAgiza10

public class CircularQueue {

    int SIZE = 5;
    int front, rear;
    int items[] = new int[SIZE];

    CircularQueue() {
        front = -1;
        rear = -1;
    }

    //Check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Adding an element
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % SIZE;
            }
            return element;
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE) {
                System.out.print(items[i] + " ");
            }
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        // Fails because front = -1
        q.deQueue();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        q.display();

        int element = q.deQueue();

        if (element != -1) {
            System.out.println("Deleted Element is " + element);
        }
        q.display();

        q.enQueue(7);

        q.display();

        q.enQueue(8);
    }

}
