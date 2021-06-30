//recursion
 public static int fib(int n){
     if(n==0||n==1)
     return n;
     return fib(n-1)+fib(n-2);
 }
//memoization dp
 public static int fib(int n,int[] dp){
     if(n==0||n==1)
     return n;
     if(dp[n]!=0){
         return dp[n];
     }
     int a1=fib(n-1,dp);
     int a2=fib(n-2,dp);
     int fn=a1+a2;
     dp[n]=fn;
     return fn;
 }
// tabulation
 public static int fib(int n){
     int dp[]=new int[n+1];
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
     
     return dp[n];
     
 }

}
 //optimizes tabulation
public static int fib(int n){
  int a=0,b=1;
  int c=a+b;
  for(int i=2;i<=n;i++){
    c=a+b;
    a=b;
    b=c;
  }
  return c;
}

