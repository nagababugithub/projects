package com.ptc.plms.gol.oops;

import java.util.HashSet;
import java.util.Set;

import com.ptc.plms.gol.oops.rules.Rule;
import com.ptc.plms.gol.oops.rules.RuleImpl;

import junit.framework.TestCase;

public class AbstractGameStratedgyTest extends TestCase {
	
	private AbstractGameStratedgy abstractGameStratedgy = null; 
	
	public void testMethod(){
		
		Rule[] rules = new Rule[]{new RuleImpl()};
		
		abstractGameStratedgy = new DefaultGameStratedgy(rules);
		
		assertEquals(rules, abstractGameStratedgy.getRules());
		
		abstractGameStratedgy.setRules(rules);
		
		assertEquals(rules, abstractGameStratedgy.getRules());
		
		Set<Cell> liveCells = new HashSet<>();
		Cell cell1 = new Cell(1, 1, State.LIVE);
		liveCells.add(cell1);
		
		Set<Cell> nbCells = new HashSet<>();
		
		nbCells.add(new Cell(0, 0, State.DEAD));
		nbCells.add(new Cell(0, 1, State.DEAD));
		nbCells.add(new Cell(0, 2, State.DEAD));
		nbCells.add(new Cell(1, 0, State.DEAD));
		//nbCells.add(new Cell(1, 1, State.DEAD));
		nbCells.add(new Cell(1, 2, State.DEAD));
		nbCells.add(new Cell(2, 0, State.DEAD));
		nbCells.add(new Cell(2, 1, State.DEAD));
		nbCells.add(new Cell(2, 2, State.DEAD));
		
		Set<Cell> actualnbCells = abstractGameStratedgy.findNeighbours(cell1, liveCells);
		
		assertEquals(nbCells, actualnbCells);
		
		assertEquals(8, actualnbCells.size());
	}
}
