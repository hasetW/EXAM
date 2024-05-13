class Stack{
    int[] arr;
    int top;
    int size;

    public Stack(int capacity) {
        arr = new int[capacity];
        top = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    void push(int value) {
        if (!isFull()) {
            arr[++top] = value;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = arr[top--];
            size--;
            return data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int peek() {
        if (top >= 0) {
            return arr[top];
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack numStack = new Stack(4);
        numStack.push(11);
        numStack.push(22);
        numStack.pop();
        numStack.pop();
        for (int i = 0; i < numStack.size; i++) {
            System.out.println(numStack.arr[i]);
        }
    }
}
