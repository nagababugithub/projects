package com.ptc.plms.gol.oops;

import java.util.Set;

public interface RuleRunnerInterface {

	 Set<Cell> applyRules(Set<Cell> liveCells);
}
