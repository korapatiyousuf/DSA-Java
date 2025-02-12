package Problems.Algorithms.Greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class NMeetings {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int[] start, int[] end) {
        // add your code here
        int n = start.length, possibleMeets=1;
        ArrayList<Meeting> meets = new ArrayList<>();
        for(int i=0;i<n;i++) {
            meets.add(new Meeting(start[i], end[i]));
        }

        //sort the arraylist based on end time
        meets.sort(new MeetingComparator());

        int currEndTime = meets.getFirst().endTime;
        for(int i=1;i<n;i++) {
            if(meets.get(i).startTime > currEndTime) {
                possibleMeets++;
                currEndTime = meets.get(i).endTime;
            }
        }
        return possibleMeets;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        NMeetings meetings = new NMeetings();
        int meetingsCount = meetings.maxMeetings(start, end);
        System.out.println("Possible meetings are: " +meetingsCount);

    }

    //meeting class
    class Meeting {
        int startTime;
        int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    // Custom comparator to compare meetings according to end time
    class MeetingComparator implements Comparator<Meeting> {
        @Override
        public int compare(Meeting m1, Meeting m2) {
            return Integer.compare(m1.endTime, m2.endTime);
        }
    }
}
