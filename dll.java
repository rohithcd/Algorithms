
import java.util.Scanner;

class dll {
    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    dll() {
        tail = head = null;
        size = 0;
    }

    void insertHead(int data) {
        node newNode = new node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
        System.out.println("Inserted");
    }

    void insertTail(int data) {
        node newNode = new node(data);
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
        System.out.println("Inserted");
    }

    void insertAfter(int key, int data) {
        node newNode = new node(data);
        node ptr = head;
        while (ptr != null) {
            if (ptr.data == key) {
                newNode.next = ptr.next;
                newNode.prev = ptr;
                if (ptr.next != null) {

                    ptr.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                ptr.next = newNode;
                size++;
                System.out.println("Inserted");
                return;
            }
            ptr = ptr.next;
        }
        System.out.println("key not found!!");
    }

    void deleteHead() {
        if (head == null && tail == null) {
            System.out.println("underflow!!");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            head = tail = null;
        }
        System.out.println("Deleted");
        size--;

    }

    void deleteTail() {
        if (head == null && tail == null) {
            System.out.println("underflow!!");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            tail = head = null;
        }
        System.out.println("Deleted");
        size--;

    }

    void deleteKey(int key) {
        node ptr = head;
        while (ptr != null) {
            if (ptr.data == key) {
                if (ptr.prev == null) {
                    head = head.next;
                }
                if (ptr.next != null) {
                    ptr.next.prev = ptr.prev;
                } else {
                    tail = ptr.prev;
                }
                if (ptr.prev != null) {
                    ptr.prev.next = ptr.next;
                }
                System.out.println("Deleted");
                size--;
                return;
            }
            ptr = ptr.next;
        }
        System.out.println("key not found!!");
    }

    void display() {
        if (head == null && tail == null) {
            System.out.println("underflow!!");
            return;
        }
        node ptr = head;
        System.out.println("LIST:");
        while (ptr != null) {
            if (ptr.next != null) {
                System.out.print(ptr.data + " <=> ");
            } else {
                System.out.print(ptr.data);
            }
            ptr = ptr.next;
        }
        System.out.println("\nhead:" + head.data);
        System.out.println("tail:" + tail.data);
    }

    public static void main(String[] args) {
        dll doll = new dll();
        Scanner in = new Scanner(System.in);
        int key, p = 50, data;
        char ch;
        while (p > 0) {
            System.out.println(
                    "-----OPTIONS------\n1.insert at head\n2.insert at tail\n3.insert after key\n4.delete head element\n5.delete tail element\n6.delete a key\n7.display\n8.exit\nenter option:");
            ch = in.next().charAt(0);
            switch (ch) {
                case '1':
                    System.out.print("\nenter element To be Inserted:");
                    data = in.nextInt();
                    doll.insertHead(data);
                    break;
                case '2':
                    System.out.print("\nenter element To be Inserted:");
                    data = in.nextInt();
                    doll.insertTail(data);
                    break;
                case '3':
                    System.out.print("\nenter key:");
                    key = in.nextInt();
                    System.out.print("\nenter element To be Inserted:");
                    data = in.nextInt();
                    doll.insertAfter(key, data);
                    break;
                case '4':
                    doll.deleteHead();
                    break;
                case '5':
                    doll.deleteTail();
                    break;
                case '6':
                    System.out.print("\nenter key:");
                    key = in.nextInt();
                    doll.deleteKey(key);
                    break;
                case '7':
                    doll.display();
                    System.out.println("size:" + doll.size);
                    break;
                case '8':
                    p = 0;
                    break;
                default:
                    System.out.println("invalid option!!");
            }

        }
    }
}
