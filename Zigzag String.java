public class Solution {
    public String convert(String input, int num) {
        if(num<=1){
            return input;
        }
        StringBuilder result = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
          list.add(new StringBuilder());
        }
        boolean l2r = true;
        int i = 0;
        int size = input.length();
        int ptr = 0;
        while (i < size) {
          if (l2r) {
            while (ptr < num && i < size) {
              list.get(ptr).append(input.charAt(i));
              i++;
              ptr++;
            }
            ptr -= 2;
            l2r = false;
          } else {
            while (ptr >= 0 && i < size) {
              list.get(ptr).append(input.charAt(i));
              i++;
              ptr--;
            }
            ptr = 1;
            l2r = true;
          }
        }
        for (StringBuilder temp : list) {
          result.append(temp);
        }
        return result.toString();
      }
    
}

