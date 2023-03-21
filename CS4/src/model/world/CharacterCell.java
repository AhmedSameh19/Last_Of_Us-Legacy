package model.world;

import model.characters.Character;

public class CharacterCell extends Cell {
	public CharacterCell(Character character) {
		super();
		this.character = character;
	}

	private Character character;
	private boolean isSafe;
	
	public Character getCharacter() {
		return character;
	}

	public boolean isSafe() {
		return isSafe;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
}
