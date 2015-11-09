package unittests;

import marsmission.BARModel;
import marsmission.OrionSpacecraftModel;
import marsmission.SpacecraftModel;

public class TestSpacecraftModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	private SpacecraftModel spaceshipModel;
	private BARModel 		bar;
	
	/*
	 * Class Constants
	 * 
	 */
	
	/*
	 * Construcutors
	 * 
	 */
	public TestSpacecraftModel(SpacecraftModel spaceshipModel) {
		this.spaceshipModel=spaceshipModel;
	}
	
	//main
	
	public static void main(String[] args){
		OrionSpacecraftModel orion	= new OrionSpacecraftModel();
		if (orion.launch()){
			System.out.println("Orion test completed!");
			System.out.println("Go fall in a hole.");
			System.out.println("Play TNE.");
			System.out.println("This is a game.");
		} else{
			System.out.println("Orion test scrubbed!");

		}
		System.out.println("Spacecraft test completed!");



	}
	/*
	 * Launch
	 */
	
		public boolean launch(){
			boolean launched = false;
			
			return launched;
		}
	

}
