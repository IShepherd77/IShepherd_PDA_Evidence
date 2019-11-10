import sun.awt.geom.AreaOp;

import java.util.Arrays;

public class SortAlgorithm {

    public static void sort(int testArray[]) {
      for(int i = testArray.length -1; i >=1; i--){
          for( int j = 2; j <= i; j++){
              if( testArray[j-1] > testArray[j]) {
                  int t = testArray[j-1]; testArray[j-1] = testArray[j]; testArray[j] = t;

              }
          }
      }
    }
    public static void main(String[] args) {
        int testData[] = new int[]{1, 2, 3, 4, 5, 4, 3, 2,};
        System.out.println(Arrays.toString(testData));
        sort(testData);
        System.out.println(Arrays.toString(testData));
    }
    };





