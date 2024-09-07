package Problems;

public class FirstMissingInteger {
    public int FirstMissingNaturalNumber(int[]A){
        int n = A.length;
        for(int i=0;i<n;i++){
            if(A[i]<=0){
                A[i] = n+2;
            }
        }
        for(int i=0 ;i<n;i++){
            int ele = Math.abs(A[i]);
            if(ele>=1 && ele<=n){
                int idx = ele -1;
                if(A[idx]>0){
                    A[idx] = A[idx]*(-1);
                }
            }
        }
        for(int i=0 ;i<n;i++){
            if(A[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
