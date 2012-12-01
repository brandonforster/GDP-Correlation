//Brandon Forster, Robert Millward,
//Matt Bald
//COP 3503 Extra Credit Assignment
//National Gross Domestic Product Per Capita Analyzer
//3 December 2012
//Country data object

public class Country {
	
	private int 		weoCountryCode;
	private String 		iso;
	private String 		weoSubjectCode;
	private String 		name;
	private double[]	values;
	private int			estStartYear;

	public Country(
			int 		weoCountryCode,
			String 		iso,
			String		weoSubjectCode,
			String 		name,
			double[]	values,
			int			estStartYear)
	{
		this.weoCountryCode = weoCountryCode;
		this.iso			= iso;
		this.weoSubjectCode = weoSubjectCode;
		this.name			= name;
		this.values			= values;
		this.estStartYear	= estStartYear;
	}
}
