public class AllocateMinimumPages {

    public static int findPages(int[] arr, int k) {
        int n = arr.length;

        // If students are more than books, allocation is not possible
        if (k > n) return -1;

        // Define binary search range
        int low = Integer.MIN_VALUE, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages); // Minimum possible answer
            high += pages;             // Maximum possible answer
        }

        int result = -1;

        // Binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if we can allocate with this max limit
            if (isValid(arr, k, mid)) {
                result = mid;       // Store the result
                high = mid - 1;     // Try for smaller maximum
            } else {
                low = mid + 1;      // Increase the maximum allowed pages
            }
        }

        return result;
    }

    // Helper function to check if a given max limit is valid
    private static boolean isValid(int[] arr, int k, int maxPages) {
        int studentCount = 1; // Start with the first student
        int currentPages = 0;

        for (int pages : arr) {
            if (currentPages + pages > maxPages) {
                // Assign the current book to the next student
                studentCount++;
                currentPages = pages;

                // If we need more students than allowed, it's invalid
                if (studentCount > k) return false;
            } else {
                // Otherwise, assign this book to the current student
                currentPages += pages;
            }
        }

        return true; // Allocation is valid
    }
}
