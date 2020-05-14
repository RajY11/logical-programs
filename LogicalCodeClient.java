package application;

public class LogicalCodeClient {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 5, 6, 6, 7, 2};
        int[] a2 = {1, 6, 4, 3, 2, 2, 3, 8, 1};
        int[] a3 = {1, 1, 3, 2, 2, 3};
        int[] a4 =  { 6, 8, 1, 9, 2, 1, 10, 12};
        int[] a5 = { 2, 5, 1, 7, 3, 9, 5};
        int[] a6 = {1, 2, 5, 9, 6, 4, 7, 2};
        int[] a7 = {3, 6, 8, -8, 10, 8 };
        int[] a8 = {1, 7, 2, 9, 6};
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        LogicalCoding obj = new LogicalCoding();
        //obj.findDuplicates(a1);
        //obj.findDuplicatesForMultiOccurance(a1);
        //obj.findDuplicatesWithCollection(a1);
        //obj.removeDuplicatesWithCollection(a1);
        //obj.removeDuplicates(a1);
        //obj.sumOfUniqueElementsWithCollection(a2);
        // obj.sumOfUniqueElementsWithCollection(a3);
       // obj.sumOfUniqueElements(a2);
        // obj.sumOfUniqueElements(a3);
       // System.out.println(obj.largestNumber(a4,3));
        //System.out.println(obj.maxDiff(a5));
        //obj.minAndMax(a1);
        // obj.minAndMaxForN(a6,2);
        //obj.findMinAndMax(a6);
        //obj.commonElementsForSorted(ar1,ar2,ar3);
       // obj.elementPairsForSum(a7,16);
        obj.smallestPair(a8);
    }
}
