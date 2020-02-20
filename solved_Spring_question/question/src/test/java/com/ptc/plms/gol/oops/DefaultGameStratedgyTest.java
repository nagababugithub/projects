package com.ptc.plms.gol.oops;

import com.ptc.plms.gol.oops.rules.Rule;
import com.ptc.plms.gol.oops.rules.RuleImpl;

import junit.framework.TestCase;

public class DefaultGameStratedgyTest extends TestCase {

	private DefaultGameStratedgy defaultGameStratedgy = null;
	
	public void testMethod(){
		
		Rule[] rules = new Rule[]{new RuleImpl()};
		
		defaultGameStratedgy = new DefaultGameStratedgy(rules);
		
		assertEquals(rules, defaultGameStratedgy.getRules());
	}
	
}
