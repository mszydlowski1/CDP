import java.util.ArrayList;
import java.util.List;

public class DataFile {
    private String fileName;
    private int numberOfTasks;
    private List<Task> allTasks;

    DataFile (String fileName)
    {
        this.fileName = fileName;
        allTasks = new ArrayList<>();
    }

    public String getFileName ()
    {
        return fileName;
    }

    public int getNumberOfTasks ()
    {
        return numberOfTasks;
    }

    public void setNumberOfTasks (int numberOfTasks)
    {
        this.numberOfTasks = numberOfTasks;
    }

    public void setAllTasks (Task t)
    {
        allTasks.add(t);
    }

    public String toString()
    {
        StringBuilder haveToReturn = new StringBuilder();
        haveToReturn.append(numberOfTasks + "\n");
        for (int i = 0; i < allTasks.size(); i++)
        {
            haveToReturn.append(allTasks.get(i).toString());
        }
        return haveToReturn.toString();
    }



}
