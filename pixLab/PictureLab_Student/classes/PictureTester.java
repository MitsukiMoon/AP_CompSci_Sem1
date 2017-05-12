/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.keepOnlyBlue();
	cat.explore();
  }
  
  public static void testNegate()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.negate();
	cat.explore();
  }
  
  public static void testGrayscale()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.grayscale();
	cat.explore();
  }
   
  public static void testMirrorVerticalRightToLeft()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.mirrorVerticalRightToLeft();
	cat.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.mirrorHorizontal();
	cat.explore();  
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	Picture cat = new Picture ("bananacat.jpg");
	cat.mirrorHorizontalBotToTop();
	cat.explore();  
  }
  
  public static void testMirrorArms()
  {
	Picture snowman = new Picture ("snowman.jpg");
	snowman.mirrorArms();
	snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture seagull = new Picture ("seagull.jpg");
	seagull.mirrorGull();
	seagull.explore();
  }
  
  public static void testCopy2()
  {
	Picture flower = new Picture ("flower1.jpg");
	flower.copy2(flower, 20,50,20,50);
	flower.explore();
  }
  
  public static void testMyCollage()
  {
	Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	testMyCollage();
    //testCopy();
	//testCopy2();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();

  }
}