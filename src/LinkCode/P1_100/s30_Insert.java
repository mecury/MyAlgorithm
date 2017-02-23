package LinkCode.P1_100;

import LinkCode.Node.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by 18394 on 2017/1/12.
 */
public class s30_Insert {

    /**
     * Insert newInterval into intervals.
     *
     * @param intervals:   Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (intervals.isEmpty()){
            intervals.add(newInterval);
            return intervals;
        }
        ArrayList<Interval> result = new ArrayList();
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Interval cur = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++){
            Interval next = intervals.get(i);
            if (cur.end < next.start) {
                result.add(cur);
                cur = next;
            } else if (cur.end >= next.start){
                cur.end = Math.max(cur.end, next.end);
            }
        }
        result.add(cur);

        return result;
    }

    public static void main(String[] args){
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 2));
        list.add(new Interval(5, 9));
        for (Interval s : list){
            System.out.print(s.toString() + " ");
        }
        list = insert(list, new Interval(2, 5));
        for (Interval s : list){
            System.out.print(s.toString() + " ");
        }
    }
}
