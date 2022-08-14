class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        this.beginWord = beginWord;
        this.endWord = endWord;
        if (!sanityCheck(wordList)) {
            return new ArrayList<>();
        }
        prepare(wordList);
        minTrans();
        return trans;
    }

    private String beginWord;
    private String endWord;
    private Map<String, String[]> w2p;
    private Map<String, List<String>> p2w;

    private void minTrans() {
        Map<String, Integer> minLens = new HashMap<>();
        Map<String, Set<String>> prev = new HashMap<>();
        List<String> queue = new ArrayList<>();
        int minLen = -1;

        minLens.put(endWord, 0);
        queue.add(endWord);
        int count = 0;
        while (count < queue.size()) {
            String node = queue.get(count++);
            int len = minLens.get(node) + 1;
            if (minLen != -1 && len > minLen) {
                break;
            }

            for (String pattern : w2p.get(node)) {
                for (String word : p2w.get(pattern)) {
                    if (!minLens.containsKey(word)) {
                        minLens.put(word, len);
                        queue.add(word);
                        prev.put(word, new HashSet<>());
                        if (word.equals(beginWord)) {
                            minLen = len;
                        }
                    } else if (minLens.get(word) < len) {
                        continue;
                    }
                    prev.get(word).add(node);
                }
            }
        }

        makeTrans(prev, minLens.getOrDefault(beginWord, -1));
    }

    private List<List<String>> trans;
    private Map<String, Set<String>> paths;

    private void makeTrans(Map<String, Set<String>> paths, int maxLen) {
        this.trans = new ArrayList<>();
        this.paths = paths;
        if (maxLen == -1) {
            return;
        }
        String[] path = new String[maxLen + 1];
        path[0] = beginWord;
        makeTransInternal(beginWord, 1, path);
    }

    void makeTransInternal(String start, int depth, String[] path) {
        if (depth == path.length - 1) {
            path[depth] = endWord;
            List<String> result = new ArrayList<>();
            for (String word : path) {
                result.add(word);
            }
            this.trans.add(result);
            return;
        }
        for (String word : paths.get(start)) {
            path[depth] = word;
            makeTransInternal(word, depth + 1, path);
        }
    }

    private boolean sanityCheck(List<String> wordList) {
        for (String word : wordList) {
            if (word.equals(endWord)) {
                return true;
            }
        }
        return false;
    }

    private void prepare(List<String> wordList) {
        // Prepare a word -> patterns map.
        w2p = new HashMap<>();
        w2p.put(beginWord, getPatterns(beginWord));
        for (String word : wordList) {
            w2p.put(word, getPatterns(word));
        }

        // Prepare a pattern -> words map.
        p2w = new HashMap<>();
        for (String word : w2p.keySet()) {
            for (String pattern : w2p.get(word)) {
                if (!p2w.containsKey(pattern)) {
                    p2w.put(pattern, new ArrayList<>());
                }
                p2w.get(pattern).add(word);
            }
        }
    }

    private String[] getPatterns(String word) {
        char[] wc = word.toCharArray();
        char original;
        String[] patterns = new String[wc.length];
        for (int i = 0; i < wc.length; ++i) {
            original = wc[i];
            wc[i] = '*';
            patterns[i] = new String(wc);
            wc[i] = original;
        }
        return patterns;
    }
}