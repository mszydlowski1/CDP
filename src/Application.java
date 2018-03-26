public class Application {

    public static void main(String[] args)
    {
        DataFile newDataFile = new DataFile("dataFiles/SCHRAGE2.DAT");
        WorkingWithDataFile.readTasks(newDataFile);
        System.out.println(newDataFile);

    }
}
