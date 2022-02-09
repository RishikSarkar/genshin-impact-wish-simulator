import java.lang.Math;
import java.util.Scanner;

public class GenshinWishSimulator
{
	private int fourFifty = 0;
	private int fiveFifty = 0;
	private int pity = 1;
	
	//private static int totalrolls = 0;
	//private static int ganyu = 0;
	
	private String ThreeWeapon()
	{
		int i = (int)(Math.random() * 12) + 0;
		
		String s = "";
		
		switch (i) {
			case 0:
				s += "Cool Steel";
				break;
			case 1:
				s += "Harbinger of Dawn";
				break;
			case 2:
				s += "Skyrider Sword";
				break;
			case 3:
				s += "Bloodtainted Greatsword";
				break;
			case 4:
				s += "Debate Club";
				break;
			case 5:
				s += "Ferrous Shadow";
				break;
			case 6:
				s += "Black Tassel";
				break;
			case 7:
				s += "Magic Guide";
				break;
			case 8:
				s += "Thrilling Tales of Dragon Slayers";
				break;
			case 9:
				s += "Emerald Orb";
				break;
			case 10:
				s += "Raven Bow";
				break;
			case 11:
				s += "Sharpshooter's Oath";
				break;
			case 12:
				s += "Slingshot";
				break;
			default:
				s += "";
		}
		
		return s + " (3*)";
	}
	
	private String FourWeapon()
	{
		int i = (int)(Math.random() * 17) + 0;
		
		String s = "";
		
		switch (i) {
			case 0:
				s += "Favonius Sword";
				break;
			case 1:
				s += "The Flute";
				break;
			case 2:
				s += "Sacrificial Sword";
				break;
			case 3:
				s += "Lion's Roar";
				break;
			case 4:
				s += "Favonius Greatsword";
				break;
			case 5:
				s += "The Bell";
				break;
			case 6:
				s += "Sacrificial Greatsword";
				break;
			case 7:
				s += "Rainslasher";
				break;
			case 8:
				s += "Dragon's Bane";
				break;
			case 9:
				s += "Favonius Lance";
				break;
			case 10:
				s += "Favonius Codex";
				break;
			case 11:
				s += "The Widsith";
				break;
			case 12:
				s += "Sacrificial Fragments";
				break;
			case 13:
				s += "Eye of Perception";
				break;
			case 14:
				s += "Favonius Warbow";
				break;
			case 15:
				s += "The Stringless";
				break;
			case 16:
				s += "Sacrificial Bow";
				break;
			case 17:
				s += "Rust";
				break;
			default:
				s += "";
		}
		
		return s + " (4*)!";
	}
	
	private String FourChar()
	{
		int i = (int)(Math.random() * 15) + 0;
		
		String s = "";
		
		switch (i) {
			case 0:
				s += "Noelle";
				break;
			case 1:
				s += "Barbara";
				break;
			case 2:
				s += "Fischl";
				break;
			case 3:
				s += "Razor";
				break;
			case 4:
				s += "Bennett";
				break;
			case 5:
				s += "Xinyan";
				break;
			case 6:
				s += "Xiangling";
				break;
			case 7:
				s += "Sucrose";
				break;
			case 8:
				s += "Diona";
				break;
			case 9:
				s += "Thoma";
				break;
			case 10:
				s += "Rosaria";
				break;
			case 11:
				s += "Kujou Sara";
				break;
			case 12:
				s += "Chongyun";
				break;
			case 13:
				s += "Ningguang";
				break;
			case 14:
				s += "Sayu";
				break;
			case 15:
				s += "Gorou";
				break;
			default:
				s += "";
		}
		
		return s + " (4*)!";
	}
	
	private String FiveChar()
	{
		int i = (int)(Math.random() * 5) + 0;
		
		String s = "";
		
		switch (i) {
			case 0:
				s += "Mona";
				break;
			case 1:
				s += "Diluc";
				break;
			case 2:
				s += "Keqing";
				break;
			case 3:
				s += "Qiqi";
				break;
			case 4:
				s += "Jean";
				break;
			default:
				s += "";
		}
		
		return s + " (5*)!!";
	}
	
	private String FourFeatured()
	{
		int i = (int)(Math.random() * 3) + 0;
		
		String s = "";
		
		switch (i) {
			case 0:
				s += "Xingiu";
				break;
			case 1:
				s += "Beidou";
				break;
			case 2:
				s += "Yanfei";
				break;
			default:
				s += "";
		}
		
		return s + " (4* Featured)!";
	}
	
	private String FiveFeatured()
	{
		//ganyu++;
		return "Ganyu (5* Featured)!!";
	}
	
	private String RollThree()
	{
		return ThreeWeapon();
	}
	
	private String RollFour()
	{
		int i = (int)(Math.random() * 2) + 0;
		
		if (i == 0 || fourFifty == 1)
		{
			int j = (int)(Math.random() * 2) + 0;
			
			if (j == 0 || fourFifty == 1)
			{
				fourFifty = 0;
				return FourFeatured();
			}
			else
			{
				fourFifty = 1;
				return FourChar();
			}
		}
		else
		{
			fourFifty = 1;
			return FourWeapon();
		}
	}
	
	private String RollFive()
	{
		pity = 1;
		
		int i = (int)(Math.random() * 2) + 0;
		
		if (i == 0 || fiveFifty == 1)
		{
			fiveFifty = 0;
			return FiveFeatured();
		}
		else
		{
			fiveFifty = 1;
			return FiveChar();
		}
	}
	
	private String roll()
	{
		//totalrolls++;
		pity++;
		
		int i = (int)(Math.random() * 1000) + 1;
		
		//System.out.println(i);
		
		if (pity <= 75)
		{
			if (i >= 1 && i <= 6) // 0.6 %
			{
				return RollFive();
			}
			else if ((pity % 10 == 0) || (pity % 9 == 0 && i > 6 && i <= 567) || (i > 6 && i <= 57))
			{
				return RollFour();
			}
		}
		else if (pity > 75 && pity <= 89) // 32.4 %
		{
			if (i >= 1 && i <= 324)
			{
				return RollFive();
			}
			else if ((pity % 10 == 0) || (pity % 9 == 0 && i > 6 && i <= 567) || (i > 6 && i <= 57))
			{
				return RollFour();
			}
		}
		else
		{
			return RollFive();
		}
		
		return RollThree();
	}
	
	private void singlePull()
	{
		System.out.println(pity + "  " + roll());
	}
	
	private void tenPull()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println(pity + "  " + roll());
		}
	}
	
	public static void main (String[] args)
	{
		GenshinWishSimulator x = new GenshinWishSimulator();
		
		//x.tenPull();
		Scanner s = new Scanner(System.in);
		String entry = "";
		
		System.out.println("Welcome to Genshin Impact Wish Simulator!");
		System.out.println();
		
		while (!entry.equalsIgnoreCase("x"))
		{
			System.out.print("Enter \"s\" for a Single Pull, \"t\" for a Ten Pull, or any other key to Quit: ");
			entry = s.next();
			
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			
			if (entry.equalsIgnoreCase("s"))
			{
				x.singlePull();
			}
			else if (entry.equalsIgnoreCase("t"))
			{
				x.tenPull();
			}
			else
			{
				break;
			}
			
			System.out.println("------------------------------------------------------------------------");
			System.out.println();
		}
		
		//System.out.println(ganyu);
		
		/*int sumrolls = 0;
		
		for (int i = 0; i < 1000000; i++)
		{
			ganyu = 0;
			
			while (ganyu <= 6)
			{
				x.singlePull();
			}
			
			sumrolls += totalrolls;
			totalrolls = 0;
		}
		
		sumrolls = (int)(sumrolls / 1000000);
		
		System.out.println(sumrolls);*/
		
		System.out.println("Thanks for trying out the Simulator!");
	}
	
	// Number of pulls to get c6 Featured 5 Star = 649
	// Average Cost = $1603
}
