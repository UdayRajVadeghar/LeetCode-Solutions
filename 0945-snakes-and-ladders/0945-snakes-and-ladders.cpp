class Solution {
public:
    int min(int a, int b){
        if(a<b) return a; return b;
    }
    int snakesAndLadders(vector<vector<int>>& board) {
        int n = board.size();
        reverse(board.begin(), board.end());
        vector<vector<int>> from(n*n+1); bool toggle = true; int curr = 0;
        vector<int> push(n*n+1, 0);
        for(auto row : board){
            if(toggle){
                for(int i=0;i<n;i++){
                    curr++;
                    if(row[i] > -1) push[curr] = row[i];
                }
            } else {
                for(int i=n-1;i>=0;i--){
                    curr++;
                    if(row[i] > -1) push[curr] = row[i];
                }
            }
            toggle = !toggle;
        }
        vector<int> minSteps(n*n + 2, 1000000);
        minSteps[1] = 0;
        for(int i=2;i<=min(n*n, 7);i++){
            if(push[i] == 0){
                minSteps[i] = 1;
            } else minSteps[push[i]] = 1;
        }
        for(int snakeGo = 0; snakeGo < 10; snakeGo++){
        for(int i=8;i<=n*n;i++){
            if(push[i] == 0){
                for(int j=1;j<=6;j++){
                    minSteps[i] = min(minSteps[i], minSteps[i - j] + 1);
                }
            } else {
                int minToGetHere = minSteps[i-1] + 1;
                for(int j=2;j<=6;j++) minToGetHere = min(minToGetHere, minSteps[i-j] + 1);
                minSteps[push[i]] = min(minSteps[push[i]], minToGetHere);
            }
        }
        }
        for(int i=1;i<=n*n;i++){
            cout<<i<<":";
            if(minSteps[i] == 1000000) cout<<-1<<":"<<push[i]<<" ";
            else cout<<minSteps[i]<<":"<<push[i]<<" ";
        } cout<<endl;
        // for(auto i:minSteps) cout<<i<<" "; cout<<endl;
        if(minSteps[n*n] == 1000000) return -1;
        return minSteps[n*n];
    }
};