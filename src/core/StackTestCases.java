package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {

	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack();
		assertEquals(true,s1.isEmpty());
		
		assertEquals(0,s1.getSize());
	}
}