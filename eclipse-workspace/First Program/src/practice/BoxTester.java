package practice;

import javax.swing.tree.FixedHeightLayoutCache;

public class BoxTester {
	public static void main(String[] args) {
		/*
		 * int width = 10; int height = 5; int depth = 3;
		 */
		
		//int [] width = {10, 7, 2, 4, 5};
;		
		//int [] height= {5, 7, 2, 4,  9};
		
		//int [] depth = {2, 4, 1, 3,  5};
		
		/*
		 * for (int i=0; i<width.length; i++) { System.out.println ("Box - " + (i+1) +
		 * " Width = " + width [i] +" Height = " + height [i]+ " Depth = " + depth [i])
		 * ; }
		 */
		
 		 /* int width 2 = 7; int height 2 = 6; int depth 2 = 4;
		 */ 
		
		
		//int volume = volume (width, height, depth);
		//System.out.println(volume);

	Box box = new Box();
	box.setData(  10 ,  5  , 3 );
	box.printBox();

	//box.width = 10;
	//box.height = 5;
	//box.depth = 3;
	Box box2 = new Box();
	
	box2.setData(7,  5,   4);
	//box2.width = 7;
	//box2.height = 5;
	//box2.depth = 4;
	box2.printBox();
	
	//System.out.println(box.width + ", " +box.height + ", " + box.depth);
	//System.out.println(box2.width + ", " +box2.height + ", " + box2.depth);
	
	//Box [] boxes = new Box[2];
   // boxes [0] =box;
    //boxes [1] =box2;
	
	
	
	
	
	} 
	private static int  volume (int width, int height, int  depth) {
		
		return width  * height * depth;
	}

}
