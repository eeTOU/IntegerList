
import java.util.List;

public class SortedIntList extends IntList  {

    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value)
    {
            super.add(value);
            int i =0;
            while (i< list.length && list[i] > value)
            {
                i++;
            }
            if(i < list.length)
            {
                for(int j= list.length -1; j >i ;j--)
                {
                    list[j] = list [j-1];
                }
                list[i] = value;
            }

    }
}


