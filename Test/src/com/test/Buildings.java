package com.test;

import java.util.ArrayList;

public class Buildings
{
	String nameOfBuilding;
	String placeOfBuilding;
	int numOfInhabitants;
	public Buildings(String nameOfBuilding, String placeOfBuilding, int numOfInhabitants) {
		super();
		this.nameOfBuilding = nameOfBuilding;
		this.placeOfBuilding = placeOfBuilding;
		this.numOfInhabitants = numOfInhabitants;
	}
	
}

abstract class Abcde{
	
	ArrayList<Buildings> buildings= new ArrayList<>();

	public Abcde(ArrayList<Buildings> buildings) {
		super();
		this.buildings = buildings;
	}
	public abstract int countAllInhabitants();
}
class Concrete extends Abcde
{
	static int numOfInhabitants;

	public Concrete(ArrayList<Buildings> buildings) {
		super(buildings);
		
	}

	
	public int countAllInhabitants()
	{
		return numOfInhabitants;
	}
	
}
