package nearestStation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* Flatland is a land of n cities, m of which have space stations (linear line of stations)
For each city, determine its distance to the nearest station, and print the maximum of these spaces.
Input format:
https://www.hackerrank.com/contests/worldcodesprint/challenges/powerplants-in-flatland */

public class Solution {

    public static void main(String[] args) {
        String filename = "input/nearestStation/test5";
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = null;
        try {
            in = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int n = in.nextInt();
        int m = in.nextInt();

        // case 1: always land in a station (all cities have stations)
        if(n == m) {
            System.out.println(0);
            return;
        }

        List<Integer> stationList = new ArrayList<>();


        for(int i = 0; i < m; i++) {
            int nextInt = in.nextInt();
            stationList.add(nextInt);
        }
        Collections.sort(stationList);


        // sliding window algorithm to determine maximum distance between stations
        int maxDistance = 0;
        int currentDistance = 0;

        for(int i = 0, j = 1; j < stationList.size(); i++, j++) {
            currentDistance = stationList.get(j) - stationList.get(i);
            if(currentDistance > maxDistance)
                maxDistance = currentDistance;
        }


        // case 2: end city has the maximum distance. since they are at the end, the distance is not split in half
        // since they can only go to one station, (don't have a station on each side)
        int start = stationList.get(0);
        int end = n-1 - stationList.get(stationList.size()-1);


        if(start >= maxDistance) {
            System.out.println(start);
            return;
        }

        if(end >= maxDistance) {
            System.out.println(end);
            return;
        }

        // case 3: generic, all are stations
        // use formula to derive maximum walking distance from maximum station distance
        int answer = (maxDistance + 1) / 2;

        System.out.println(answer);
    }
}