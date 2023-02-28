//LEETCODE
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int maxLength=0;
        while(right<n){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right))+1,left);
            }

            map.put(s.charAt(right),right);
            maxLength=Math.max(right-left+1,maxLength);
            right++;
            
        }
        return maxLength;
    }
}

//CODE STUDIO
import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int n=input.length();
		HashMap<Character,Integer>map=new HashMap<>();
		int len=0;
		int left=0;
		int right=0;
		while(right<n){
			if(map.containsKey(input.charAt(right))){
				left=Math.max(map.get(input.charAt(right))+1,left);
			}
			map.put(input.charAt(right),right);
			len=Math.max(len,right-left+1);
			right++;
		}
		return len;
	}
}
