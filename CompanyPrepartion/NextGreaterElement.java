package CompanyPrepartion;
/*
Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.

Examples:
a) For any array, rightmost element always has next greater element as -1.
b) For an array which is sorted in decreasing order, all elements have next greater element as -1.
c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.

Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.

  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12     -->     -1
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={4,5,2,14};
        nextGreater(arr);

    }
    public static void nextGreater(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int n=arr.length-1;

            int k=1;
            while ((i<n ) && k<arr.length-1)
            {
                if(arr[i]<arr[k] && k<arr.length)
                {
                    System.out.println(arr[i] +" next element "+arr[k]);
                    i++;
                    j--;
                    k++;
                    n--;
                }
                else{
                    i++;
                    k++;
                }

            }

    }
}
