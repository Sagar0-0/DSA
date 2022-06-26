public class Solution {
    
    private ArrayList<String> res;
    
	public ArrayList<String> generateParenthesis(int A) {
	    res = new ArrayList<>();
	    StringBuilder str = new StringBuilder();
	    rec(0, 0, 0, str, A);
	    return res;
	}
	
	public void rec(int leftCount, int rightCount, int index, StringBuilder str, int n) {
	    if (leftCount > n || rightCount > n)return;    
	    if (rightCount > leftCount)return;
	    
	    if (index == 2 * n) {
	        res.add(str.toString());
	        return;
	    }
	    
	    str.append('(');
	    rec(leftCount + 1, rightCount, index + 1, str, n);
	    str.deleteCharAt(str.length() - 1);
	    
	    str.append(')');
	    rec(leftCount, rightCount + 1, index + 1, str, n);
	    str.deleteCharAt(str.length() - 1);
	    
	}
	
	
}
