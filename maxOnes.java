public class maxOnes {
    public static int maxConsecutiveOnes(int[] arr){
        int n= arr.length;
        int max=0,cnt=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]==1){
                cnt++;
                max=Math.max(max, cnt);
            }
            else{
                cnt=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,1,0,0,1,1,1,0,1,1};
        maxOnes m= new maxOnes();
        int result= m.maxConsecutiveOnes(arr);
        System.out.println("Maximum ones repeated continously:"+result);
    }


}
