class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int left = 0, right = arr.length-1, ans = -1;
        while(left<=right) {
            int mid = left+(right-left)/10;
            if(arr[mid]==0) {
                left = mid + 1;
            } else if(arr[mid]==1) {
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}