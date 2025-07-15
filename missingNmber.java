public class missingNmber {
    //brute force approach
    // public static int missingNum(int[] nums){
    //     int n=nums.length;
    //     for(int i=1;i<=n;i++){
    //         int flag=0;
    //         for(int j=0;j<n-1;j++){
    //             if(nums[j]==i){
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //         if(flag==0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //better approach
    // public static int missingNum(int[] nums){
    //     int n=nums.length;
    //     int[] hash= new int[n+1];
    //     for(int i=0;i<n-1;i++){
    //         hash[nums[i]]=1;
    //     }
    //     for(int i=1;i<n;i++){
    //         if(hash[i]==0){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    
    //optimal approach

    public static int missingNum(int[] nums){
        int n=nums.length;
        int sum=0,s2=0;
        for(int i=1;i<=5;i++){
            sum=sum+i;
        }
        for(int i=0;i<=n-1;i++){
            s2=s2+nums[i];
        }
        int num=sum-s2;
        return num;


    }
    // public static int missingNum(int[] nums){
    //     int xor1=1^2^3^4^5;
    //     int xor2=1^2^4^5;
    //     int result= xor1^xor2;
    //     return result;
    // }
    public static void main(String[] args) {
        int[] nums={1,2,4,5};
        missingNmber mn=new missingNmber();
        int result=mn.missingNum(nums);
        System.out.println("Missing number is:"+result);
    }
}
