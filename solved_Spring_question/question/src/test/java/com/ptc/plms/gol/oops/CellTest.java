package com.ptc.plms.gol.oops;

import junit.framework.TestCase;

public class CellTest extends TestCase{
	
	private Cell cell = null;
	int x;
	int y;
	
	public void testMethodOne(){
		
		x = 1;
		
		y = 2;
		
		cell = new Cell(x, y);
		
		assertEquals(cell, cell.createCopy());
		
		assertEquals(1, cell.getX());
		
		assertEquals(2, cell.getY());
		
		assertEquals(State.DEAD, cell.getState());
	}
	
	public void testMethodTwo(){
		
		x = 1;
		
		y = 2;
		
		cell = new Cell(x, y, State.LIVE);
		
		assertEquals(cell, cell.createCopy());
		
		assertEquals(1, cell.getX());
		
		assertEquals(2, cell.getY());
		
		assertEquals(State.LIVE, cell.getState());
	}
}
