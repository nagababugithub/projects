package com.ptc.plms.gol.oops.rules;

import com.ptc.plms.gol.oops.State;

import junit.framework.TestCase;

public class RuleImplTest extends TestCase{
	
	private Rule rule = null;
	
	public void testMethod(){
		
		rule = new RuleImpl();
		
		assertEquals(State.LIVE, rule.nextState(State.LIVE, 2));
		assertEquals(State.DEAD, rule.nextState(State.DEAD, 2));
		assertEquals(State.LIVE, rule.nextState(State.DEAD, 3));
	}
}
