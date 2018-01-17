/*authored by a dog (Austin)
 * created on January 11, 2018
 */
import java.util.*;

public class spaghettiSauce{
	public static void main(String[] args){
		Random randomBool = new Random();
		boolean Switcheroo = randomBool.nextBoolean();
		System.out.println("Ich heiße jeff, hallo Welt");
		for(int i = 1; i<=100; i++){
			if(Switcheroo==true){
				System.out.println("hello");
			}
			if(Switcheroo==false){
				System.out.println("hi");
			}
			Switcheroo = randomBool.nextBoolean();
		}
	}
}
