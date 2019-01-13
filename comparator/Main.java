package comparator;

import java.util.Comparator;

public class Main {

	/*BEGIN:DO NOT MODIFY*/
	public static <AnyType> AnyType findMax(AnyType[] arr, Comparator<? super AnyType> cmp)
	{
		int maxIndex = 0;

		for(int i = 1; i < arr.length; i++)
		{
			if(cmp.compare(arr[i], arr[maxIndex]) > 0)
			{
				maxIndex = i;
			}
		}

		return arr[maxIndex];
	}
	/*END:DO NOT MODIFY*/

	public static void main(String[] args)
	{
		Rectangle[] arr = generateRandomRectangles(5);
		System.out.println("Largest Area: " + findMax(arr, new AreaComparator()));
		System.out.println("Largest Perimeter: " + findMax(arr, new PerimeterComparator()));
	}
	
	public static Rectangle[] generateRandomRectangles(int numRectangles){
		Rectangle[] rectArray = new Rectangle[numRectangles];
		for (int i = 0; i < numRectangles; i++){
			rectArray[i] = new Rectangle((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
			System.out.println("Rectangle " + (i + 1) + ": " + rectArray[i] + "; Area: " + rectArray[i].getArea() + ", Perimeter: " + rectArray[i].getPerimeter());
		}
		return rectArray;
	}
}
