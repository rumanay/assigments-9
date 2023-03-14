public class BubbleSortGeneric<T extends Comparable<? super T>> {
    public static void main(String[] args)
    {
        // example using Strings
        String[]                  arrayOfStrings = {"alex", "babi", "chole", "zay", "mandy", "jilo", "andi", "tami", "Nail", "Blake", "etan", "kara", "sam", "toni", "Ria", "Cami", "wan", "pav", "Demi", "Avi"};
        BubbleSortGeneric<String> stringSorter   = new BubbleSortGeneric<>();
        stringSorter.bubbleSort(arrayOfStrings);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        // example using Doubles
        Double[]                  arrayOfDoubles = {0.25, 0.05, 0.43, 0.845, 0.66, 0.99, 0.12, 0.23, 0.10, 0.20, 0.30, 0.26, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        BubbleSortGeneric<Double> doubleSorter   = new BubbleSortGeneric<>();
        doubleSorter.bubbleSort(arrayOfDoubles);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }

    void bubbleSort(T[] array)
    {
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            {
                // if the item at the previous index is greater than the item at the `currentIndex`, swap them
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    // swap
                    T temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    // save the index that was modified
                    lastModifiedIndex = currentIndex;
                }
            }
            // save the last modified index so we know not to iterate past it since all proceeding values are sorted
            n = lastModifiedIndex;
        }
    }
}