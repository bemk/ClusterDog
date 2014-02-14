package eu.orionos.ClusterDog;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class DogPool {

	private String authKey = "AuthKey";
	private ArrayList<Dog> dogs = new ArrayList<Dog>();
	private Dog master = null;

	public DogPool()
	{

	}

	/**
	 * Probe all the IP's in the range specified for new nodes
	 * Should work on IPv4 and IPv6
	 * Adds new nodes to the list of "dogs"
	 */
	public void probe()
	{
		if (master != null)
			master.probe();
	}

	private boolean electMaster()
	{


		return true;
	}

	private boolean probeMaster()
	{
		return false;
	}

	private void register()
	{

	}

	public ArrayList<Dog> getDogs()
	{
		return dogs;
	}
}
