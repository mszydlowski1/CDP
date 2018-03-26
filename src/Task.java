public class Task {
    private int accessTime;
    private int operatingTime;

    public int getAccessTime()
    {
        return accessTime;
    }
    public void setAccessTime(int accessTime)
    {
        this.accessTime = accessTime;
    }
    public int getOperatingTime()
    {
        return operatingTime;
    }
    public void setOperatingTime(int operatingTime)
    {
        this.operatingTime = operatingTime;
    }

    public Task (int acesTime, int serviceTime)
    {
        this.accessTime = acesTime;
        this.operatingTime = serviceTime;
    }

    public String toString()
    {
        StringBuilder haveToReturn = new StringBuilder();
        haveToReturn.append(accessTime);
        haveToReturn.append("     ");
        haveToReturn.append(operatingTime);
        haveToReturn.append("\n");
        return haveToReturn.toString();

    }
}
