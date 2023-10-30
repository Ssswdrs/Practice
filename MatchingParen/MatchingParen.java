package MatchingParen;
import java.util.Scanner;
public class MatchingParen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ans = new char[s.length()];
		for(int i=0;i<s.length();i++)ans[i] = s.charAt(i);
		for(int i=0;i<ans.length;i++) {
			if(ans[i]=='(' || ans[i]==')'){}
			else ans[i] = '-';
		}
		char w = 'a';
		for(int i=0;i<ans.length;i++) {
			if(ans[i]=='(') {
				ans[i] = (char)w;
				w++;
			}
		}
		char[] temp = ans.clone();
		for(int i=0;i<ans.length;i++) {
			if(ans[i]==')') {
				for(int j=i;j>0;j--) {
					if(temp[j-1]!='-') {
						ans[i] = temp[j-1];
						temp[j-1] = '-';
						break;
					}
				}
				temp[i] = '-';
			}
		}
		int check = 0;
		for(int i=0;i<ans.length;i++) {
			if(ans[i]==')')ans[i] = '?';
			else if(ans[i]!='-'){
				check = 0;
				for(int j=0;j<ans.length;j++) {
					if(i!=j) {
						if(ans[i]==ans[j]) check++;
					}
				}
				if(check==0) ans[i] = '!';
			}
		}
		for(char a : ans) {
			System.out.print(a);
		}
		sc.close();
	}
}
