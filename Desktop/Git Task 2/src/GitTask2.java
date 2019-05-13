import java.util.Scanner;
public class GitTask2
{
	public static void main( String args )
	{
		Scanner scan = new Scanner( System.out.in );
		StringBuilder stringy = new StringBuilder( scan.nextLine() );
		stringy = stringy.reverse();
		System.out.print( stringy.toString );
	}
}
