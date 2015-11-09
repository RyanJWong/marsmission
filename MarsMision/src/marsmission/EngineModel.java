package marsmission;

public class EngineModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	private int 	type;
	private String	model;
	private String  organization;
	
	/*
	 * Class Constants
	 * 
	 */
	public static final int BOOSTER_ENGINE  = 1;
	public static final int MAIN_ENGINE 	= 2;
	public static final int STAGE3_ENGINE   = 3;

	public static final String[] ENGINE_TYPES = {"Booster Engine","Main Engine", "Stage 3 Engine"};
	//Getters

	public int getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public String getOrganization() {
		return organization;
	}
	
	/*
	 * Construcutors
	 * 
	 */
	
	public EngineModel(int type, String model, String  organization)
	{
		this.type		  = type;
		this.model		  = model;
		this.organization = organization;
		
	}
	/*
	 * Ignition
	 */
	public boolean ignition(){
		boolean ignited = false;
		System.out.println(ENGINE_TYPES[type-1]+" ignition...");
		return ignited;
	}



}
