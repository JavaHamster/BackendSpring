package at.ac.htlinn.hamsterProgram.hamsterEvaluation.lego.model;


import at.ac.htlinn.hamsterProgram.hamsterEvaluation.model.HamsterException;
import at.ac.htlinn.hamsterProgram.hamsterEvaluation.debugger.model.Hamster;
import java.io.Serializable;
import at.ac.htlinn.hamsterProgram.hamsterEvaluation.workbench.Utils;
/**
 *
 * @author Christian
 */
public class MaulNichtLeerException extends HamsterException implements Serializable {
        
        protected Hamster hamster;
        
        public MaulNichtLeerException(Hamster hamster) {
                super(hamster, "6");
                this.hamster = hamster;
                
        }
        
        public String toString() {
                return "hamster.MaulNichtLeerException";
        }
        
        
        
        
}

