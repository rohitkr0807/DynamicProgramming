package CompanyPrepartion;

import java.util.Arrays;

/*
Find a triplet that sum to a given value
Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false. For example, if the given array is {12, 3, 4, 1, 6, 9} and given sum is 24, then there is a triplet (12, 3 and 9) present in array whose sum is 24.
 */
public class Findtriplet {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8,9,13};
        int num=18;
        tripletwithgivenSum(arr,num);

    }
    public  static void tripletwithgivenSum(int arr[],int num)
    {
        int n= arr.length;
        for (int i = 0; i <n-2 ; i++) {
            for (int j = i+1; j <n-1; j++) {
                for (int k = j+1; k <n ; k++) {
                    if(arr[i]+arr[j]+arr[k]==num)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void triplet(int arr[],int sum)
    {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<=j)
        {
            int k=i+1;
            if(arr[i]+arr[j]>=sum)
            {
                j--;
            }


        }
    }
}
