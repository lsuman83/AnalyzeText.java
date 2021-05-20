


public abstract class AnalyzeText<String>
{
	private String[] text;

	@java.lang.SafeVarargs
	public AnalyzeText (String...text)
	{
		this.text = text;
		
		
	}
	
	
	public String[] getText()
	{
		return text;
	}
	
	public abstract int textAnalysis (String text);
}
