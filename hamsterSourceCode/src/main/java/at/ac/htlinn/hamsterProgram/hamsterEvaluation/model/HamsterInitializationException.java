package at.ac.htlinn.hamsterProgram.hamsterEvaluation.model;

import java.io.Serializable;

import at.ac.htlinn.hamsterProgram.hamsterEvaluation.debugger.model.Hamster;
import at.ac.htlinn.hamsterProgram.hamsterEvaluation.workbench.Utils;

/**
 * @author $Author: djasper $
 * @version $Revision: 1.1 $
 */
public class HamsterInitializationException extends HamsterInitialisierungsException
		implements Serializable {
	public HamsterInitializationException(Hamster hamster) {
		super(hamster);
	}
	public HamsterInitializationException(HamsterInitialisierungsException e) {
		super(e.hamster);
	}

}
