package codegym;

public class MyLinkedList {
    private Node head;
    private int numNodes = 1;

    private  Node tail;

    public MyLinkedList(Object data) {
        head = new Node(data);
        tail = head;
    }
    private class Node {
        private Node next = null;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public Node getNext() {
            return next;
        }
    }
        public int size() {
            return numNodes;
        }
        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public void add(int index, Object data) {
            Node temp = moveToIndex(index -1);
            Node holder;
            if (temp == null) {
                temp = movetoTail();
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }

        public void addFirst(Object data) {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            numNodes++;
        }

        public void addLast(Object data) {
            Node temp = movetoTail();
            temp.next = new Node(data);
            tail = temp.next;
            numNodes++;
        }

        public Node getNode(int index) {
            return moveToIndex(index);
        }

        public boolean remove(int index) {
            if (index < 0 || index >= numNodes)
               return false;
            else if (index == 0)  removeFirst();
            else if (index == numNodes - 1)  removeLast();
            else {
                Node temp = moveToIndex(index - 1);
                Node current = temp.next;
                temp.next = current.next;
                current.next = null;
                numNodes--;
            }
        }

        public void removeFirst() {
            Node temp = head.next;
            head.next = null;
            head = temp;
            numNodes--;
        }
        public void removeLast() {
            Node temp = moveToIndex(numNodes - 2);
            temp.next = null;
            tail = temp;
            numNodes--;
        }

        public void clear() {
            head = null;
            tail = null;
        }
        public boolean isContain(Object data) {
            Node temp = head;
            while (!(temp == null)) {
                if (temp.getData().equals(data)){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        public int indexOf(Object data) {
            Node temp = head;
            for (int i = 0; i < numNodes; i++) {
                if (temp.getData().equals(data)) {
                    return i;
                }
                temp = temp.next;
            }
            return -1;
        }

        public MyLinkedList clone() {
            Node cloneCursor = head;
            MyLinkedList clone = new MyLinkedList(cloneCursor.getData());
            for (int i = 0; i < numNodes; i++) {
                cloneCursor = cloneCursor.next;
                clone.addLast(cloneCursor.getData());
            }
            return clone;
        }

        public void printList() {
            Node temp = head;
            while (temp != null ) {
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
            System.out.print("\n");
        }
        public Node moveToIndex(int index) {
            Node cursor = head;
            if (index < numNodes && index >= 0) {
                for (int i = 0; i < index; i++) {
                    cursor = cursor.next;
                }
                return cursor;
            }
            return null;
        }
        public Node movetoTail() {
            Node cursor = head;
            while (!(cursor == tail)) {
                cursor = cursor.next;
            }
            return  cursor;

    }
}
