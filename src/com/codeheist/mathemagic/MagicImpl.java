package com.codeheist.mathemagic;

import java.util.*;

public class MagicImpl implements Magic {
	private void magicOne() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Think one number");
		System.out.println("Multiply by 2");
		System.out.println("Add 2");
		System.out.println("Multiply by 5");
		System.out.println("Add 5");
		System.out.println("Tell answer: ");
		int ans = scan.nextInt();

		System.out.println("Number is: " + ((((ans - 5) / 5) - 2) / 2));
		scan.close();
	}

	private void magicTwo() {
		System.out.println("Think one number");
		System.out.println("Double it");
		System.out.println("Add 15");
		System.out.println("Triple it");
		System.out.println("Add 33");
		System.out.println("Divide by 6");
		System.out.println("Subtract the original number");

		System.out.println("Number with you is : " + 13);
	}

	private void magicThree() {
		System.out.println("Think one number");
		System.out.println("Take same number from your friend and add them together");
		int num = (int) Math.random() * 100;
		System.out.println("Then add " + num);
		System.out.println("Give back your friend's number");

		System.out.println("Number is: " + ((int) num / 2));
	}

	private void magicFour() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Think a 3-digit number such that all three digits are different from each other");
		System.out.println("Reverse it");
		System.out.println("Subtract them from each other");
		System.out.println("Tell either of the first or last digit:");
		int ans = scan.nextInt();
		System.out.println("Is it first digit (Y/N)?");
		char first = scan.next().charAt(0);

		int result; 
		if(first == 'Y') {
			result = ans;
			result = result*10+9;
			result = result*10+(9-ans);
		} else {
			result = 9-ans;
			result = result*10+9;
			result = result*10+ans;
		}
		System.out.println("Number is: " + result);
		scan.close();
	}

	private void magicFive() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Think one number");
		System.out.println("Multiply by 2");
		System.out.println("Add 2");
		System.out.println("Multiply by 5");
		System.out.println("Add 5");
		System.out.println("Tell answer: ");
		int ans = scan.nextInt();

		System.out.println("Number is: " + ((((ans - 5) / 5) - 2) / 2));
		scan.close();
	}

	private void magicSix() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Think one number");
		System.out.println("Multiply by 2");
		System.out.println("Add 2");
		System.out.println("Multiply by 5");
		System.out.println("Add 5");
		System.out.println("Tell answer: ");
		int ans = scan.nextInt();

		System.out.println("Number is: " + ((((ans - 5) / 5) - 2) / 2));
		scan.close();
	}

	public void showMagic() {
		Scanner scan = new Scanner(System.in);

		int magic = 0;
		char ch;

		do {
			System.out.println("Do you want to see magic (y/n)?");
			ch = scan.next().charAt(0);
			System.out.println("Pick trick from 1 to 9");
			magic = scan.nextInt();

			switch (magic) {
							case 1: magicOne();
							break;
							case 2: magicTwo();
							break;
							case 3: magicThree();
							break;
							case 4: magicFour();
							break;
							case 5: magicFive();
							break;
							case 6: magicSix();
							default: System.out.println("Sorry incorrect choice!!");
			}
		} while (ch == 'y');

		scan.close();
	}
}
