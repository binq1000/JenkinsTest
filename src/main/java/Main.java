package main.java;

import TestPackage.NumberGenerator;



/**
 * Created by Nekkyou on 24-2-2017.
 */

public class Main {
	public static void main(String [ ] args)
	{
		NumberGenerator ng = new NumberGenerator();
		int one = ng.GetOne();
		if (one == 1) {
			System.out.println("Succeed");
		}
	}
}
