public class LinkedList {
    private class Node {
        int data;
        Node next;
        Node(int data,Node next)
        {
            this.next=next;
            this.data=data;
        }
    }
    private Node head;
    private int size;
    private Node tail;
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public void addFirst(int item)
    {
        Node newNode= new Node(item,this.head);
        if (this.isEmpty()) {
            this.tail = newNode;
        }
        this.head=newNode;
        this.size++;
    }
    public Node NodeAtindex(int idx)
    {
        Node temp = this.head;
//        System.out.println(temp.data);
        int size=size();
//        System.out.println(size);
        while (idx>0)
        {
//            System.out.println(temp.data);
//            System.out.println(size);
            temp=temp.next;
            idx--;
        }

        return temp;

    }
    public void addLast(int item)
    {

        if(this.size()==0)
            this.head.data=item;
        Node temp = new Node(item,null);
        Node last= NodeAtindex(3);
        System.out.println(last.data);

        last.next=temp;
        temp.next=null;
        size++;

    }
    public int getNodeAt(int index)
    {
        Node temp = this.head;
        int ans=0;

        while (index>0 )
        {

            ans=temp.data;
//            System.out.println(ans);
            temp=temp.next;
            index--;
        }
        return ans;

    }
    public boolean isPalindrome()
    {
        int i=1;
        int j=size();

        while (i<=j)
        {

            if(getNodeAt(i)!=getNodeAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void display()
    {
        Node tobePrinted= this.head;
//        System.out.println(tobePrinted.data);
        for (int i = 0; i <this.size() ; i++) {
            System.out.println(tobePrinted.data);
            tobePrinted=tobePrinted.next;
        }
    }
}
