
public class LetterFrequency extends AnalyzeText 
{
	private final String words;
	
	public LetterFrequency (String words)
	{
		this.words = words;
		
	}
	
	public int textAnalysis (String words)
	{	
		int i, j;
		int countA, countB, countC, countD, countE;
		int countF, countG, countH, countI, countJ;
		int countK, countL, countM, countN, countO;
		int countP, countQ, countR, countS, countT;
		int countU, countV, countW, countX, countY, countZ;
		
		String[] sentence = words.split(" ");
		
		countA = 0;
			
		for(i = 0; i < sentence.length; i++)
			{
				System.out.println(sentence[i]);
				System.out.printf("Total characters in the word: ", + sentence[i].length());
				for (j = 0; j < sentence[i].length(); j++)
				{
					if (sentence[i].charAt(j) == 'A' || sentence[i].charAt(j) == 'a')
					{
						countA++;
					}
				}
			}
			
				return countA;
		}
	
	public String toString ()
	{
		return String.format("Number of A's: %s%n", textAnalysis(words));
	}

	@java.lang.Override
	public int textAnalysis(java.lang.Object text) {
		return 0;
	}
}
