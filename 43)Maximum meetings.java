//CODE STUDIO
import java.util.* ;
import java.io.*; 

class pair{
    int first;
    int second;
    int pos;
    pair(int first,int second,int pos){
        this.first=first;
        this.second=second;
        this.pos=pos;
    }
}

class meetingComparator implements Comparator<pair>
{
    @Override
    public int compare(pair o1, pair o2) 
    {
        if (o1.second < o2.second)
            return -1;
        else 
            return 1; 
    }
}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {  
        int n=start.length;      
        ArrayList<pair>ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(new pair(start[i],end[i],i+1));
        }
        
        meetingComparator mc = new meetingComparator(); 
        Collections.sort(ar, mc); 
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(ar.get(0).pos);
        int limit=ar.get(0).second;
        for(int i=1;i<n;i++){
            if(ar.get(i).first > limit) {
                limit = ar.get(i).second; 
                ans.add(ar.get(i).pos);
            }
        }
        return ans;
    }
}

//LEETCODE
import java.util.* ;
import java.io.*; 

class pair{
    int first;
    int second;
    int pos;
    pair(int first,int second,int pos){
        this.first=first;
        this.second=second;
        this.pos=pos;
    }
}

class meetingComparator implements Comparator<pair>
{
    @Override
    public int compare(pair o1, pair o2) 
    {
        if (o1.second < o2.second)
            return -1;
        else 
            return 1; 
    }
}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {  
        int n=start.length;      
        ArrayList<pair>ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(new pair(start[i],end[i],i+1));
        }
        
        meetingComparator mc = new meetingComparator(); 
        Collections.sort(ar, mc); 
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(ar.get(0).pos);
        int limit=ar.get(0).second;
        for(int i=1;i<n;i++){
            if(ar.get(i).first > limit) {
                limit = ar.get(i).second; 
                ans.add(ar.get(i).pos);
            }
        }
        return ans;
    }
}
