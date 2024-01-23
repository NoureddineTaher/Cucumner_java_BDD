package exemple.tdd;

public class Loup {
	
	
	private Orientation orientation;
	
	public Loup() {
		
		this.orientation = orientation.NORD;
	}

	public Orientation getOrientation() {
		
		return orientation;
		
	}

	public void tourner() {
		if(orientation == orientation.NORD) {
			orientation = orientation.EST;
		} else if (orientation == orientation.EST){
			orientation =orientation.SUD;
		}else if (orientation == orientation.SUD) {
			orientation =orientation.OUEST;
		} else {
			orientation = orientation.NORD;
		}
	}
}
