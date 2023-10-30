package FabricPattern;

import java.util.Scanner;
//*********
public class FabricPattern {

	public static String yep(int i) {
		return switch(i) {
		case 1 -> "*++*";
		case 2 -> "+X*X";
		case 3 -> "+*+";
		case 4 -> "++";
		case 5 -> "X+*";
		default -> "O";
		};
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), k = sc.nextInt();
		int length = 4*k;
		String[] fabric = new String[N];
		for(int i=0;i<N;i++) {
			fabric[i] = "";
		}
		int opt,temp,h = 0,l = 0,a = 0,th = 0,tl = 0,ta = 0;
		boolean ftimeh = true,ftimel = true,ftimea = true;
		for(int i=0;i<N;i++) {
			for(int j=0;j<k;j++) {
				opt = sc.nextInt();
				fabric[i] = fabric[i] + yep(opt);
			}
		}
		for(int i=0;i<N;i++) {
			temp = (length)-fabric[i].length();
			for(int j=0;j<temp;j++) {
				fabric[i] += yep(0);
			}
		}
		for(int i=0;i<length;i++) {
			h = 0; l = 0; a = 0;
			ftimeh = true;ftimel = true;ftimea = true;
			for(int j=0;j<N-1;j++) {
				if(String.valueOf(fabric[j].charAt(i)).equals("+")) th = 1;
				if(String.valueOf(fabric[j].charAt(i)).equals("X")) tl = 1;
				if(String.valueOf(fabric[j].charAt(i)).equals("*")) ta = 1;
			}
		}
		for(int i=0;i<length;i++) {
			h = 0; l = 0; a = 0;
			for(int j=0;j<N-1;j++) {
				if(String.valueOf(fabric[j].charAt(i)).equals("+")&&String.valueOf(fabric[j+1].charAt(i)).equals("+")) {
					if(ftimeh) {
						h += 2;
						ftimeh = false;
					}else h++;
					if(th < h) {
						th = h;
					}
				}else {
					h = 0;
					ftimeh = true;
				}
				if(String.valueOf(fabric[j].charAt(i)).equals("X")&&String.valueOf(fabric[j+1].charAt(i)).equals("X")) {
					if(ftimel) {
						l += 2;
						ftimel = false;
					}else l++;
					if(tl < l) {
						tl = l;
					}
				}else {
					l = 0;
					ftimel = true;
				}
				if(String.valueOf(fabric[j].charAt(i)).equals("*") && String.valueOf(fabric[j+1].charAt(i)).equals("*")) {
					if(ftimea) {
						a += 2;
						ftimea = false;
					}else a++;
					if(ta < a) {
						ta = a;
					}
				}else {
					a = 0;
					ftimea = true;
				}
			}
		}
		System.out.println(th + " " + tl + " " + ta);
		sc.close();
	}
}
