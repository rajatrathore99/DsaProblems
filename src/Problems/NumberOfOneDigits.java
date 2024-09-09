package Problems;

public class NumberOfOneDigits {
    public int solve(int A) {
        if (A==0) return 0;
        int temp=A,ans=0,i=1;
        while(temp/i>0) {
            ans+= (temp/(i*10))*i + Math.min(Math.max((temp%(i*10))- (i-1), 0), i);
            i*=10;
        }
        return ans;

    }
}
