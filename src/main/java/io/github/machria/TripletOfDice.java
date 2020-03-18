package io.github.machria;




/**
 * @author majidachria
 * For TripletOfDice,
 * You need when you create my object to give a number greater than one in the constructor. If you don't, you will get
 * a dice with 6 sides.
 */
public class TripletOfDice {
	
	private int FirstDie;
	private int SecondDie;
	private int ThirdDie;
	private int side;
	
	public TripletOfDice(int side) {
		if(side<1)
			this.side=6;
		this.side = side;
	}
	
	public void rollAllDice() {
		this.FirstDie=(int)(Math.random()*this.side) + 1;
		this.SecondDie=(int)(Math.random()*this.side) + 1;
		this.ThirdDie=(int)(Math.random()*this.side) + 1;
	}
	public void rollOneDie(int dieNumber) {
		if(dieNumber==1)
			this.FirstDie=(int)(Math.random()*this.side) + 1;
		if(dieNumber==2)
			this.SecondDie=(int)(Math.random()*this.side) + 1;
		if(dieNumber==3)
			this.ThirdDie=(int)(Math.random()*this.side) + 1;
	}

	public int getFirstDie() {
		return FirstDie;
	}


	public int getSecondDie() {
		return SecondDie;
	}

	public int getThirdDie() {
		return ThirdDie;
	}

	@Override
	public String toString() {
		return "The die number 1 is a "+FirstDie+"\n"+"The die number 2 is a "+SecondDie+"\n"+"The die number 3 is a "+ThirdDie+"\n";
	}

	
	
}
