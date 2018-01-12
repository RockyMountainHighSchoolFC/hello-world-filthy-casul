/*authored by a dog (Austin)
 * created on January 11, 2018
 */
import java.util.*;

public class spaghettiSauce{
	public static void main(String[] args){
		Random randomBool = new Random();
		boolean Switcheroo = randomBool.nextBoolean();
		System.out.println("Ich heiﬂe jeff, hallo Welt");
		for(int i = 1; i<=100; i++){
			if(Switcheroo==true){
				System.out.println("hello");
			}
			if(Switcheroo==false){
				System.out.println("hi");
			}
			Switcheroo = randomBool.nextBoolean();
		}
		System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaADSACDSAJFCJDSCHDSVIDSV ISDV");
		String asdf = "peter piper liked fried pickles";
		String casb = " and ";
		String bdsf = "Computerwissenschaft is \"computer science\" in german";
		System.out.printf("%n"+asdf+casb+bdsf);
		System.out.println("");
		int argh = 129;
		String s = "The number of rabbits is ";
		String report = s + argh + ".";
		System.out.println(report);
		String p = "Groovy Dude";
		System.out.println(p.toUpperCase());
		String g = "computer science is for nerds you nerd";
		System.out.println(g.toLowerCase());
		String m = "The Gettysburg Address";
		String c = m.substring(4);
		System.out.println(c);
		String b = "Four score and seven years ago";
		String cas = b.substring(7,12);
		System.out.println(cas);
		int count;
		String snake = "Surface tension";
		count = snake.length();
		System.out.println(count);
		String mad = "Look here!";
		System.out.println(mad + " has " + mad.length() + " characters.");
		System.out.println("All \"good\" men should come to the aid of their country.");
		System.out.println("Hello\nHello again");
		System.out.println("A backslash looks like this \\, ...right?");
		String pq = "Eddie Haskel";
		int hm = pq.length();
		String ed = pq.substring(hm-4);
		System.out.println(ed);

		}
	}