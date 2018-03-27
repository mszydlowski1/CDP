package Logic;

import Data.DataFile;
import Data.Task;
import Data.Task.AccessTimeComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithTasks {

    public static void sortTasks (DataFile df)    //funkcja sluzaca do sortowania obiektow Task  listy allTasks obiektu DataFile
    {
        List<Task> newQueue = new ArrayList<Task>(df.getAllTasks());    //funkcja tworzy nowa liste i przypisuje do niej oryginalna liste z obiektu DataFile
        Collections.sort(newQueue, new AccessTimeComparator());    //dzieki przeciazonej funkcij compare, w latwy sposob sortujemy dane z listy, dzieki funkcij sort
        df.setAllTasks(newQueue);    //przypisujemy do starej oryginalne listy, liste posortowana przez funkcje sort
    }

    public static int Cmax(DataFile df)    //funkcja znajdujaca CMAX na posortowanych już zadaniach
    {
        int cmax = 0;    //inicjalizacja cmax, na poczatku 0

        for (int i = 0; i < df.getNumberOfTasks(); i++)    //funkcja for, przebiegajace przez wszystkie Task danej listy obiektu DataFile
        {
            if (cmax < df.getOneTask(i).getAccessTime())   //jesli cmax mniejsze od czasu dostepnosci zadania numer i, to
            {
                cmax = df.getOneTask(i).getAccessTime()  + df.getOneTask(i).getOperatingTime();   //cmax = czas dostepnosci + czas wykonania zadania i
            }
            else    //jesli cmax nie mniejsze, to
            {
                cmax = cmax + df.getOneTask(i).getOperatingTime();  //cmax = cmax + czas wykonania zadania nr i
            }
        }
        return cmax;
    }
}
