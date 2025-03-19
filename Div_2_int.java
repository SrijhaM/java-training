class Div_2_int 
{
    public int divide(int dividend, int divisor)
    {
      
        if (dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }
        boolean neg = (dividend < 0) != (divisor < 0);
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        int q = 0;
        while (dividendAbs >= divisorAbs) {
            long tempDivisor = divisorAbs;
            long numDivisions = 1;
            while (dividendAbs >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                numDivisions <<= 1;
            }
            dividendAbs -= tempDivisor;
            q += numDivisions;
        }
        if (neg) {
            q = -q;
        }
        return Math.max(Math.min(q, Integer.MAX_VALUE), Integer.MIN_VALUE); 
    }
}