//recursion
public static int cs(int n){
        if(n==0){
            return 1;
        }
        int ways=0;
        if(n-1>=0)
       ways+= cs(n-1);
       if(n-2>=0)
        ways+=cs(n-2);
        if(n-3>=0)
        ways+=cs(n-3);
        return ways;
    }
//memoization dp
   public static int cs(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ways=0;
        if(n-1>=0)
       ways+= cs(n-1,dp);
       if(n-2>=0)
        ways+=cs(n-2,dp);
        if(n-3>=0)
        ways+=cs(n-3,dp);
        return dp[n]=ways;
    }
//tabulation
  public static int cst(int n){
        int[] dp=new int[n+1];
      
      for(int i=0;i<=n;i++){
          if(i==0)
          dp[i]=1;
          else if(i==1)
          dp[i]+=dp[i-1];
         else if(i==2)
          dp[i]=dp[0]+dp[1];
          else
          dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
          
      }
      return dp[n];
    }
