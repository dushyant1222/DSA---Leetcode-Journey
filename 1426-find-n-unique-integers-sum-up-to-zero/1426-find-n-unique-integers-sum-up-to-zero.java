class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        int a = 0;
            for(int i=1; i<=n/2; i++){
                arr[a++] = i;
                arr[a++] = -i;
            }
        if(n%2!=0){
            arr[a] = 0;
        }
        return arr;
    }
}