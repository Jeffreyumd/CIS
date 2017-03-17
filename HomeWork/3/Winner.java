
public class Winner{
	
	private String team;
	private int year;
	
	private Winner()
	{
		/**
		 * Make default constuctor private
		 */
	}
	
	/**
	 * public constuctor
	 * @param team
	 * @param year
	 */
	public Winner(String team, int year)
	{
		this.team = team;
		this.year = year;
	}
	
	public String getTeam(){
		return team;
	}
	
	public int getYear(){
		return year;
	}
	
}/// end of winner class
