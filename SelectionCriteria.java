package missonToMars;

public class SelectionCriteria {
    private int maxAge;
    private int minAge;
    private int years_of_work_experience;
    private String health_records;

    public SelectionCriteria(int maxAge, int minAge, int years_of_work_experience, String health_records) {
        this.maxAge = maxAge;
    	this.minAge = minAge;
        this.years_of_work_experience = years_of_work_experience;
        this.health_records = health_records;
    }

    public int getMaxAge() {
        return maxAge;
    }
    
    public int getMinAge() {
    	return minAge;
    }
    public int getYears_of_work_experience() {
        return years_of_work_experience;
    }

    public String getHealth_records() {
        return health_records;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setMinAge(int minAge) {
    	this.minAge = minAge;
    }
    
    public void setYears_of_work_experience(int years_of_work_experience) {
        this.years_of_work_experience = years_of_work_experience;
    }

    public void setHealth_records(String health_records) {
        this.health_records = health_records;
    }
}