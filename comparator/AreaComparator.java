package comparator;

import java.util.Comparator;

public class AreaComparator implements Comparator<Rectangle>{

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		int a1 = r1.getArea(), a2 = r2.getArea();
		if (a1 < a2){
			return -1;
		}
		else if (a1 == a2){
			return 0;
		}
		else{
			return 1;
		}
	}

}
