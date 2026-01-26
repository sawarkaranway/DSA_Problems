class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> a = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            
            a.add(Arrays.asList(arr[i], arr[i+1]));

            min = Math.min(arr[i+1]-arr[i],min);
            
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            int m = a.get(i).get(1) - a.get(i).get(0);
            if (m != min) {
                a.remove(i);
            }
        }
        return a;
    }
}