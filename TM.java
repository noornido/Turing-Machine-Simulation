public class TM {
	
	public TM(String[] transFn, String tape, int head)
	{   
	   char state = '0';
	   char[] tape1 = tape.toCharArray();
	   int len = tape.length();
		while(true)
		{
			int i = 0;
			while(i < transFn.length)
			{
				if((tape1[head] == transFn[i].charAt(1)) && (transFn[i].charAt(0) == state))
				{
					state = transFn[i].charAt(2);
					tape1[head] = transFn[i].charAt(3);
					if(transFn[i].charAt(4) == 'L')
					{
						head--;
					}
					
					else if(transFn[i].charAt(4) == 'R')
					{
						head++;
					}
					
					else if(transFn[i].charAt(4) == 'Y')
					{
						tape = String.valueOf(tape1);
						System.out.println("O/P tape is:  " 
						+ tape.substring(0, (head)) + '(' +
						tape.charAt(head) + ')' + tape.substring(head + 1, (len)) 
						+ " " + "(String is accepted)");
						System.exit(0);
					}
					
					else if(transFn[i].charAt(4) == 'N')
					{
						tape = String.valueOf(tape1);
						System.out.println("O/P tape is:  " 
								+ tape.substring(0, (head)) + '(' +
								tape.charAt(head) + ')' + tape.substring(head + 1, (len)) 
								+ " " + "(String is rejeted)");
						System.exit(0);
					}
					
					break;
				}
				
				i++;
			}
			
		}
	}			
}
		

