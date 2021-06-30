//recursion  
public static int csv(int[] arr,int src){
        if(src>arr.length)
        return 0;
        
        if(src==arr.length)
        return 1;
        int ways=0;
        for(int i=1;i<=arr[src];i++){
        
          ways+=  csv(arr,src+i);
        }
        return ways;
    }
//memoization
   public static int csv(int[] arr,int src,int[] dp){
        if(src>arr.length)
        return 0;
        
        if(src==arr.length)
        return 1;
        int ways=0;
        if(dp[src]!=0)
        return dp[src];
        for(int i=1;i<=arr[src];i++){
        
          ways+=  csv(arr,src+i,dp);
        }
        return dp[src]=ways;
    }
//tabulation
   public static int cs(int arr[]){
        int n=arr.length;
        int dp[]=new int[n+1];
         dp[n]=1;
        for(int i=n-1;i>=0;i--){
           
        for(int jump=1;jump<=arr[i];jump++){
            if(jump+i<=n)
           dp[i]+=dp[i+jump] ;
        }
        }
       
        return dp[0];
    }
