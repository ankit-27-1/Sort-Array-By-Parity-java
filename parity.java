class parity {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] arr3=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr1[j]=nums[i];
                j++;
            }
            else{
                arr2[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<j;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<k;i++){
            arr3[j]=arr2[i];
            j++;
        }
        return arr3;
    }
}
