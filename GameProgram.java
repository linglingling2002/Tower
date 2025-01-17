package gameClass;

public class GameProgram {
	public static double distance(int x1, int y1, int x2, int y2) {
		int x_dist = x2 - x1;
		int y_dist = y2 - y1;
		double sum = Math.pow(x_dist, 2) + Math.pow(y_dist, 2);
		return Math.sqrt(sum);
	}

	public static void printGame(Tower tower, Monster monster, int basex) {
		System.out.print("怪物血量：" + monster.getHealthPoint());
		for (int i = 10; i < tower.getX() - 1; i++) {
			System.out.print(" ");
		}
		System.out.print("塔");
		for (int i = tower.getX(); i < 100; i++) {
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < basex - 2; i++) {
			System.out.print(" ");
		}
		System.out.print("基地");
		for (int i = basex + 1; i < monster.getX() - 1; i++) {
			System.out.print(" ");
		}
		System.out.print("怪");
		for (int i = monster.getX(); i < 100; i++) {
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int baseHp = 10;
		int baseX = 5;
		int monsterTimer = 0;
		int towerTimer = 0;

		Tower arrowTower = new Tower();
		arrowTower.setAttackSpeed(200);
		arrowTower.setAttackValue(5);
		arrowTower.setRange(30);
		arrowTower.setX(50);
		arrowTower.setY(55);

		Monster treeMonster = new Monster();
		treeMonster.setAlive(true);
		treeMonster.setAttackPoint(10);
		treeMonster.setHealthPoint(200);
		treeMonster.setMoveSpeed(100);
		treeMonster.setX(95);
		treeMonster.setY(50);

		while (baseHp > 0 && treeMonster.getHealthPoint() > 0) {
			if (monsterTimer < 1000) {
				monsterTimer += treeMonster.getMoveSpeed();
			}
			else {
				treeMonster.setX(treeMonster.getX() - 1);
				monsterTimer = 0;
			}
			if (distance(arrowTower.getX(), arrowTower.getY(), treeMonster.getX(), treeMonster.getY()) < arrowTower
					.getRange() && treeMonster.isAlive()) {
				if (towerTimer < 1000) {
					towerTimer += arrowTower.getAttackSpeed();
				}
				else {
					treeMonster.setHealthPoint(treeMonster.getHealthPoint() - arrowTower.getAttackValue());
					towerTimer = 0;
				}
			}
			if (treeMonster.getHealthPoint() <= 0) {
				treeMonster.setAlive(false);
			}
			if (treeMonster.getX() <= baseX) {
				baseHp -= treeMonster.getAttackPoint();
			}

			printGame(arrowTower, treeMonster, baseX);
			if (baseHp <= 0) {
				System.out.println("Failed!");
			}
			else if (treeMonster.getHealthPoint() <= 0) {
				System.out.println("Succeed!");
			}
			
			try {
				Thread.sleep(50);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
