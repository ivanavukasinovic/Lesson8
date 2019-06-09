package optional;

import java.util.ArrayList;

public class DirtyWorms {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		/* TODO: Clean out the dirt but keep the delicious worms. */

		for (int i = stuffIFoundInTheYard.size() - 1; i >= 0; i--) {
			if (stuffIFoundInTheYard.get(i).getClass().getSimpleName().equals("Dirt")) {
				stuffIFoundInTheYard.remove(i);
				System.out.println("Dirt found and removed.");
			} else {
				System.out.println("This is a worm.");
			}
		}

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

	}
}
