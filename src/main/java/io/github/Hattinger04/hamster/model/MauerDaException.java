package io.github.Hattinger04.hamster.model;

import java.io.Serializable;

import io.github.Hattinger04.hamster.debugger.model.Hamster;
import io.github.Hattinger04.hamster.workbench.Utils;

/**
 * @author $Author: djasper $
 * @version $Revision: 1.1 $
 */
public class MauerDaException extends HamsterException implements Serializable {
	int reihe;
	int spalte;

	public MauerDaException(Hamster hamster, int reihe, int spalte) {
		super(hamster, "2");
		this.reihe = reihe;
		this.spalte = spalte;

	}

	public int getReihe() {
		return reihe;
	}

	public int getSpalte() {
		return spalte;
	}

	public String toString() {
		return Utils.getResource("hamster.MauerDaException") + " (" + reihe + ", " + spalte + ")";
	}
}