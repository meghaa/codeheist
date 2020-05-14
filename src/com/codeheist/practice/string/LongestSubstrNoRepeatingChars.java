package com.codeheist.practice.string;

import java.util.*;

public class LongestSubstrNoRepeatingChars {
	public int lengthOfLongestSubstring(String s) {
        int len = 0;
        if(s != null && !s.isEmpty()) {
		    Set<Character> charSet = new HashSet<>();
		
		    for(char ch : s.toCharArray()) {
			    charSet.add(ch);
		    }
		
		    int maxPossibleLen = charSet.size();
		    int begin = -1, end = 0, temp = maxPossibleLen;
		    charSet = new HashSet<>();
		
		    while(end<s.length()) {
			    char endCh = s.charAt(end);
			
			    if(charSet.add(endCh)) {
				    temp--;
				    end++;
			    } else {
				    if(len<end-begin-1) {
					    len = end-begin-1;
				    }
				    if(len == maxPossibleLen) {
					    return len;
				    }
				    char beginCh;
				
				    do {
					    begin++;
					    beginCh = s.charAt(begin);
					    charSet.remove(beginCh);
					    temp++;
				    } while(beginCh != endCh);
			    }
		    }
        }
        return s.length() == 1? s.length() : len;
    }
	public static void main(String args[]) {
		String str = "au";
		LongestSubstrNoRepeatingChars lsnrc = new LongestSubstrNoRepeatingChars();
		System.out.println(lsnrc.lengthOfLongestSubstring(str));
	}
}
