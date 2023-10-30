package TellMePleaseV2;
import java.util.Scanner;
public class TellMePleaseV2 {
	
	public static boolean isVowel(char a) {
		if(a == 'A' || a=='E' || a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			return true;
		}else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String line = sc.nextLine(),maxWord = "",minWord = "";
		String[] splitline = line.split(" ");
		int cnt = 0,min = Integer.MAX_VALUE , max = Integer.MIN_VALUE; 
		for(int i=0;i<splitline.length;i++) {
			cnt = 0;
			try {
				Integer.parseInt(splitline[i]);
			}
			catch(NumberFormatException e) {
				for(int j=0;j<splitline[i].length();j++) {
					char temp = splitline[i].charAt(j);
					if(!(isVowel(temp))&&((temp > 'a' && temp <= 'z')|| (temp > 'A'&& temp <= 'Z'))) {
						cnt++;
					}
				}
				if(cnt > max) {
					max = cnt;
					maxWord = splitline[i];
				}
				if(cnt < min) {
					min = cnt;
					minWord = splitline[i];
				}
			}
		}
		maxWord = maxWord.replaceAll("\\W", "");
		System.out.println("The largest word is \'" + maxWord +"\' with "+ max+" consonant letters");
		System.out.println("and the smallest word is \'"+ minWord +"\' with "+ min+" consonant letters\r\n"
				+ "");
		sc.close();
	}

}
