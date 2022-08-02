public class Solution {
    private static class Place {
        int unit;
        String name;

        public Place (int unit, String name) {
            this.unit = unit;
            this.name = name;
        }
    }

    private static final Place[] places = new Place[]{
        new Place(10000000, "crore"),
        new Place(100000, "lakh"),
        new Place(1000, "thousand"),
        new Place(100, "hundred")
    };

    private static final String[] tens = new String[]{
        "",
        "",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };

    private static final String[] units = new String[]{
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    };

    private String f(long amount) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < places.length; i++) {
            Place place = places[i];
            int qty = (int)(amount / place.unit);
            if (qty > 0) {
                String toAdd = "";
                if (qty > 10) {
                    toAdd = f (qty) + "-" + place.name;
                } else {
                    toAdd = units[qty] + "-" + place.name;
                }
                if (sb.length() > 0) {
                    sb.append("-");
                }
                sb.append(toAdd);
            }
            amount -= (long) qty * place.unit;
        }

        if (sb.length() > 0 && amount > 0) {
            sb.append("-and-");
        }

        int ten = (int)(amount / 10);
        boolean shouldAddAnd = false;
        if (ten > 1) {
            sb.append(tens[ten]);
            amount -= 10 * ten;
            shouldAddAnd = true;
        }

        if (amount > 0) {
            if (shouldAddAnd) {
                sb.append("-");
            }
            sb.append(units[(int)amount]);
        }

        return sb.toString();
    }

    public int solve(String A, String B) {

        long amount = Long.parseLong(A);
        String b = f(amount);
        return b.equals(B) ? 1 : 0;

    }
}
