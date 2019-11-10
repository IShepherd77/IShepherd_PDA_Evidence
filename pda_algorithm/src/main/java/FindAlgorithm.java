public class FindAlgorithm{
    public static int countOccurrences(int testArray[], int testValue){
        int returnCount = 0;
        for (int currentPosition = 0; currentPosition < testArray.length; ++currentPosition){
            if(testArray[currentPosition] == testValue){
                returnCount += 1;
            }
        }
        return returnCount;
    }

    public static void main(String[] args) {
        int testData[] = {1, 2, 3, 4, 5, 4, 3, 2,};
        int findCount = countOccurrences(testData, 2);
        System.out.println(findCount);
        findCount = countOccurrences(testData, 5);
        System.out.println(findCount);
    }
};