//Brandon Forster, Robert Millward,
//Matt Bald
//COP 3503 Extra Credit Assignment
//National Gross Domestic Product Per Capita Analyzer
//3 December 2012
//WEO Subject Data Object

public class Subject {
	
	private String 		weoSubjectCode;
	private double[]	values;
	private int			estStartYear;
	
	public Subject(
			String 		weoSubjectCode,
			double[]	values,
			int			estStartYear)
	{
		this.weoSubjectCode = weoSubjectCode;
		this.values			= values;
		this.estStartYear	= estStartYear;
	}

}
