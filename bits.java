public class bits{
    public static void main(String[] args){
        // System.out.println(countAllSetBits(5)); 
        // System.out.println(countAllSetBits_02(5));
        // System.out.println(countAllSetBits_03(5));
        
        // int[] arr = {1,1,3,3,2,2,5,8,8,9,9};
        // System.out.println(UniqueNumberInArray(arr));

        // System.out.println(isPowerOfTwo(4));


        // System.out.println(offToOn(5, 2));
        
    }

    public static int countAllSetBits(int num){
        int count=0;
        for(int i=0;i<32;i++){
            int mask = (1<<i);
            if((num&mask)!=0) count++;
        }
        return count;
    }

    public static int countAllSetBits_02(int num){
        int count=0;
        while(num!=0){
            if((num & 1)!=0) count++;
            num >>>= 1;
        }
        return count;
    }

    
    public static int countAllSetBits_03(int num){
        int count=0;
        while(num!=0){
            count++;
            num &=(num-1);
        }
        return count;
    }

    public static int UniqueNumberInArray(int[] arr){
        int res=0;
        for(int ele: arr) res^=ele;
        return res;

    }
    
    //Leetcode : 231============================================
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n - 1))==0;
    }


    public static int offToOn(int num, int k){
        int mask = 1<<k;
        return num|mask;
    }
}