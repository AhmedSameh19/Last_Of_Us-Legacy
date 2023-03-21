package model.characters;

import java.util.ArrayList;

import model.collectibles.*;


public abstract class Hero extends Character {
	private int actionsAvailable;
	private int maxActions;
	private boolean specialAction;
	private ArrayList<Vaccine> vaccineInventory;
	private ArrayList<Supply> supplyInventory;

	public Hero(String name, int maxHp, int attackDmg, int maxActions) {
		super(name, maxHp, attackDmg);
		this.maxActions = maxActions;
		this.vaccineInventory=new ArrayList<Vaccine>();
		this.supplyInventory=new ArrayList<Supply>();
		this.actionsAvailable=maxActions;
	}

	public int getActionsAvailable() {
		return actionsAvailable;
	}

	public int getMaxActions() {
		return maxActions;
	}

	public boolean isSpecialAction() {
		return specialAction;
	}

	public ArrayList<Vaccine> getVaccineInventory() {
		return vaccineInventory;
	}

	public ArrayList<Supply> getSupplyInventory() {
		return supplyInventory;
	}

	public void setActionsAvailable(int actionsAvailable) {
		this.actionsAvailable = actionsAvailable;
	}

	public void setSpecialAction(boolean specialAction) {
		this.specialAction = specialAction;
	}

}
