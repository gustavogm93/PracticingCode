public class palindromeLinkedList {

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);


        a3.next = a4;
        a2.next = a3;
        a1.next = a2;
        System.out.println(addTwoNumbers(a1, a1).val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10); //tecnica del porcentaje 10
            curr = curr.next;
        }
        return head.next;
    }

    public static ListNode removeNodeFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode slow = dummy_head;
        ListNode fast = dummy_head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) { //hasta que fast sea null
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy_head.next;
    }

    public static void removeNode(ListNode original, ListNode toRemove) {
        if (toRemove.next == null) {
            return;
        }
        toRemove.val = toRemove.next.val;
        toRemove.next = toRemove.next.next;

    }


    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
            if (fast == null || fast.next == null) {
                return false;
            }
        }

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode copy = clone(head);
        ListNode curr1 = head;
        ListNode curr2 = reverseList(copy);

        while (curr1 != null) {
            if (curr1.val != curr2.val) {
                return false;
            }
            curr2 = curr2.next;
            curr1 = curr1.next;

        }

        return true;

    }

    public static ListNode clone(ListNode toCopy) {
        ListNode curr = toCopy;
        ListNode returnedList = new ListNode(0);

        while (curr != null) {
            add(returnedList, new ListNode(curr.val));
            curr = curr.next;
        }

        return returnedList.next;
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

    public static void add(ListNode head, ListNode node) {

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }
}
