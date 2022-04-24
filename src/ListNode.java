import java.util.Random;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        Random rand = new Random();
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void add(ListNode node) {

        ListNode curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public ListNode remove(int val) {
        if (val == this.val) {
            return null;
        }

        if (next == null) {
            return this;
        }

        removeInt(val);
        return this;
    }

    public ListNode clone() {
        ListNode curr = this;
        ListNode returnedList = new ListNode(0);

        while (curr != null) {
            returnedList.add(new ListNode(curr.val));
            curr = curr.next;
        }

        return returnedList;
    }

    private void removeInt(int val) {
        ListNode curr = this;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}