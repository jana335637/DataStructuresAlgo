package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NMeetingsRoom {

    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            meetings.add(new Meeting(start[i], end[i],i+1));
        }
        Collections.sort(meetings, new MeetingComparator());
        int limit = meetings.get(0).end;
        List<Integer> ans  = new ArrayList<>();
        ans.add(meetings.get(0).pos);
        for (int i = 1; i < meetings.size(); i++) {
            if(meetings.get(i).start > limit ){
                ans.add(meetings.get(i).pos);
                limit = meetings.get(i).end;
            }
        }
        return ans.size();
    }
}
class MeetingComparator implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if(o1.end < o2.end)
            return -1;
        else if(o1.end > o2.end){
            return 1;
        } else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }
}
class Meeting{
    public int start;
    public int end, pos;
    Meeting(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
