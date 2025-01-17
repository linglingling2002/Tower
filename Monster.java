package gameClass;

public class Monster {

	/** 是否存活 */
	private boolean isAlive;

	/** 血量 */
	private int healthPoint;

	/** 移动速度 */
	private int moveSpeed;

	/** 伤害值 */
	private int attackPoint;

	/** 横坐标 */
	private int x;

	/** 纵坐标 */
	private int y;

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * @return the healthPoint
	 */
	public int getHealthPoint() {
		return healthPoint;
	}

	/**
	 * @param healthPoint the healthPoint to set
	 */
	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	/**
	 * @return the moveSpeed
	 */
	public int getMoveSpeed() {
		return moveSpeed;
	}

	/**
	 * @param moveSpeed the moveSpeed to set
	 */
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	/**
	 * @return the attackPoint
	 */
	public int getAttackPoint() {
		return attackPoint;
	}

	/**
	 * @param attackPoint the attackPoint to set
	 */
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

}
