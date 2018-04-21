package client.controller;

import client.view.AffectiveColorView;
import client.view.AffectiveGraphView;
import client.view.AffectiveView;
import client.view.ClientMainView;
import client.view.ExpressiveFaceView;
import client.view.ExpressiveGraphView;
import client.view.ExpressiveView;
import client.view.MenuBarView;

/**
 * The ClientMainController class handles web socket connection between the
 * client and the server.
 * 
 * @author Team06
 * @version 1.0
 */
public class ClientMainController implements ControllerInterface {

	/**
	 * Starting point of client
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		ClientMainController clientMainController = new ClientMainController();
		clientMainController.initialize();
	}

	@Override
	public void initialize() {
		// initializeViews();
		initializeControllers();
	}

	private void initializeControllers() {
		MenuBarView menuBarView = new MenuBarView();
		AffectiveColorView affectiveColorView = new AffectiveColorView();
		AffectiveGraphView affectiveGraphView = new AffectiveGraphView();
		AffectiveView affectiveView = new AffectiveView(affectiveColorView, affectiveGraphView);
		ExpressiveFaceView expressiveFaceView = new ExpressiveFaceView();
		ExpressiveGraphView expressiveGraphView = new ExpressiveGraphView();
		ExpressiveView effectiveView = new ExpressiveView(expressiveFaceView, expressiveGraphView);
		ClientMainView clientMainView = new ClientMainView(affectiveView, effectiveView, menuBarView);
		AffectiveColorController affectiveColorContoller = new AffectiveColorController(affectiveColorView);
		AffectiveGraphController affectiveGraphContoller = new AffectiveGraphController();
		AffectiveContoller affectiveContoller = new AffectiveContoller(affectiveColorContoller,
				affectiveGraphContoller);
		ExpressiveFaceController expressiveFaceContoller = new ExpressiveFaceController();
		ExpressiveGraphController expressiveGraphContoller = new ExpressiveGraphController();
		ExpressiveController effectiveContoller = new ExpressiveController(expressiveFaceContoller,
				expressiveGraphContoller);
	}

	/*
	 * private void initializeViews() { MenuBarView menuBarView = new MenuBarView();
	 * AffectiveColorView affectiveColorView = new AffectiveColorView();
	 * AffectiveGraphView affectiveGraphView = new AffectiveGraphView();
	 * AffectiveView affectiveView = new AffectiveView(affectiveColorView,
	 * affectiveGraphView); ExpressiveFaceView expressiveFaceView = new
	 * ExpressiveFaceView(); ExpressiveGraphView expressiveGraphView = new
	 * ExpressiveGraphView(); ExpressiveView effectiveView = new
	 * ExpressiveView(expressiveFaceView, expressiveGraphView); ClientMainView
	 * clientMainView = new ClientMainView(affectiveView, effectiveView,
	 * menuBarView); }
	 */
}