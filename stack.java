
class stack {

    final int MAX_Size = 1000;
    int top;
    int Item[] = new int[MAX_Size]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    stack() {
        top = -1;
    }

    boolean push(int value) {
        if (top >= (MAX_Size - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            Item[++top] = value;
            System.out.println(value + " Added");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int value = Item[top--];
            return value;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int value = Item[top];
            return value;
        }
    }
}

class main {

    public static void main(String args[]) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Delted ");
    }
}
