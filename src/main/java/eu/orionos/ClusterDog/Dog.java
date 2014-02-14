package eu.orionos.ClusterDog;

import java.util.ArrayList;

public class Dog {
	ArrayList<Dog> dogs;

	public Dog()
	{
		dogs = new ArrayList<Dog>();
		dogs.add(this);
	}

	public ArrayList<Dog> probe()
	{
		return dogs;
	}
}
