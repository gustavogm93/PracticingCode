public class RemoveNthNode {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        /*ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a4.next = a5;
        a3.next = a4;
        a2.next = a3;
        a1.next = a2;
*/
        ListNode res = removeNthFromEnd(a1, 60);
        System.out.println(res.val);
        System.out.println(res.next.val);
        System.out.println(res.next.next.val);
        System.out.println(res.next.next.next.val);
    }

    // 1 2 3 4 5
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        int i = 1;
        for (; i <= n + 1; i++) {
            if (fast == null) {
                i = i - 2;
                System.out.println("Linked list has " + (i) + " items");
                System.out.println("and you are searching for remove the Nth:" + n + " element");
                break;
            }
            fast = fast.next;
        }
        /*if (i < n + 1 && fast.next == null) {
            throw new RuntimeException("Your out of index");
        } */

        // empareja fast con el valor N que deseo desde el final
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy_head.next;
    }
}
