import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int num: arr) {
            set.add(num);
        }

        int longestStreak = 0;

        for(int num: arr) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
