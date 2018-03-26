package AppWorking;
import Data.DataFile;
import Logic.WorkingWithDataFile;
import Logic.WorkingWithTasks;

public class Application {

    public static void main(String[] args)
    {
        DataFile newDataFile = new DataFile("dataFiles/JACK3.DAT");
        WorkingWithDataFile.readTasks(newDataFile);
        System.out.println(newDataFile);
        WorkingWithTasks.sortTasks(newDataFile);
        System.out.println(newDataFile);
        System.out.println(WorkingWithTasks.Cmax(newDataFile));

    }
}
