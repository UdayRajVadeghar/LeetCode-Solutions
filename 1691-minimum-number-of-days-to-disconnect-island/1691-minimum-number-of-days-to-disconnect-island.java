class Solution {
    int time;
    int[][] vis;
    int[][] low;
    int[] d=new int[]{0,1,0,-1,0};
    boolean arti;
    public int minDays(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        arti=false;
        vis=new int[n][m];
        low=new int[n][m];
        time=1;
        boolean hasArt=false;
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(found)
                        return 0;
                    found=true;
                    art(i,j,grid,-100,-100);
                }
            }
        }

        if(time==1)
            return 0;

        if(time==2)
            return 1;
        if(arti)
            return 1;
        else
            return 2;
    }

    public void art(int row,int col,int[][] grid , int parRow,int parCol){
        grid[row][col]=0;
        vis[row][col]=time;
        low[row][col]=time;
        time++;
        int child=0;
        for(int i=0;i<4;i++){
            int x=d[i]+row;
            int y=d[i+1]+col;

            if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || (x==parRow && y==parCol) || (vis[x][y]==0 && grid[x][y]==0))
                continue;
            if(vis[x][y]==0){
                child++;
                art(x,y,grid,row,col);
                low[row][col]=Math.min(low[row][col],low[x][y]);
                if(low[x][y]>=vis[row][col] && (parRow!=-100 && parCol!=-100))
                    arti=true;
            }else{
                low[row][col]=Math.min(low[row][col],vis[x][y]);
            }
        }

        if(parRow==-100 && parCol==-100 && child>1)
            arti=true;
    }
}