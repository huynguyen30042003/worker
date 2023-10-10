package Model;

public class HistoryWorker extends Worker {
    private String typeOfStatus;
    private int day;
    private int month;
    private int year;

    public HistoryWorker() {

    }

    public HistoryWorker(int id, String name, int age, int salary, String workLocation, String typeOfStatus, int day,
            int month, int year) {
        super(id, name, age, salary, workLocation);
        this.typeOfStatus = typeOfStatus;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getTypeOfStatus() {
        return typeOfStatus;
    }

    public void setTypeOfStatus(String typeOfStatus) {
        this.typeOfStatus = typeOfStatus;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + "typeOfStatus=" + typeOfStatus + ", " + day + "/" + month + "/"
                + year;
    }

}
