import java.util.Scanner;
public class GitTask2
{
	public static void main( String args )
	{
		Scanner scan = new Scanner( System.in );
		StringBuilder stringy = new StringBuilder( scan.nextLine() );
		stringy = stringy.reverse();
		System.out.print( stringy.toString() );
		scan.close();
	}
}
// wrote toString instead of toString()
// wrote System.out.in instead of System.in
// forgot scan.close();