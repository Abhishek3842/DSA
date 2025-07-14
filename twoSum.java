
import java.util.HashMap;

public class twoSum {
    public static int[] twoS(int n,int[] nums, int target){
        int [] ans =new int[2];
        ans[0]= ans[1]=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n-1;i++){
            int num=nums[i];
            int complement= target -num;
            if(map.containsKey( complement)){
                ans[0]=map.get(complement);
                ans[1]=i;
                return  ans;
            }
            map.put(nums[i], i);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={2,6,9,8,10};
        int n= nums.length;
        twoSum t= new twoSum();
        int[] ans=twoS(n, nums, 14);
        System.out.println("the numbers are:["+nums[ans[0]]+","+nums[ans[1]]+"]");
    }
}
