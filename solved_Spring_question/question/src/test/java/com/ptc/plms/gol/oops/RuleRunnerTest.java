package com.ptc.plms.gol.oops;

import java.util.HashSet;
import java.util.Set;

import com.ptc.plms.gol.oops.rules.Rule;
import com.ptc.plms.gol.oops.rules.RuleImpl;

import junit.framework.TestCase;

public class RuleRunnerTest extends TestCase{
	
	RuleRunner ruleRunner = null;
	
	public void testMethod(){
		
		Rule[] rules = new Rule[]{new RuleImpl()};
		
		GameStratedy gameStratedy = new DefaultGameStratedgy(rules);
		
		ruleRunner = new RuleRunner(gameStratedy);
		
		Set<Cell> liveCells = new HashSet<>();
		
		liveCells.add(new Cell(2, 1, State.LIVE));
		liveCells.add(new Cell(2, 2, State.LIVE));
		liveCells.add(new Cell(2, 3, State.LIVE));
		
		Set<Cell> nextGenerationLiveCells = new HashSet<>();
		
		nextGenerationLiveCells.add(new Cell(1, 2, State.LIVE));
		nextGenerationLiveCells.add(new Cell(2, 2, State.LIVE));
		nextGenerationLiveCells.add(new Cell(3, 2, State.LIVE));
		
		assertEquals(nextGenerationLiveCells, ruleRunner.applyRules(liveCells));
	}
}
