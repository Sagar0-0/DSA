class Solution {
    public String simplifyPath(String path) {
        Deque<String> dq = new LinkedList<>();
        
        int i = 0;
        while (i < path.length()) {
            i++;
            int l = i;
            while (i < path.length() && path.charAt(i) != '/') i++;
            String segment = path.substring(l, i);
            
            if (segment.equals(".") || segment.isEmpty()) continue;
            if (segment.equals("..")) {
                if (!dq.isEmpty()) dq.pollLast();
            } else {
                dq.offerLast(segment);
            }
        }
        
        if (dq.isEmpty()) return "/";
        
        StringBuilder result = new StringBuilder();
        while (!dq.isEmpty()) {
            result.append("/").append(dq.pollFirst());
        }
        return result.toString();
    }
}
