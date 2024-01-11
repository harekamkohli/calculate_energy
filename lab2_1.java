// Harekam Kohli
// SBU ID- 115148763
// CSE-114

import java.util.Scanner;
public class lab2_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Q, M, IT, FT;
		Scanner input= new Scanner(System.in);
		System.out.print("M-enter the weight of water in kilograms");
		M=input.nextDouble();
		System.out.print("Q-enter the energy in joules");
		IT= input.nextDouble();
		System.out.print("FT-enter the final temperature");
		FT= input.nextDouble();
		Q=M*(FT-IT)*4184;
		System.out.println("the energy needed is" + Q);
	}

}

