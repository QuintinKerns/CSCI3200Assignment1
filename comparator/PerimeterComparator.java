package comparator;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		int p1 = r1.getPerimeter(), p2 = r2.getPerimeter();
		if (p1 < p2){
			return -1;
		}
		else if (p1 == p2){
			return 0;
		}
		else{
			return 1;
		}
	}
	
}
