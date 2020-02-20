package com.ptc.plms.gol.oops.client;

import java.util.HashSet;
import java.util.Set;

import com.ptc.plms.gol.oops.Cell;
import com.ptc.plms.gol.oops.DefaultGameStratedgy;
import com.ptc.plms.gol.oops.GameStratedy;
import com.ptc.plms.gol.oops.RuleRunner;
import com.ptc.plms.gol.oops.State;

public class LifeGameClient {

	public static void main(String[] args) {
		
		Cell cell1 = new Cell(2, 1, State.LIVE);
		Cell cell2 = new Cell(2, 2, State.LIVE);
		Cell cell3 = new Cell(2, 3, State.LIVE);
		
		Set<Cell> liveCells = new HashSet<>();
		liveCells.add(cell1);
		liveCells.add(cell2);
		liveCells.add(cell3);
		
		GameStratedy gameStratedy = new DefaultGameStratedgy();
		
		RuleRunner ruleRunner = new RuleRunner(gameStratedy);
		
		HashSet<Cell> nextGeneration = (HashSet<Cell>)ruleRunner.applyRules(liveCells);
		
		for(Cell cell : nextGeneration){
			
			System.out.println("x = "+cell.getX()+"y = "+cell.getY());
		}
	}
}
