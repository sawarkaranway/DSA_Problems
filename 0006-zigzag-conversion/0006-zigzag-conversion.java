class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        char[] arr = s.toCharArray();
        List<List<Character>> a = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            a.add(new ArrayList<>());
        }

        int row = 0;
        boolean up = true;

        for (int i = 0; i < arr.length; i++) {

            a.get(row).add(arr[i]);

            if (row == 0) {
                up = false;
            } else if (row == numRows - 1) {
                up = true;
            }

            if (up) {
                row--;
            } else {
                row++;
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (List<Character> list : a) {
            for (char c : list) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
