package Parity;
import java.util.Scanner;
public class Parity {

	public static String conv(int sum, int opt) {
		if(opt == 0) {
			return (sum%2==0)?"1":"0"; 
		}
		else if(opt == 1) {
			return (sum%2==0)?"0":"1"; 
		}
		else return "-";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int opt = sc.nextInt(),bit = sc.nextInt(),size = s.length(),cnt = 0,mem = 0;
		int[] sumrow = new int[(size/bit)+1], sumcol = new int[bit+1];
		String row = "",col = "";
		for(int i=0;i<size;i++) {
			sumrow[mem] += Character.getNumericValue(s.charAt(i));
			cnt++;
			if(cnt == bit) {
				cnt = 0;
				mem++;
			}
		}
		mem = 0;
		for(int j=0;j<bit;j++) {
			for(int i=j;i<size;i+=bit) {
				sumcol[mem] += Character.getNumericValue(s.charAt(i));
			}
			mem++;
		}
		int lastrow = 0,lastcol = 0; 
		for(int i=0;i<sumrow.length-1;i++) {
			row = row + conv(sumrow[i],opt);
			lastrow += sumrow[i];
		}
		row = row + conv(lastrow,opt);
		for(int i=0;i<sumcol.length-1;i++) {
			col = col + conv(sumcol[i],opt);
			lastcol += sumcol[i];
		}
		col = col + conv(lastcol,opt);
		System.out.println(row);
		System.out.println(col);
		sc.close();
	}

}
