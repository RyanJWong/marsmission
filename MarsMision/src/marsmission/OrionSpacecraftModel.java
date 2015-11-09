package marsmission;

public class OrionSpacecraftModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	
	/*
	 * Class Constants
	 * 
	 */
	private OrionModel 		 orion;
	private SpacecraftModel spacecraft;

	/*
	 * Construcutors
	 * 
	 */
	public OrionSpacecraftModel() {
		orion		= new OrionModel();
		spacecraft	= new SpacecraftModel(orion);
		spacecraft.addEngine(new MainEngineModel(EngineModel.MAIN_ENGINE, SLSEngineModel.MAIN_ENGINE, SLSEngineModel.ORGANIZATION));
		spacecraft.addEngine(new MainEngineModel(EngineModel.BOOSTER_ENGINE, SLSEngineModel.MAIN_ENGINE, SLSEngineModel.ORGANIZATION));
		spacecraft.addEngine(new MainEngineModel(EngineModel.BOOSTER_ENGINE, SLSEngineModel.MAIN_ENGINE, SLSEngineModel.ORGANIZATION));
		spacecraft.addEngine(new MainEngineModel(EngineModel.STAGE3_ENGINE, SLSICPSEngineModel.ICPS_ENGINE, SLSEngineModel.ORGANIZATION));
	}
	//Launch
	public boolean launch(){
	
		return spacecraft.launch();
	}

}
