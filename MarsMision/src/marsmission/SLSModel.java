package marsmission;

public class SLSModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	SRBModel[]			solidFuelRockets; //stage 2
	MainEngineModel		mainEngine; //stage 1
	ICPSModel			icps; //stage 3
	/*
	 * Class Constants
	 * 
	 */
	public static final int SRB_ENGINES = 2;
	
	/*
	 * Construcutors
	 * 
	 */
	
	public SLSModel()
	{
		solidFuelRockets = new SRBModel[SRB_ENGINES];
		
		for(int index=0; index < SRB_ENGINES; index++){
			solidFuelRockets[index] = new SRBModel();
		}
		
		mainEngine = new MainEngineModel();
		icps	   = new ICPSModel();
	}
}
