class Solution {
    public  int LengthOfList(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        return n;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
       int n = LengthOfList(head);
       int size = n/k; // n/k+1
       int extra = n%k;
       ListNode[] ans = new ListNode[k];
       int idx = 0;
       ListNode temp = head;
       int len = 1;
       while(temp!=null){
       int s = size;
       if(extra>0) s++;
       if(len==1)  ans[idx++] = temp;
       if(len==s){
            ListNode a = temp.next;
            temp.next = null;
            temp = a;
            len =1;
            extra--;
        }  
        else{
            len++;
            temp = temp.next;
        }
     }
       
    return ans;
    }
}