class Solution {
    boolean b;
    char flow(int i,int m,int j,int n){
        if((i==0&&j==n-1)||(i==m-1&&j==0)||b){
            return 'b';
        }
        if(dp[i][j]!='\u0000') return dp[i][j];
        char u=i==0?'p':'n',l=j==0?'p':'n',r=j==n-1?'a':'n',d=i==m-1?'a':'n';
        int t=heights[i][j];
        heights[i][j]=-1;
        //up
        if(u=='n'&&t>=heights[i-1][j]&&heights[i-1][j]!=-1){
            u=flow(i-1,m,j,n);
        }
        //down
        if(u!='b'&&d=='n'&&t>=heights[i+1][j]&&heights[i+1][j]!=-1){
            d=flow(i+1,m,j,n);
        }        
        //right
        if(u!='b'&&d!='b'&&r=='n'&&t>=heights[i][j+1]&&heights[i][j+1]!=-1){
            r=flow(i,m,j+1,n);
        }        
        //left
        if(r!='b'&&u!='b'&&d!='b'&&l=='n'&&t>=heights[i][j-1]&&heights[i][j-1]!=-1){
            l=flow(i,m,j-1,n);
        }    
        heights[i][j]=t;
        char ans='n';
        if(r=='b'||l=='b'||u=='b'||d=='b') ans = 'b';
        else if((r=='a'||l=='a'||u=='a'||d=='a')&&(r=='p'||l=='p'||u=='p'||d=='p')) ans = 'b';
        else ans = (r=='a'||l=='a'||u=='a'||d=='a')?'a':(r=='p'||l=='p'||u=='p'||d=='p')?'p':'n';
        if(ans=='b') b=true;
        return ans;
    }
    int[][] heights;List<List<Integer>> ans = new ArrayList<>();
    char[][] dp;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights=heights;
        int m=heights.length,n=heights[0].length;
        dp=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b=false;
                if(dp[i][j]=='\u0000')
                    dp[i][j]=flow(i,m,j,n);
                if(dp[i][j]=='b'){
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(i);a.add(j);
                    ans.add(a);
                }
            }
        }
        return ans;
    }
}