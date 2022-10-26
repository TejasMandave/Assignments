package com.tejas;

public class Ineuron {

	public static void main(String[] args) {

		int n = 10;

		for (int i = 0; i < n; i++) {

			//Letter I
			for (int j = 0; j < n; j++) {
				if ((j == n / 2 && i != 0) || (i == 1 && i != 0) || (i == n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			//Letter N
			for (int j = 0; j < n; j++) {

				if ((j == 1 || j == n - 1) && (i > 0) || (i == j && i > 0 && j > 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			//Letter E
			for (int j = 0; j < n; j++) {

				if ((j == 1 && i != 0 && i < n - 1 && j < n - 1) || (i == 1 && j > 0 && j < n - 1)
						|| (i == n / 2 && j > 0 && j < n - 3) || (i == n - 1 && j > 0 && j < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			//Letter U
			for (int j = 0; j < n; j++) {

				if ((j == 1 && i > 0) || (i == n - 1 && j > 0) || (j == n - 1 && i > 0 && i < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			//Letter R
			for (int j = 0; j < n; j++) {

				if ((j == 1 && i > 0) || (i == 1 && j > 0) || (j < n - 1 && j > 0 && i == n / 2)
						|| (j == n - 1 && i < n / 2 && i > 0) || (i > n / 2 && j == i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			//Letter O
			for (int j = 0; j < n; j++) {

				if ((i == 1 || j == 1 || i == n - 1 || j == n - 1) && (i != 0 && j != 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			//Letter N
			for (int j = 0; j < n; j++) {

				if ((j == 1 || j == n - 1) && (i > 0) || (i == j && i > 0 && j > 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
