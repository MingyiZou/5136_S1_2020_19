package missonToMars;

public class SelectionCriteria {
    private int range_of_age;
    private int years_of_work_experience;
    private boolean health_records;

    public SelectionCriteria(int range_of_age, int years_of_work_experience, boolean health_records) {
        this.range_of_age = range_of_age;
        this.years_of_work_experience = years_of_work_experience;
        this.health_records = health_records;
    }

    public int getRange_of_age() {
        return range_of_age;
    }

    public int getYears_of_work_experience() {
        return years_of_work_experience;
    }

    public boolean isHealth_records() {
        return health_records;
    }

    public void setRange_of_age(int range_of_age) {
        this.range_of_age = range_of_age;
    }

    public void setYears_of_work_experience(int years_of_work_experience) {
        this.years_of_work_experience = years_of_work_experience;
    }

    public void setHealth_records(boolean health_records) {
        this.health_records = health_records;
    }
}
