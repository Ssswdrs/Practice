package ViralAdvertising;

import java.util.Scanner;

public class ViralAdvertising {

	public static int fav(int f,int d,int s) {
		if(d == 0) return s; 
		f = f/2;
		s += f;
		f *= 3;
		d--;
		return fav(f,d,s);
	}
	
	public static int ads(int f,int d,int s) {
		if(d == 0) return s;
		s += f;
		f = f/2;
		f *= 3;
		d--;
		return ads(f,d,s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		int fav = fav(n,d,0), see = ads(n,d,0);
		System.out.println("Favorite ads : "+fav);
		System.out.println("Received ads : "+see);
		sc.close();
	}

}
