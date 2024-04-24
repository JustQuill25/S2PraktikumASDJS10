package praktikum2;

class Queue01 {
    Nasabah01[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue01(int n) {
        max = n;
        data = new Nasabah01[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
      
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println(
                    "Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat
                            + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
    
    }

    public void clear() {
     
    }

    public void Enqueue(Nasabah01 dt) {
   
    }

    public Nasabah01 Dequeue() {

    }
}
