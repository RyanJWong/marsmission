package marsmission;

import java.util.LinkedList;
import java.util.List;

public class SpacecraftModel {
	private PayloadModel		payload;
	private List<EngineModel>   engines;
	
	
	public SpacecraftModel(PayloadModel payload) {
		this.payload = payload;
		
		engines = new LinkedList<EngineModel>();
	}
	
	public void addEngine(EngineModel engine){
		engines.add(engine);
	}
	/*
	 * Launch
	 * 
	 */
	public boolean launch(){
		boolean launched = false;
		for (int index = 0; index < engines.size(); index++){
			if(engines.get(index).getType() == EngineModel.MAIN_ENGINE)
			{
				launched = engines.get(index).ignition();
				break;
			}
		}
		return launched;
	}

}
