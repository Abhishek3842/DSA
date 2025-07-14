class secondLargest{
    public void sc(int[] num){
        int n= num.length;
        int largest=-1,secondLarge=-1;
        for(int i=0;i<n;i++){
            if(num[i]>largest){
                largest= num[i];
            }
            else if(num[i]>secondLarge && secondLarge!= largest){
                secondLarge=num[i];
            }
        }
       
        System.out.println(secondLarge);
    }
    public static void main(String[] args) {
        int[] num={12,5,1,4,5};
        secondLargest m=new secondLargest();
        m.sc(num);
    }
}