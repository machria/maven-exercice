package io.github.machria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DiceUser {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(DiceUser.class);

	public static void main(String[] args) throws Exception {
		new DiceUser().proceed();
	}
	public static TripletOfDice rollOnce() {
		TripletOfDice a = new TripletOfDice(6);
		a.rollOneDie(1);
		a.rollOneDie(2);
		a.rollOneDie(3);
		return a;
	}
	public void proceed() {
		TripletOfDice a = rollOnce();
		LOGGER.info(a.toString());
		
	}
}
