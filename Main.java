import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		System.out.println("Enter number of states: ");
		int s = in.nextInt();
		in.nextLine();
		System.out.println("Enter alphabet as a string: ");
		String gamma = in.nextLine(); 
		if(gamma.contains("<"))
		{
			System.out.println("Error: Gamma should not contain the symbol '<'");
			System.exit(0);
		}
		
		int len = gamma.length();
		System.out.println("Enter each transition function as a string, "
		+ "but first state, if the '<' symbol is checked on the tape or not "
		+ "(Press 'y' if yes, and any key if not)");
		
		String[] transFn;
		if(in.nextLine().charAt(0) == 'y')
		{
			transFn = new String[ (len + 1) * s];
			for(int i = 0; i < ( (len + 1) * s ); i++)
			{
				transFn[i] = in.nextLine();
				
			}	
		}
		
		else
		{
			transFn = new String[(len) * s];
			for(int i = 0; i < ( (len) * s ); i++)
			{
				transFn[i] = in.nextLine();
				
			}
		}
		
		System.out.println("Enter i/p tape as a string");
		String tapeI = in.nextLine();
		if(tapeI.contains("<"))
		{
			System.out.println("Error: i/p tape shouldn't contain the symbol '<'");
			System.exit(0);
		}
		
		String tapeF = '<' + tapeI + '#'; 
		System.out.println("Enter position of head, "
				+ "note that head = 0 refers to the first cell in the tape, "
				+ "which contain the '<' symbol");
		int head;
		head = in.nextInt();
		if(head < 0)
		{
			System.out.println("Error: head position should be greater than or equal to 0");
		}
		
		new TM(transFn, tapeF, head);
	
	}

}
