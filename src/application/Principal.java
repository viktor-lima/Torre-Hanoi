package application;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int disc;
		System.out.println("TORRE DE HANOI");
		System.out.println("Digite a quantidade de discos: ");
		Scanner sc = new Scanner(System.in);
		disc = sc.nextInt();
		utils.TorreHanoi.moveDisc(disc, 'A', 'B', 'C');
	}
}
