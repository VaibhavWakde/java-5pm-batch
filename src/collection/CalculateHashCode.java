package collection;

/**
 * n = 4
 *
 *  hashCode("JAVA") =  s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 *  = J*31^3 +A*31^2 + V*31^1 + A
 *  = 2204534 +  62465 + 2666 +65
 *  = 2269730
 *
 *  index = hashCode("JAVA") & (N -1 )      where N --> No. of buckets or size of array.
 *                                                      for empty hashMap size taken as 16.
 *        = 2269730 & (16 - 1 )
 *        = 2269730 & 15
 *
 *
 *      1000101100100100110010      ----> 2269730 (bit code )
 *    &                   0011      ----> 15 (bit code )
 *      ------------------------
 *                        0010  => 2
 *
 * so as per calculations for key "JAVA" index is 2 in hashMap.
 */
public class CalculateHashCode {
    public static void main(String[] args) {
        String str = "A";
        System.out.println("HashCode is "+str.hashCode());
    }
}
