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
        for (int i = 0; i < words.size() - 1; i++)
        {
            int minIndex = i;
            for (int x = i + 1; x < words.size(); x++)
            {
                String currentMin = words.get(minIndex);
                String compare = words.get(x);
                if (currentMin.compareTo(compare) > 0)
                {
                    minIndex = x;
                }
            }
            String temp = words.get(minIndex);
            words.set(minIndex, words.get(i));
            words.set(i, temp);
        }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        /* faulty solution, don't know why
        for (int i = 1; i < words.size(); i++)
        {
            int fit = i;
            while (fit > 0 && words.get(fit).compareTo(words.get(fit - 1)) > 0)
            {
                fit--;
            }
            if (i != fit) {
                String temp = words.get(i);
                words.remove(i);
                words.add(fit, temp);
            }
        }
        */
        for (int i = 1; i < words.size(); i++)
        {
            String temp = words.get(i);
            int fit = i;
            while (fit > 0 && temp.compareTo(words.get(fit - 1)) < 0)
            {
                words.set(fit, words.get(fit - 1));
                fit--;
            }
            if (fit != i)
            {
                words.set(fit, temp);
            }
        }
    }
}