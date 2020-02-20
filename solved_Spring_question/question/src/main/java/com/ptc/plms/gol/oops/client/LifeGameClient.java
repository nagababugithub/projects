package com.ptc.plms.gol.oops.client;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptc.plms.gol.oops.Cell;
import com.ptc.plms.gol.oops.RuleRunner;
import com.ptc.plms.gol.oops.State;

public class LifeGameClient {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter count of LiveCells : ");
		int count = in.nextInt();
		
		Set<Cell> liveCells = new HashSet<>();
		
		System.out.println("Enter Cell Coordinates Like x,y ");
		in.nextLine();
		
		for(int i=1; i<=count; i++){
			
			System.out.println("Cell"+i+" : ");
			
			String cellStr = in.nextLine();
			
			int x = Integer.parseInt(cellStr.split(",")[0]);
			int y = Integer.parseInt(cellStr.split(",")[1]);
			
			liveCells.add(new Cell(x, y, State.LIVE));
		}
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com\\ptc\\plms\\gol\\oops\\SpringConfig.xml");
		
		RuleRunner ruleRunner = (RuleRunner) ctx.getBean("RuleRunnerInterface");
		
		HashSet<Cell> nextGeneration = (HashSet<Cell>)ruleRunner.applyRules(liveCells);
		
		System.out.println("NextGeneration LiveCells : ");
		for(Cell cell : nextGeneration){
			
			System.out.println(cell.getX()+","+cell.getY());
		}
	}
}
