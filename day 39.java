//https://leetcode.com/problems/sort-the-matrix-diagonally/submissions/969991374/
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        for(int j = 0;j<mat[0].length;j++){
            int si = 0,sj = j;
            int d[] = findDiag(mat,si,sj);
            mergeSort(d,0,d.length-1);
            fillDiag(mat,d,si,sj);
        }

        
        for(int i = 1;i<mat.length;i++){
            int si = i,sj = 0;
            int d[] = findDiag(mat,si,sj);
            mergeSort(d,0,d.length-1);
            fillDiag(mat,d,si,sj);
        }
        return mat;
    }

    
    public void fillDiag(int [][]mat,int []d,int i,int j){
        int n = mat.length;
        int m = mat[0].length;
        int len = Math.min(n-i,m-j);
        int k = 0;
        while(i<n && j<m){ 
            mat[i++][j++] = d[k++];
        }
    }
    
    public int[] findDiag(int[][] mat,int si,int sj){
        int n = mat.length;
        int m = mat[0].length;
        int len = Math.min(n-si,m-sj);
        int d[] = new int[len];
        int k =0;
        while(si<n && sj<m){
            d[k++] = mat[si][sj];
            si = si+1;sj = sj+1;
        }
        return d;
    }

    public void mergeSort(int a[],int s,int e){
        if(s>=e){ 
            return;
        }
        int m = s + (e-s)/2;
        mergeSort(a,s,m); 
        mergeSort(a,m+1,e); 
        mergeSorted(a,s,m,m+1,e); 
     
    }

    
    public void mergeSorted(int []a,int s1,int e1,int s2,int e2){
        int i = s1,j = s2,k=0;
        int len = e1-s1 +1 + (e2-s2+1);
        int ans[]  = new int[len];
        while(i<=e1 && j<=e2){
            if(a[i]<a[j]){
                ans[k++]= a[i];
                i++;
            }
            else{
                ans[k++]= a[j];
                j++;
            }
        }
        while(i<=e1){
            ans[k++]= a[i];
            i++;
        }
        while(j<=e2){
            ans[k++]= a[j];
            j++;
        }

        for(i = 0;i<len;i++){
            a[s1++] = ans[i];
        }
    }
}
