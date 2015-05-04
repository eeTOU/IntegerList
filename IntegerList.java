
// *************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//
// *************************************************************

public class IntegerList
{
    int[] list; //values in the list
//-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
//-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
//-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
//-------------------------------------------------------
//return the index of the first occurrence of target in the list.
//return -1 if target does not appear in the list
//-------------------------------------------------------
    public int search(int target)
    {
        int location = -1;
        for (int i=0; i<list.length && location == -1; i++)
            if (list[i] == target)
                location = i;
        return location;
    }
//-------------------------------------------------------
//sort the list into ascending order using the selection sort

    //-------------------------------------------------------
    public void selectionSort()
    {
        int minIndex;
        for (int i=0; i < list.length-1; i++)
        {
//find smallest element in list starting at location i
            minIndex = i;
            for (int j = i+1; j < list.length; j++)
                if (list[j] < list[minIndex])
                    minIndex = j;
//swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public void replaceFirst(int oldVal ,int newVal)
    {
        for (int i=0; i < list.length ; i++)
        {
            if(list[i] == oldVal)
            {
                int temp = list[i];
                list[i] = newVal;
                newVal = temp;
            }
        }
    }

    public void replaceAll(int oldVal, int newVal)
    {
        for (int i=0; i< list.length-1; i++)
        {
            replaceFirst(oldVal,newVal);
        }
    }

    public void sortDecreasing()
    {
        for(int l=list.length; l>0;l--)
        {
            int minIndex;
            for (int i=0; i < list.length-1; i++)
            {
//find greater element in list starting at location i
                minIndex = i;
                for (int j = i+1; j < list.length; j++)
                    if (list[j] > list[minIndex])
                        minIndex = j;
//swap list[i] with greater element
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }

    public int binarySearchD(int target)
        {
             int low = 0;
             int high = list.length - 1;

             while(high >= low) {
                     int middle = (low + high) / 2;
                     if(list[middle] == target) {
                            return middle;
                         }
                     if(list[middle] < target) {
                             low = middle + 1;
                         }
                     if(list[middle] > target) {
                             high = middle - 1;
                         }
                }
             return -1;
   }

}
