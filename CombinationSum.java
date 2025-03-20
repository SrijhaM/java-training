import java.util.ArrayList;
import java.util.List;
class CombinationSum 
{
    public List<List<Integer>> combinationSum(int[] candidates, int t) 
    {
        List<List<Integer>> res = new ArrayList<>();
        combi(candidates, t, 0, new ArrayList<>(), res);
        return res;
    }
    private void combi(int[] candidates, int t, int s, List<Integer> currcombination, List<List<Integer>> res) 
    {
        if (t==0) 
        {
            res.add(new ArrayList<>(currcombination));
            return;
        }
        for (int i = s; i < candidates.length; i++) 
        {
            if (candidates[i] > t) 
            {
                continue;
            }
            currcombination.add(candidates[i]);
            combi(candidates, t - candidates[i], i, currcombination, res);
            currcombination.remove(currcombination.size() - 1);
        }
    }
    public static void main(String[] args) 
    {
        CombinationSum solver = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int t = 7;
        List<List<Integer>> combinations = solver.combinationSum(candidates, t);
        for (List<Integer> combination : combinations) 
        {
            System.out.println(combination);
        }
    }
}
