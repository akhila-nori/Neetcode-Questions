package Arrays.HashMap;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class CountDistinctElementsInEveryWindowOfSizekBruteForce {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> output = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int kInd=0;
        // Fixed: Added '=' to include the last possible window
        for(int i=0;i<=arr.length-k;i++){
            s.clear();
            kInd = i + k - 1;

            for(int j=i;j<=kInd;j++){
                //check here for duplicate elements
                s.add(arr[j]);

            }
            output.add(s.size());
        }
        return output;

    }
}