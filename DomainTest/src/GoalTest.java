import junit.framework.TestCase;

import com.Domain.Goal;


public class GoalTest extends TestCase {

	public void testGoal(){
		Goal goal = new Goal();
		goal.setTitle("My First Goal");
		assertEquals("My First Goal", goal.GetTitle());
	}
}
