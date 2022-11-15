class Solution {
    public List<Integer> findSubstring(String str, String[] words) {
        if(str == null || str.length() == 0 || words == null || words.length == 0) {
          return new ArrayList<>();
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        for(String word: words) {
          frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        int eachWordLength = words[0].length();
        int totalWords = words.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= str.length() - (totalWords * eachWordLength); i++) {

          Map<String, Integer> seenWords = new HashMap<>();

          for (int j = 0; j < totalWords; j++) {
            int wordIndex = i + j * eachWordLength;

            String word = str.substring(wordIndex, wordIndex + eachWordLength);

            if(!frequencyMap.containsKey(word)) {
              break;
            }

            seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);

            if(seenWords.get(word) > frequencyMap.get(word)) {
              break;
            }

            if(j + 1 == totalWords)   {
              result.add(i);
            }
          }
        }

        return result;
    }
}