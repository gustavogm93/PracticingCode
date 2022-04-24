public class LinkedListServices {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);

        ListNode a3 = new ListNode(1);

         /*
        ListNode a5 = new ListNode(5);

        a4.next = a5;
        a3.next = a4;
 a3.next = a4;
         */

        a2.next = a3;
        a1.next = a2;

        a1.remove(4);
        ListNode copy = a1.clone();
        ListNode rev = reverseList(copy);

        ListNode curr1 = a1;
        ListNode curr2 = rev;
        while (curr1 != null) {

            if (curr1.val != curr2.val) {
                System.out.println(false);
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        System.out.println(true);

/*
        ListNode res = reverseList(a1);
        System.out.println(res.val);
        System.out.println(res.next.val);*/
        isPalindrome(a1);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; //save next
            curr.next = prev; //
            prev = curr; //prev == 1
            curr = next; //curr == 2
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode reversed = reverseList(head);

        while (head != null) {
            if (head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy; //punteo al inicial head
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        if (list1 != null) {
            dummy.next = list1;
        } else {
            dummy.next = list2;
        }

        return head;
    }


}
