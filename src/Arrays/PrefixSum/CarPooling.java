package Arrays.PrefixSum;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Sweep Line algorithm - Car Pooling 
class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        List<int[]> events = new ArrayList<>();

        for(int[] trip : trips){
            int numberOfPassengers = trip[0];
            int from = trip[1];
            int To = trip[2];
            events.add(new int[]{numberOfPassengers,1,from});
            events.add(new int[]{numberOfPassengers,0,To});
        }

        //sorting
        Collections.sort(events,(a, b)-> {
            if(a[2]!=b[2]) {
                return a[2] - b[2];
            }
            return a[1] - b[1];
        });

        int currentPassengers = 0;

        for(int[] event : events){
            if(event[1] == 0){
                //no.of passengers
                currentPassengers -= event[0];
            } else{
                currentPassengers += event[0];
            }
            // Check capacity at EVERY stop!
            // If the car breaks at km 5, it doesn't matter if it's empty at km 10.
            if (currentPassengers > capacity) return false;

        }
        return true;
    }
}
