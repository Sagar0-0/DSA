class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = getNextState(sb);
        }
        return sb.toString();
    }

    private StringBuilder getNextState(StringBuilder curSb) {
        StringBuilder nextSb = new StringBuilder();
        int len = curSb.length();
        int i = 0;
		
        while (i < len) {
            char c = curSb.charAt(i++);
            int count = 1;
            while (i < len && c == curSb.charAt(i)) {
                count++;
                i++;
            }
            nextSb.append(count).append(c);
        }
		
        return nextSb;
    }
}