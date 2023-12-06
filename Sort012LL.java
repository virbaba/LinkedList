public class Solution {
    public static Node sortList(Node head) {
        // Write your code here
        Node nz = null, nzt = null, no = null, not = null, nt = null,
                ntt = null;

        while (head != null) {
            if (head.data == 0) {
                if (nz == null) {
                    nz = head;
                    nzt = head;
                } else {
                    nzt.next = head;
                    nzt = head;
                }

            } else if (head.data == 1) {
                if (no == null) {
                    no = head;
                    not = head;
                } else {
                    not.next = head;
                    not = head;
                }
            } else {
                if (nt == null) {
                    nt = head;
                    ntt = head;
                } else {
                    ntt.next = head;
                    ntt = head;
                }
            }
            head = head.next;
        }

        if (nz != null) {
            if (nzt != null) {
                nzt.next = no;
            }

            if (not != null) {
                not.next = nt;
                ntt.next = null;
            }
            return nz;
        } else if (no != null) {
            if (not != null) {
                not.next = nt;
                ntt.next = null;
            }
            return no;
        }

        return nt;

    }
}
