class Stack {
    int[] numArray;
    int top;
    int size;

    public Stack(int capacity) {
        numArray = new int[capacity];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    void push(int value) {
        if (!isFull()) {
            numArray[++top] = value;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = numArray[top--];
            size--;
            return data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == numArray.length;
    }

    public int peek() {
        if (top >= 0) {
            return numArray[top];
        }
        return -1;
    }
}

class QueueWithStacks {
    Stack inbox;
    Stack outbox;

    public QueueWithStacks(int capacity) {
        inbox = new Stack(capacity);
        outbox = new Stack(capacity);
    }

    public void enqueue(int item) {
        inbox.push(item);
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.isEmpty() ? -1 : outbox.pop();
    }

    public int peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.isEmpty() ? -1 : outbox.peek();
    }

    public static void main(String[] args) {
        QueueWithStacks queue = new QueueWithStacks(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.peek());     // Output: 2
    }
}

