package BurchBonus;

public class bonus {
    boolean ispalidrome(String str) {
        str = str.toLowerCase();
        int bitVector = buildBitVector(str);
        return maxonebit(bitVector);
    }

    int buildBitVector(String str) {
        int bitVector = 0;
        int shift=0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c-'a';
                shift = 1 << index;
                if ((bitVector & shift) == 0) {
                    bitVector |= shift;
                } else {
                    bitVector &= ~shift;
                }
            }

        }
        return bitVector;
    }

    boolean maxonebit(int vec) {
        return ((vec & (vec - 1)) == 0);
    }

    public static void main(String[] args) {
       bonus pp = new bonus();
        System.out.println(pp.ispalidrome("tacocat"));
    }
}