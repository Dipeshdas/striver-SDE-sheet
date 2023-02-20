//LEETCODE

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int []e:intervals){
            if(e[0]<=end){
                end=Math.max(end,e[1]);
            }
            else{
                res.add(new int[]{start,end});
                start=e[0];
                end=e[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}

//CODE STUDIO

import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval>res=new ArrayList<>();
        if(intervals.length==0 || intervals==null){
            return res;
        }

        Arrays.sort(intervals,(a,b)->a.start-b.start);

        int start=intervals[0].start;
        int end=intervals[0].finish;

        for(Interval e:intervals){
            if(e.start<=end){
                end=Math.max(end,e.finish);
            }
            else{
                res.add(new Interval(start,end));
                start=e.start;
                end=e.finish;
            }
        }
        res.add(new Interval(start,end));
        return res;
    }
}
