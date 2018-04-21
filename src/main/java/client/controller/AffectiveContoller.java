package client.controller;

public class AffectiveContoller {
	AffectiveColorController affectiveColorContoller;
	AffectiveGraphController affectiveGraphContoller;

	public AffectiveColorController getAffectiveColorContoller() {
		return affectiveColorContoller;
	}

	public void setAffectiveColorContoller(AffectiveColorController affectiveColorContoller) {
		this.affectiveColorContoller = affectiveColorContoller;
	}

	public AffectiveGraphController getAffectiveGraphContoller() {
		return affectiveGraphContoller;
	}

	public void setAffectiveGraphContoller(AffectiveGraphController affectiveGraphContoller) {
		this.affectiveGraphContoller = affectiveGraphContoller;
	}

	public AffectiveContoller(AffectiveColorController affectiveColorContoller,
			AffectiveGraphController affectiveGraphContoller) {
		this.affectiveColorContoller = affectiveColorContoller;
		this.affectiveGraphContoller = affectiveGraphContoller;
	}

}
