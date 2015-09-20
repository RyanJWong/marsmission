package marsmission;

public class SpacecraftModel {
	/*
	 * Class Instance Variable
	 */
	private int							maxSpeed;
	private CrewModuleModel				crewModule;
	private LaunchAbortSystemModel 		launchAbortSystemModel;
	
	/*
	 * Class Constants
	 */

	/*
	 * Constructors
	 */
	
	public SpacecraftModel(int maxSpeed, CrewModuleModel crewModule, LaunchAbortSystemModel launchAbortSystemModel){
		this.maxSpeed 				= maxSpeed;
		this.crewModule				= crewModule;
		this.launchAbortSystemModel = launchAbortSystemModel;
		
	}
	
}

