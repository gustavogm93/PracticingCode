public class ReverseLinkedLIst {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a4.next = a5;
        a3.next = a4;
        a2.next = a3;
        a1.next = a2;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        ListNode b4 = new ListNode(8);
        ListNode b5 = new ListNode(4);
        ListNode b6 = new ListNode(5);

        b5.next = b6;
        b4.next = b5;
        b3.next = b4;
        b2.next = b3;
        b1.next = b2;


        ListNode res = intersection(a1, b1);
        System.out.println(res);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr.next != null) {
            ListNode next = curr.next; //save next
            curr.next = prev; //transform current next to previous 2 .next 3 = 2 next 1
            prev = curr; //prev == current with next: previuous prev == current
            curr = next; //curr == 2
        }
        return prev;

    }

    public static boolean checkNotEqualAndNotNull(ListNode a, ListNode b) {
        return (a != null && b != null && a.val != b.val);
    }

    public static ListNode intersection(ListNode listA, ListNode listB) {
        ListNode a = listA;
        ListNode b = listB;
        while (checkNotEqualAndNotNull(a, b)) {
            a = a == null ? listB : a.next;
            b = b == null ? listA : b.next;
        }
        return a;
    }

    //Intersection of Two Linked Lists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

}

