import java.util.ArrayList;

//Brandon Forster, Robert Millward,
//Matt Bald
//COP 3503 Extra Credit Assignment
//National Gross Domestic Product Per Capita Analyzer
//3 December 2012
//Country data object

public class Country {
	
	private int 				weoCountryCode;
	private String 				iso;
	private String 				name;
	private ArrayList<Subject>	subjects;

	public Country(
			int 				weoCountryCode,
			String 				iso,
			String 				name,
			ArrayList<Subject>	subjects)
	{
		this.weoCountryCode = weoCountryCode;
		this.iso			= iso;
		this.name			= name;
		this.subjects		= subjects;
	}
}
