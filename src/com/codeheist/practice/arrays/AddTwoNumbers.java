package com.codeheist.practice.arrays;

class ListNode {
	int val;
	ListNode next;
	ListNode() { 
	}
	ListNode(int val) {
		this.val = val;
	}
	ListNode(int val, ListNode next) {
		this.val = val; this.next = next;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null) {
        	return l2;
        }
        if(l2 == null) {
        	return l1;
        }
        	
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        
        while(l1!=null && l2!=null) {
        	int sum = l1.val+l2.val+carry;
        		
        	carry = sum/10;
        	sum = sum%10;
        		
        	temp.next = new ListNode(sum);
        	temp = temp.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val+carry;
            carry = sum/10;
        	sum = sum%10;
        	temp.next = new ListNode(sum);
        	temp = temp.next;
        	l1 = l1.next;
        }
        while(l2 != null) {
        	int sum = l2.val+carry;
            carry = sum/10;
       		sum = sum%10;
       		temp.next = new ListNode(sum);
    		temp = temp.next;
            l2 = l2.next;
        }
        if(carry != 0) {
            temp.next = new ListNode(carry);
        }
        return ans.next;
    }
	public static void main(String args[]) {
		ListNode rootA = new ListNode(5);
		ListNode rootB = new ListNode(5, new ListNode(6, new ListNode(4)));
		
		AddTwoNumbers atn = new AddTwoNumbers();
		ListNode ans = atn.addTwoNumbers(rootA, rootA);
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
	}
}
