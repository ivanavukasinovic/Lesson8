package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeFactory extends Snake {

	private static List<Snake> snakes = new ArrayList<Snake>();

	public SnakeFactory(boolean venomous) {
		super(venomous);
		for (int i = 0; i < this.snakes.size(); i++) {
			this.snakes.add(new Snake(venomous));
		}
	}

	public static List<Snake> getSnakes() {
		return snakes;
	}

	public void setSnakes(List<Snake> snakes) {
		this.snakes = snakes;
	}

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {

		for (int i = 0; i < 20; i++) {
			boolean venomous = new Random().nextBoolean();
			System.out.println(venomous);
			snakes.add(new Snake(venomous));
		}

		System.out.println("Total number of snakes: " + snakes.size());
		return snakes;
	}

}
