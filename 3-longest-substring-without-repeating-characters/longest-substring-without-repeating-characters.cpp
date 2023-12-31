class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int>mp;
        int head=0,tail=0,ans=0;
        for(head=0;head<s.size();head++){
            mp[s[head]]++;
            while(mp[s[head]]>1){
                ans=max(ans,head-tail);
                mp[s[tail]]--;
                tail++;
            }
        }
        return max(ans,head-tail);
    }
};