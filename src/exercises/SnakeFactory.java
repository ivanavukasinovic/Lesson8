package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeFactory extends Snake {

	public SnakeFactory(boolean venomous) {
		super(venomous);
	}

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {
		List<Snake> snakes = new ArrayList<Snake>();

		for (int i = 0; i < 3; i++) {
			boolean venomous = new Random().nextBoolean();
			System.out.println(venomous);
			snakes.add(new Snake(venomous));
		}

		System.out.println("Total number of snakes: " + snakes.size());
		return snakes;
	}

}
