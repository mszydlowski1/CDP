package Logic;

import Data.DataFile;
import Data.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithTasks {

    public static void sortTasks (DataFile df)
    {
        List<Task> newQueue = new ArrayList<Task>(df.getAllTasks());
        Collections.sort(newQueue, new AccesTimeComparator());
        df.setAllTasks(newQueue);
    }

    public static int Cmax(DataFile df)
    {
        int cmax = 0;

        for (int i = 0; i < df.getNumberOfTasks(); i++)
        {
            int add;
            if (cmax < df.getOneTask(i).getAccessTime())
            {
                cmax = df.getOneTask(i).getAccessTime()  + df.getOneTask(i).getOperatingTime();
            }
            else
            {
                cmax = cmax + df.getOneTask(i).getOperatingTime();
            }
        }
        return cmax;
    }

//    public static int Cmax(DataFile df)
//    {
//        List<Integer> Cmax = new ArrayList<>();
//        Cmax.add(0);
//
//        for (int i = 0; i < df.getNumberOfTasks(); i++)
//        {
//            int toAdd = Math.max(Cmax.get(i), df.getOneTask(i).getAccessTime() + df.getOneTask(i).getOperatingTime());
//            Cmax.add(toAdd);
//        }
//        return Cmax.get(df.getNumberOfTasks());
//    }
}
