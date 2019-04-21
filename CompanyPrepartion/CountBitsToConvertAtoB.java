package CompanyPrepartion;

/*
Given two numbers ‘a’ and b’. Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.
Example :

Input : a = 10, b = 20
Output : 4
Binary representation of a is 00001010
Binary representation of b is 00010100
We need to flip highlighted four bits in a
to make it b.

Input : a = 7, b = 10
Output : 3
Binary representation of a is 00000111
Binary representation of b is 00001010
We need to flip highlighted three bits in a
to make it b.
 */

public class CountBitsToConvertAtoB {
    public static void main(String[] args) {
        System.out.println(countbitstoConvert(7,10));
//        System.out.println(binary(20));
    }
    public static int XOR(int a)
    {
        return Integer.bitCount(a);
    }
    public static String binary(int num)
    {
        return Integer.toBinaryString(num);

    }
    public static int countbitstoConvert(int a,int b)
    {
        return XOR(a^b);
    }
}
