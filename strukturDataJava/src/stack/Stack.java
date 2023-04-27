package stack;

/**
 * Stack
 */
public class Stack {

    int top;
    int maxStack;
    int[] elemen;


    public Stack(int maxElemen){
        this.top = -1;
        maxStack = maxElemen -1;
        elemen = new int[maxElemen];
    }

    public boolean isEmpty() {
        boolean flag;
        if(top == -1){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public boolean isFull(){
        boolean flag;
        if (top == maxStack) {
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public void push(int data){
        if (isFull()) {
            System.out.println("Stack Overflow");
        }else{
            top = top + 1;
            elemen[top] = data;
        }
    }

    public int pop(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }else{
            data = elemen[top];
            elemen[top] = 0;
            top = top-1;
        }
        return data;
    }

    public void printStack(){
        if(!isEmpty()){
            System.out.println("Menampilkan urutan dari posisi tertinggi");
            for (int i = top; i > -1; i--) {
                System.out.println("Elemen ke-" + i + " = " + elemen[i]);
            }
        }else{
            System.out.println("Stack Masih Kosong");
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(100);
        s.push(10);
        s.push(5);
        s.push(20);

        s.pop();
        s.printStack();
    }
}