public class Client {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
//        System.out.println(ll.size());
        ll.addLast(1);
//        System.out.println(ll.NodeAtindex(2));
        System.out.println(ll.getNodeAt(8));
//        System.out.println(ll.getNodeAt(2));
//        System.out.println(ll.isPalindrome());
//        System.out.println(ll.getNodeAt(4));
//        System.out.println(ll.size());
//        ll.display();
//        System.out.println(ll.size());
    }
}
