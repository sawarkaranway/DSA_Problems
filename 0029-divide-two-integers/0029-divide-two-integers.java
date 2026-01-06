class Solution {
    public int divide(int dividend, int divisor) {
        double result=(double) dividend/divisor;
        
        if (result > Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
            }
        if (result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        return (int)result;
    }
}