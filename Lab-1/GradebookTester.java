import junit.framework.TestCase;

public class GradebookTester extends TestCase 
{
 private GradeBook g1;
 private GradeBook g2;
 
 protected void setUp() throws Exception 
 {
 super.setUp();
 g1 = new GradeBook(5);
 g2 = new GradeBook(5);
 
 g1.addScore(88);
 g1.addScore(99);
 g1.addScore(75);
 
 g2.addScore(76);
 g2.addScore(78);
 g2.addScore(89);
 }
 protected void tearDown() throws Exception 
 {
 super.tearDown();
 
 g1 = null;
 g2 = null;
 }
 
 public void addScoreTest() 
 {
 assertTrue(g1.addScore(88));
 assertTrue(g1.addScore(99));
 assertTrue(g1.addScore(75));
 assertEquals(" 88.0 99.0 75.0", g1.toString());
 assertEquals(3, g1.getScoreSize());
 assertTrue(g2.addScore(76));
 assertTrue(g2.addScore(78));
 assertTrue(g2.addScore(89));
 assertEquals(" 76.0 78.0 89.0", g2.toString());
 assertEquals(3, g2.getScoreSize());
 }
 
 public void sumTest() 
 {
 assertEquals(88 + 99 + 75, g1.sum());
 assertEquals(76 + 78 + 89, g2.sum());
 }
 
 public void minimumTest() 
 {
 assertEquals(75, g1.minimum());
 assertEquals(76, g2.minimum());
 }
 
 public void testFinalScore() 
 {
 assertEquals(88 + 99, g1.finalScore());
 assertEquals(76 + 78 + 89, g2.finalScore());
 }
