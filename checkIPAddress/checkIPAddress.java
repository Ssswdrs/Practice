package checkIPAddress;
/* 
LANG: JAVA 
COMPILER: JAVA 
*/
import java.util.Scanner;
public class checkIPAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		int cnt = 0;
		String[] iplist = ip.split("\\.");//*********
		if(iplist.length != 4) {
			System.out.println("IP " + ip + " is Not Valid");
		}else {
			for(int i=0;i<iplist.length;i++) {
				try {
					if(0 <= Integer.valueOf(iplist[i]) && 255 >= Integer.valueOf(iplist[i])) {
						cnt++;
					}else break;
				}catch(NumberFormatException e){
					System.out.println("IP " + ip + " is Not Valid");
				}
			}
		}
		if(cnt == iplist.length) {
			System.out.println("IP " + ip + " is Valid");
		}
		sc.close();
	}

}
