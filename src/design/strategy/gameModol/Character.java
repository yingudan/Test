package design.strategy.gameModol;

public abstract class Character {
	void move() {
		System.err.println("move");
	}

	void attack() {
		System.err.println("attack");
	}

	abstract void display();
}
