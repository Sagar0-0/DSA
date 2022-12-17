class Solution {
    public int evalRPN(String[] tokens) {
                  int[] nxtPos = new int[1];

          return eval(tokens, tokens.length - 1, nxtPos);
    }

    private int eval(String[] tokens, int pos, int[] nxtPos) {

        char ac = tokens[pos].charAt(0);

        if (tokens[pos].length() == 1 && (ac == '+' || ac == '-' || ac == '*' || ac == '/')) {

            // get operands
            int a = eval(tokens, pos - 1, nxtPos);
            int b = eval(tokens, nxtPos[0], nxtPos);

            // perform operation
            if (ac == '+') {
                
                return b + a;
            } else if (ac == '-') {

                return b - a;
            } else if (ac == '*') {

                return b * a;
            } else {

                return b / a;
            }
        } else {

            nxtPos[0] = pos - 1;
            return Integer.parseInt(tokens[pos]);
        }
    }
}