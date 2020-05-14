package application;

import java.util.*;
import java.util.stream.Collectors;

public class LogicalCoding {

    // 1. To find out duplicate elements in given array
    // input: 1, 2, 5, 5, 6, 6, 7, 2
    //output: 2, 5, 6

    // solution 1 : simple with out collection
    // Limitation: If any element repetes morethan two times in out put it will reflect.
    public void findDuplicates(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j])
                    System.out.println(array[i]);
            }
        }
    }

    // solution 2:
    public void findDuplicatesForMultiOccurance(int[] array){
        int result[] = new int[1];
        int count =0;
        int[] temp = new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j] && !isContain(temp,array[i])) { // for checking wheather we capture this elemet or not.
                    temp[count] = array[i];
                    count++;
                }
            }
        }
        result = new int[count];
        for(int i=0;i<count;i++){
            result[i] = temp[i]; // if want we can return result array as return type.
            System.out.println(temp[i]);
        }

    }
    // utility function to check for a element exists in given array.
    public boolean isContain(int[] a,int value){
        boolean contain = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==value){
                contain=true;
            }
        }
        return contain;
    }

    // solution 3 with collection
    public void findDuplicatesWithCollection(int[] a){
        List<Integer> list = new ArrayList<>(a.length);
        list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> nonDuplicate = new HashSet<>();

        for(Integer i : list){
            if(!nonDuplicate.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);
    }

    // --------------------------------------End of problem 1-------------------------------------------------------------------------

    // Problem 2: Java Program to remove duplicate elements in given Array
    // Input:  1, 2, 5, 5, 6, 6, 7, 2
    // Output:  1, 2, 5, 6, 7

    // Solution1:
    public void removeDuplicatesWithCollection(int[] a){
        Set<Integer> nonDuplicates = new HashSet<>();
        for(int i : a){
            nonDuplicates.add(i);
        }
        System.out.println(nonDuplicates);
    }

    // Solution2 with out collection

    public void removeDuplicates(int[] a){
        int[] result = new int[a.length];
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(!isContain(result,a[i])){
                result[count] = a[i];
                count++;
            }
        }
        for (int i=0;i<count;i++) {
            System.out.println(result[i]);
        }
    }

    // -------------------------------------- End of problem 2 -------------------------------------------------------------------------------------

    // Problem 3: Program to find sum of unique elements in given array.

    /*Input = {1, 6, 4, 3, 2, 2, 3, 8, 1};
    Output : 24
            (Unique elements are: 1, 6, 4, 3, 2, 8)

    Input= {1, 1, 3, 2, 2, 3};
    Output : 6
            (Unique elements are: 1, 2, 3)*/

    // solution 1: using collection
     public void sumOfUniqueElementsWithCollection(int[] a){
         Set<Integer> nonDuplicates = new HashSet<>();
         int sum =0;
         for(int i : a){
             if(nonDuplicates.add(i)){
                 sum = sum+i;
             }
         }
         System.out.println(sum);
     }

     // solutin 2: withoutColletion

    public void sumOfUniqueElements(int[] a){
         int sum = 0;
         int count = 0;
         int[] result = new int[a.length];
         for(int i : a){
             if(!isContain(result,i)){
                 result[count] = i;
                 count++;
             }
         }
        for (int i:result) {
            sum =sum+i;
        }
        System.out.println(sum);
    }
     // utility method to remove duplicates
    public int[] removeduplicatesFromArray(int[] a){
        int count = 0;
        int[] temp = new int[a.length];
        for(int i : a){
            if(!isContain(temp,i)){
                temp[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        for(int i=0;i<count;i++){
            result[i] = temp[i];
        }
         return result;
    }
    // utility method for sorting with duplication removal
    public int[] sortElements(int[] b){
         int[] a = removeduplicatesFromArray(b);
         int temp =0;
         for(int i=1;i<a.length;i++){
             for(int j=i;j>0;j--){
                 if(a[j-1]>a[j]){
                     temp = a[j];
                     a[j] = a[j-1];
                     a[j-1] = temp;
                 }
             }
         }
         return a;
    }
    // problem 4 : program to find (third) nth largest number

    public int largestNumber(int[] a,int position){
         int[] result = sortElements(a);
        if(a.length==0 && position>result.length)
            return -1;
         return result[result.length-position];
     }

     // problem 5: find max difference between two elements

    public int maxDiff(int[] a){
         if(a.length==0)
             return -1;
         int[] result = sortElements(a);
         return result[result.length-1]-result[0];
    }



    // problem 6: findMinAndMax values

    public void minAndMax(int[] a){
         // we can use Arrays.sort() also
        int[] result = sortElements(a);
        if(result.length<2)
            return;
        System.out.println("Min element is:: "+result[0] + "  Max element is :: "+result[result.length-1]);
    }
    // solution with out sorting

    public void findMinAndMax(int[] a){
         int min=a[0];
         int max=a[0];

        for (int i:a) {
            min = i<min ? i : min;
            max = i>max ? i : max;
        }
        System.out.println("Min element is:: "+ min + "  Max element is :: "+ max);
    }

    // problem 7 : findMinAndMax values for any given rank

    public void minAndMaxForN(int[] a,int n){
        int[] result = sortElements(a);
        if(result.length<n)
            return;
        System.out.println("Min element is:: "+result[n-1] + "  Max element is :: "+result[result.length-n]);
    }

    // problem 8 : finding common elements in arrays
    // for any non-sorting and sorting arrays
    public void commonElements(int[] a1,int[] a2,int[] a3) {

         // incase if given array contains diuplicates
        a1 = removeduplicatesFromArray(a1);
        a2 = removeduplicatesFromArray(a2);
        a3 = removeduplicatesFromArray(a3);
        for (int i: a1) {
            if(isContain(a2,i) && isContain(a3,i)){
                System.out.println(i);
            }
        }
    }

    // for sorting arrays
    public void commonElementsForSorted(int[] a1,int[] a2,int[] a3){
         int i=0,j=0,k = 0;

         while(i<a1.length && j<a2.length && k <a3.length){

             if(a1[i]==a2[j] && a2[j]==a3[k]){
                 System.out.println(a1[i]);
                 i++;
                 k++;
                 j++;
             }
             else if(a1[i]<a2[j]){
                 i++;
             }
             else if(a2[j]<a3[k]){
                 j++;
             }
             else {
                 k++;
             }

         }
    }

    // problem 9 : finding element pairs in given array whose sum is equal to given number

    public void elementPairsForSum(int[] a, int sum){
         for(int i = 0;i<a.length;i++){
             for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j] == sum)
                    System.out.println("pair is : : " + a[i] + " : " + a[j]);
             }
         }
    }

    // problem 10: finding smallest pair sum in given array

    public void smallestPair(int[] a){
         if(a.length <2)
             return;
         int minSum = a[0]+a[1];
        for(int i = 0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]<minSum)
                    minSum = a[i]+a[j];
            }
        }
        System.out.println("The smallest total of two elements is : : " + minSum);
    }




}
