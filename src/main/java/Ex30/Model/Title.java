package Ex30.Model;

public class Title {
    private String name;
    private int runTime;
    private int year;

    public Title(String name, int runTime, int year){
        setName(name);
        setRunTime(runTime);
        setYear(year);
    }

    public String getName(){
        return name;
    }
    public int getRunTime(){
        return runTime;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRunTime(int runTime){
        this.runTime = runTime;
    }
    public void setYear(int year){
        this.year = year;
    }
    /*
    @Override
    public String toString(){
        return "Name: " + getName() + ", " + " Runtime: " + getRunTime() + ", " + "Year: " + getYear();
    }

     */
}
