class Solution {
public:
    bool backspaceCompare(string s, string t) {
        int n=s.size()-1;
        int m=t.size()-1;
        while(1){
            int todel=0;
            while(n>=0 && (todel>0 || s[n]=='#')){
                if(s[n]=='#'){
                    todel++;
                }
                else{
                    todel--;
                }
                n--;
            }

            todel=0;
            while(m>=0 &&(todel>0 || t[m]=='#')){
                if(t[m]=='#'){
                    todel++;
                }
                else{
                    todel--;
                }
                m--;
            }

            if(n>=0 && m>=0 && s[n]==t[m]){
                n--;
                m--;
            }
            else{
                break;
            }
        }

        if(n==-1 && m==-1){
            return 1;
        }
        return 0;
    }
};
