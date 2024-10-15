//You are given n activities with their start and end times. select the maximum number of activities that can be performed by single person,assuming that a person can only work on a single activities at a time. Activities are sorted according to end time.class Activity_Problem 

import java.util.*;

class Activity_Problem {
    
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 }; //sorted
        int n = start.length;

        ArrayList<Integer> activities = new ArrayList<>();

        activities.add(0);
        int lastActivity = 0;

        for (int i = 0; i < n; i++) {
            if (end[lastActivity] <= start[i]) {
                activities.add(i);
                lastActivity = i;
            }
        }

        for (int a : activities) {
            System.out.println("A" + a + " Activity");
        }
    }
    
    public static void unsortedEndTime(int start[],int end[]) {
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        
        //lambda function -> sortform
    }
}