package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * V tejto triede urcime, ake slovo povazujeme za spravne(medzi dvomi pismenami b, ktore idu za sebou, ma byt parny pocet pismen a)
 */
public class LanguageBPattern {

	public boolean isWordAllowed(String w) {

		Pattern patern = Pattern.compile("(a*|b*|((b*(aa)*b*)*a*))");
		Matcher matcher = patern.matcher(w);
		if (matcher.matches()) {
			return true;
		}

		return false;
	}

}
