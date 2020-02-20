package com.ptc.plms.gol.oops;

import com.ptc.plms.gol.oops.rules.Rule;

/**
 * 
 * @author hdhingra
 *
 */
public class DefaultGameStratedgy extends AbstractGameStratedgy {

	public DefaultGameStratedgy(Rule[] rules)
	{
		//setRules(new Rule[]{new RuleImpl()});
		setRules(rules);// to avoid dependency
	}
	
}
