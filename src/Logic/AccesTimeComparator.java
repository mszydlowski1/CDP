package Logic;
import Data.Task;

import java.util.Comparator;

public class AccesTimeComparator implements Comparator<Task> {
    public int compare (Task first, Task second)
    {
        return first.getAccessTime() - second.getAccessTime();
    }

}
