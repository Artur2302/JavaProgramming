package lessonOOP;

import Files.FileService;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        int[] arr = {5, 6, 103, 103,95,107, 8, 1, 12, 87, 4, 64, 95};
        System.out.println(secondMax(arr));
    }

    private static int secondMax(int[] a) {
        if(a.length == 1)
            return a[0];
        int max, max2;

        if(a[0] > a[1]){
            max = a[0];
            max2 = a[1];
        }else{
            max = a[1];
            max2 = a[0];
        }
        for (int i = 2; i < a.length ; i++) {
            if(a[i] > max){
                max2 = max;
                max = a[i];
                continue;
            }
             if(a[i] > max2 && a[i] != max)
                max2 = a[i];
        }
        return max2;

    }
}

