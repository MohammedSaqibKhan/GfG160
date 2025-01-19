public int countTriplets(int[] arr, int target) {
        
        int n = arr.length;
        int count = 0;
        
        
        for(int i=0; i<n-2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                
                if(sum < target) {
                    left += 1;
                }
                else if(sum > target) {
                    right -= 1;
                }
                else if(sum == target) {
                    
                    int leftVal = arr[left];
                    int rightVal = arr[right];
                    int count1 =0, count2=0;
                    
                    while(left<=right && arr[left] == leftVal) {
                        left++;
                        count1++;
                    }
                    while(left<=right && arr[right] == rightVal) {
                        right--;
                        count2++;
                    }
                    
                    if(leftVal == rightVal) {
                        count += (count1 * (count1 - 1)) / 2;
                    }
                    else {
                        count += (count1 * count2);
                    }
             
                } 
            }
            
        }
        return count;
    }
