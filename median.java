
import java.util.ArrayList;
import java.util.List;

public class median {
    public double findMedian(int[] arr1, int[] arr2) {
        List<Integer> l = new ArrayList<>();
        for (int num : arr1) {
            l.add(num);
        }
        for (int num : arr2) {
            l.add(num);
        }
        //Collections.sort(l);
        int size = l.size();
        if (size % 2 == 0) {
            double result=(l.get((size/2)-1)+l.get(size/2))/2.0;
            return result;
        }
        return l.get(size / 2);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2,3};
        int[] arr2 = { 4 };
        median m = new median();
        double result = m.findMedian(arr1, arr2);
        System.out.println("Median is: " + result);

    }
}
