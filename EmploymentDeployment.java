package missonToMars;

public class EmploymentDeployment {
	private String title;
	private int number_required;
	
	public EmploymentDeployment()
	{
		title = "Unknown";
		number_required = 0;
	}
	
	public String getEmpTitle()
	{
		return title;
	}
	
	public int getEmpReq()
	{
		return number_required;
	}
	
	public void setEmpTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public void setNumReq(int newNumReq)
	{
		number_required = newNumReq;
	}
}
