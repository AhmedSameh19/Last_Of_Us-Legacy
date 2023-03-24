package engine;

import java.io.*;
import java.util.ArrayList;
import model.characters.*;
import model.world.Cell;

public class Game {
	public static ArrayList<Hero> availableHeroes;
	public static ArrayList<Hero> heroes;
	public static ArrayList<Zombie> zombies;
	public static Cell[][] map=new Cell[15][15];

	public static void loadHeroes(String filePath) throws Exception {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String x = br.readLine();
			availableHeroes = new ArrayList<Hero>(10);
			while (x != null) {
				String[] parts = x.split(",");
				String name = parts[0];
				int maxHp = Integer.parseInt(parts[2]);
				int maxActions = Integer.parseInt(parts[3]);
				int attackDmg = Integer.parseInt(parts[4]);
				Hero H = null;
				if (parts[1].equals("FIGH"))
					H = new Fighter(name, maxHp, attackDmg, maxActions);
				else if (parts[1].equals("MED"))
					H = new Medic(name, maxHp, attackDmg, maxActions);
				else
					H = new Explorer(name, maxHp, attackDmg, maxActions);
				availableHeroes.add(H);
				x = br.readLine();

			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
