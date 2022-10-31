package io.github.Hattinger04.hamsterEvaluation.model;

import java.io.Serializable;

import io.github.Hattinger04.hamsterEvaluation.debugger.model.Hamster;
import io.github.Hattinger04.hamsterEvaluation.workbench.Utils;

/**
 * @author $Author: djasper $
 * @version $Revision: 1.1 $
 */
public class HamsterNichtInitialisiertException extends HamsterException
		implements Serializable {
	public HamsterNichtInitialisiertException(Hamster hamster) {
		super(hamster, "3");
	}

	public String toString() {
		return "hamster.HamsterNichtInitialisiertException";
	}
}