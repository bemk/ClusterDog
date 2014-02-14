package eu.orionos.ClusterDog;

import eu.orionos.ClusterDog.config.ConfigFile;

public class ClusterDog {
	
	private static DogPool pool;
	private static ConfigFile config;
	
	public ClusterDog()
	{
		System.out.printf("Hello world!\n");
	}
	
	public static void main(String argv[])
	{
		
		pool = new DogPool();
		
		new ClusterDog();
	}
}
