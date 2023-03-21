package engine;

import java.io.*;
import java.util.ArrayList;

import model.characters.*;
import model.world.Cell;

public class Game {
	public static ArrayList<Hero> availableHeroes;
	public static ArrayList<Hero> heroes;
	public static ArrayList<Zombie> zombies;
	public static Cell[][] map;

	public Game() {
		map=new Cell[15][15];
	}

	public static void loadHeroes(String filePath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = br.readLine();
			 availableHeroes = new ArrayList<Hero>();
			while (line != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				int maxHp = Integer.parseInt(parts[2]);
				int maxActions = Integer.parseInt(parts[3]);
				int attackDmg = Integer.parseInt(parts[4]);
				Hero H=null;
				if (parts[1] .equals("FIGH") )
					H=new Fighter(name, maxHp, attackDmg, maxActions);
				else if (parts[1] .equals( "MED"))
					H=new Medic(name, maxHp, attackDmg, maxActions);
				else
					H=new Explorer(name, maxHp, attackDmg, maxActions);
				availableHeroes.add(H);
				line=br.readLine();

			}
			br.close();
		} catch (IOException e) {
			System.out.println("Can't reach the file");
		}
	}



}
