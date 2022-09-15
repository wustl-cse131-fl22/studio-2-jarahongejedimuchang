package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Start amount?");
		double startAmount = in.nextDouble();
		System.out.println("Win chance?");
		double winChance = in.nextDouble();
		System.out.println("Win limit?");
		double winLimit = in.nextDouble();
		System.out.println("Days you'll simulate?");
		int totalSimulations = in.nextInt();
		
		for (int i = 0; i < totalSimulations; i++)
		{
			int count = 0;
			double newAmount = startAmount;
			while (newAmount > 0 && newAmount < winLimit)
			{
				double random = Math.random();
				if (random < winChance)
				{
					newAmount++;
				}
				else
				{
					newAmount--;
				}
				count++;
			}
			String winOrLose;
		      if (newAmount == winLimit)
		      {
		        winOrLose = "WIN";
		      }
		      else
		    	  winOrLose = "LOSE";
			System.out.println("Simulation " + i + ": " + count + " " + winOrLose);
		}	
	}
}
