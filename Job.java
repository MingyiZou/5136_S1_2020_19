package missonToMars;

public class Job {
	private String j_name;
	private String j_description;
	
	public Job()
	{
		j_name = "Unknown";
		j_description = "Unknown";
	}
	
	public String getJobName()
	{
		return j_name;
	}
	
	public String getJobDescr()
	{
		return j_description;
	}
	
	public void setJobName(String newJob_name)
	{
		j_name = newJob_name;
	}
	
	public void setJobDescr(String newJob_description)
	{
		j_description = newJob_description;
	}
}
