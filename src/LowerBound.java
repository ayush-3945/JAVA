public class LowerBound {

    static int getLowerBound(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]>= target){
                //ans store
                ans = mid;
                //right mein bhaag jao
                end = mid-1;
            }
            else{
                //right mein bhaag jao
                start = mid + 1;
            }
        }
        return ans;
    }
    static void main(){
        int arr[] = {10,20,30,30,30,30,30,30,30,30,30,40,50};
        int target = 30;
        int ans = getLowerBound(arr , target);
        System.out.println("ans: " + ans);
    }
}

//For Upper Bound Same code has been followed only one change
// and that is if(arr[mid]<=target)
