package marsmission;

public class PayloadModel {
	/*
	 * Class Instance Variable
	 */
	private LaunchAbortSystemModel 		launchAbortSystemModel;
	private CrewModuleModel				crewModule;
	private SLSEngineModel			serviceModule;
	private ServiceModulePanelsModel    serviceModulePanels;
	private SpacecraftAdapterModel		spacecraftAdapter;
	/*
	 * Class Constants
	 */
	
	
	
	/*
	 * Constructors
	 */
	
	public PayloadModel(LaunchAbortSystemModel launchAbortSystemModel, CrewModuleModel crewModule, SLSEngineModel serviceModule, ServiceModulePanelsModel serviceModulePanels, SpacecraftAdapterModel spacecraftAdapter){
		this.launchAbortSystemModel 		= launchAbortSystemModel;
		this.crewModule						= crewModule;
		this.serviceModule					= serviceModule;
		this.serviceModulePanels			= serviceModulePanels;
		this.spacecraftAdapter 	  		 	= spacecraftAdapter;
		

		
	}
	
}
