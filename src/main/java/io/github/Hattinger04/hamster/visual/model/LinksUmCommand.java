package io.github.Hattinger04.hamster.visual.model;

public class LinksUmCommand extends HamsterCommand {

	@Override
	public Object perform() {
		hamster.linksUm();
		System.out.println("linksUm();");
		return null;
	}
}
