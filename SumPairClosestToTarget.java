public List<Integer> sumClosest(int[] arr, int target) {
        
        List<Integer> result = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        int min_so_far = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while(left < right) {
            int currSum = arr[left] + arr[right];
            if(Math.abs(currSum - target) < min_so_far) {
                min_so_far = Math.abs(currSum - target);
                result = Arrays.asList(arr[left], arr[right]);
            } 
            if(currSum < target) left++;
            else if(currSum > target) right--;
            else return result;
        }
        return result;
    }
