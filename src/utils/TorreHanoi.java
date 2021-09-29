package utils;

public class TorreHanoi {
	
	public static void moveDisc(int qtd_disc, char sourceTower, char auxTower, char targetTower) {
		
		if (qtd_disc == 1) {
			System.out.println("mover disco 1 da torre " + sourceTower + " para torre " + targetTower );
			return;
		}
		moveDisc(qtd_disc -1, sourceTower, targetTower , auxTower); // n-1 discos da origem para o auxiliar
		System.out.println("Mover disco " + qtd_disc + " da torre " + sourceTower + " para torre " + targetTower);
		moveDisc(qtd_disc-1, auxTower, sourceTower, targetTower);
	}
}
