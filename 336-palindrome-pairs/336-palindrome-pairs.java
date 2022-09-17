class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(words == null || words.length == 0){
			return res;
		}
		int[] hasLength = new int[5002];
		//build the map save the key-val pairs: String - idx
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < words.length; i++){
			map.put(words[i], i);
			hasLength[words[i].length()]++;
		}



		//case-1
		//special cases: "" can be combine with any palindrome string
		if(map.containsKey("")){
			int blankIdx = map.get("");
			for(int i = 0; i < words.length; i++){
				if(isPalindrome(words[i], 0, words[i].length() - 1)){
					if(i == blankIdx) continue;
					res.add(Arrays.asList(blankIdx, i));
					res.add(Arrays.asList(i, blankIdx));
				}
			}
		}

		//case-2
		//find all string and reverse string pairs
		for(int i = 0; i < words.length; i++){
			String cur_r = reverseStr(words[i]);
			if(map.containsKey(cur_r)){
				int found = map.get(cur_r);
				if(found == i) continue;
				res.add(Arrays.asList(i, found));
			}
		}


		//case3- s = [s1 + s2], s2 is palindrome，find s1.reverse()  => [s, findIndex]
		//case4- s = [s1 + s2], s1 is palindrome，find s2.reverse()  => [findIndex, s]
		for(int i = 0; i < words.length; i++){
			String cur = words[i];

			for(int cut = 1; cut < cur.length(); cut++){
				if(hasLength[cur.length() - cut] > 0 && isPalindrome(cur, 0, cut - 1)){
					String cut_r = reverseStr(cur.substring(cut));
					if(map.containsKey(cut_r)){
						int found = map.get(cut_r);
						if(found == i) continue;
						res.add(Arrays.asList(found, i));
					}
				}
				if(hasLength[cut] > 0 && isPalindrome(cur, cut, cur.length() - 1)){
					String cut_r = reverseStr(cur.substring(0, cut));
					if(map.containsKey(cut_r)){
						int found = map.get(cut_r);
						if(found == i) continue;
						res.add(Arrays.asList(i, found));
					}
				}
			}
		}

		return res;
	}

	public String reverseStr(String str){
		StringBuilder sb= new StringBuilder(str);
		return sb.reverse().toString();
	}

	public boolean isPalindrome(String s, int i, int j){

    while(i < j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}