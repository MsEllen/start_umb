package reg;

import java.io.Console;

/*
 * Tato trieda ukaze ci zadane slovo vyhovuje podmienkam
 */
public class LanguageBPatternDemo {

	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.err.println("Konzola nie je k dispozicii");
			System.exit(1);
		}
		LanguageBPattern lbp = new LanguageBPattern();
		while (true) {

			String slovo = console.readLine("%nZadajte slovo:\t");
			if (slovo == null || slovo.isEmpty()) {
				break;
			}

			if (lbp.isWordAllowed(slovo)) {
				console.printf("slovo je dobre");
			} else {
				console.printf("slovo je zle");
			}

		}
	}

}
