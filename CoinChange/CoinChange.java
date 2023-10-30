package CoinChange;

import java.util.Scanner;
//**********
public class CoinChange {
//hard
	public static int minCoins(int coins[], int m, int V)
    {
        // table[i] will be storing
        // the minimum number of coins
        // required for i value. So
        // table[V] will have result
        int table[] = new int[V + 1];
 
        // Base case (If given value V is 0)
        table[0] = 0;
 
        // Initialize all table values as Infinite
        for (int i = 1; i <= V; i++) table[i] = Integer.MAX_VALUE;
 
        // Compute minimum coins required for all
        // values from 1 to V
        for (int i = 1; i <= V; i++)
        {
            // Go through all coins smaller than i
//        	System.out.println(i+"**");
            for (int j = 0; j < m; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) {
//                	System.out.println(i+","+coins[j]+" : "+(sub_res+1)+" - "+table[i]+"..."+i);
                	table[i] = sub_res + 1; 
                }
//               else System.out.println("//"+coins[j]);
            }
        }
//        for(int i=0;i<=V;i++) {
//        	System.out.print(table[i]+" : ");
//        }
        if(table[V]==Integer.MAX_VALUE) return -1;
       
        return table[V];
         
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), n = sc.nextInt();
		int[] eachcoin = new int[n];
		int temp;
		for(int i=0;i<n;i++) {
			eachcoin[i] = sc.nextInt();
		}

		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(eachcoin[j+1]>eachcoin[j]) {
					temp = eachcoin[j];
					eachcoin[j] = eachcoin[j+1];
					eachcoin[j+1] = temp;
				}
			}
		}
		System.out.println(minCoins(eachcoin, n, A));
		sc.close();
	}

}
