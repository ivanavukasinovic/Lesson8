package exercises;

import java.util.ArrayList;
import java.util.List;

public class Plane {

	public void addSnakes(List<Snake> snakes) {
		SnakeFactory.getSnakes();
	}

	public int getNumberOfVenomousSnakes() {

		List<Snake> venomousSnake = new ArrayList<Snake>();
		List<Snake> unvenomousSnake = new ArrayList<Snake>();

		for (Snake snake : SnakeFactory.getSnakes()) {
			if (snake.isVenomous()) {
				venomousSnake.add(snake);
			} else {
				unvenomousSnake.add(snake);
			}
		}

		System.out.println("Venomous snakes: " + venomousSnake.size());
		System.out.println("Unvenomous snakes: " + unvenomousSnake.size());
		return venomousSnake.size();
	}

}
