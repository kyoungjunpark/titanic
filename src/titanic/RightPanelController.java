package titanic;


public class RightPanelController extends CenterPanelController {
// 없앨 예정
	private RightPanel rightPanel;
	private DependencyTable table;
	
	RightPanelController() {
	}

	RightPanelController(RightPanel rightPanel) {
		this.rightPanel = rightPanel;
	}
	/*
	protected void redrawPanel(){
		this.rightPanel.redrawPanel();
	}
	*/
	protected int getID(){
		return this.rightPanel.getID();
	}

}
