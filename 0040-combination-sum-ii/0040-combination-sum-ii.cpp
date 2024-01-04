class Solution {
public:
    void combinationSum2(
    vector<int>& candidates,
    int target,
    int index,
    vector<int> &ds,
    vector<vector<int>> &ans
) {

    if(target == 0) {
        ans.push_back(ds);
        return;
    }

    if(target < 0) {
        return;
    }
    for (int i = index; i < candidates.size(); ++i) {
        if(i>index && candidates[i] == candidates[i-1]) continue;
        ds.push_back(candidates[i]);
        combinationSum2(candidates,target-candidates[i],i+1,ds,ans);
        ds.pop_back();
    }
}

vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {

    vector<int> ds;
    vector<vector<int>> ans;
    sort(candidates.begin(),candidates.end());
    combinationSum2(candidates,target,0,ds,ans);
    return ans;
}
};