package at.ac.htlinn.hamsterProgram.hamsterEvaluation.model;

import java.io.Serializable;

import at.ac.htlinn.hamsterProgram.hamsterEvaluation.debugger.model.Hamster;
import at.ac.htlinn.hamsterProgram.hamsterEvaluation.workbench.Utils;

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