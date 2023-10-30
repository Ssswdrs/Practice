package Grading;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Grading {

	public static class student{
		public String D;
		public int M;
		public int F;
		public double X;
	}
	public static class Sort implements Comparator<student>{
		public int compare(student a,student b) {
			return Double.compare(b.X, a.X);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<student> al = new ArrayList<student>();
		student stu;
		sc.nextLine();
		for(int i=0;i<N;i++) {
			stu = new student();
			stu.D = sc.next();
			stu.M = sc.nextInt();
			stu.F =sc.nextInt();
			int fid = Integer.parseInt((stu.D).substring(0,2));
			int mid = Integer.parseInt((stu.D).substring(2,3));
			int sid = Integer.parseInt((stu.D).substring(3,4));
			if(!((sid<1||sid>8)||(fid<55||fid>61)||((stu.M)<0||(stu.M)>100)||((stu.F)<0||(stu.F)>100)||(mid!=0))) {
				al.add(stu);
			}
		}
		//6409682884
		double sumM = 0,sumF=0;
		for(student a : al) {
			sumM=0;
			sumF=0;
			sumM+=(a.M*0.35);
			sumF+=(a.F*0.65);
			a.X = sumM+sumF;
		}
		sumM=0;
		sumF=0;
		for(student a : al) {
			sumM+=(a.M*0.35);
			sumF+=(a.F*0.65);
		}
		double avg = 0.0;
		if(al.size()==0) {
			System.out.format("%.2f",avg);
			sc.close();
			return;
		}
		else avg = (sumM+sumF)/al.size();
		
		System.out.format("%2.2f\n",avg);
		
		Collections.sort(al, new Sort());
		if(avg >= 55&&avg<=100){
			int sumX = 0;
			for(student a : al) {
				if(a.X-avg > 15) {
					System.out.format("%s %2.2f A\n",a.D,a.X);
				}
				else if(5 < a.X -avg&& a.X -avg <=15) {
					System.out.format("%s %2.2f B\n",a.D,a.X);
				}
				else if(0 <= a.X -avg && a.X -avg <=5) {
					System.out.format("%s %2.2f C\n",a.D,a.X);
				}
				else if(0 < avg-a.X && avg-a.X <=10) {
					System.out.format("%s %2.2f D\n",a.D,a.X);
				}
				else if((avg)-a.X>10) {
					System.out.format("%s %2.2f F\n",a.D,a.X);
				}
			}
		}
		else if(avg <55 && avg >=0) {
			int sumX=0;
			for(student a : al) {
				if(a.X>= 85) {
					System.out.format("%s %2.2f A\n",a.D,a.X);
				}
				else if(70 <= (a.X) && (a.X) <=85) {
					System.out.format("%s %2.2f B\n",a.D,a.X);
				}
				else if(60 <= (a.X) && (a.X) <70) {
					System.out.format("%s %2.2f C\n",a.D,a.X);
				}
				else if(50 <= (a.X) && (a.X) <60) {
					System.out.format("%s %2.2f D\n",a.D,a.X);
				}
				else if(a.X<50) {
					System.out.format("%s %2.2f F\n",a.D,a.X);
				}
			}
		}
		
		sc.close();
	}

}
