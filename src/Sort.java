import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int runCounter = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                runCounter++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(runCounter);
    }

    public static void insertionSort(int[] elements)
    {
        int runCounter = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                runCounter++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(runCounter);

    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        int counter = 0;
        for (int i = 0; i < words.size(); i++)
        {
            int minIndex = i;
            for (int x = i + 1; x < words.size(); x++)
            {
                String currentMin = words.get(minIndex);
                String compare = words.get(x);
                if (currentMin.compareTo(compare) < 0)
                {
                    minIndex = x;
                }
            }
            String temp = words.get(minIndex);
            words.set(minIndex, );
        }
        System.out.println(counter);
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        int counter = 0;
        for (int i = 1; i < words.size(); i++)
        {

        }
    }
}