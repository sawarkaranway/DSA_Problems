class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        int p=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            String temp = arr[p-i];
            arr[p-i]=arr[i];
            arr[i]=temp;


        }
        String k = String.join(" ", arr);
        String kp = k.trim();
        return kp;

    
    }
}