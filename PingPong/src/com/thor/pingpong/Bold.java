package com.thor.pingpong;

import java.awt.*;

public class Bold {
	
	/* Created: 15-11-2014
	 * Created By: Thorbjørn Simonsen and Rasmus Ruff
	 * Description:
	 * 
	 * Version  0.1a
	 * Last Updated: 15-11-2014
	 * */
	
	
	// Variable Declaration
	public int bstørrelse; //The Size of The ball
	public double bflyveretning; //the direction of the ball 
	public int bhastighed; // the speed of the ball
	public double bvinkel; // the vinkel of the balls direction
	public int posX; //"x" cordinatie of the position
	public int posY; // "y" cordinate of the position
	
	public Bold (int størrelse, int positionX, int positionY){// constuctor
		bstørrelse = størrelse; //Initialization of Variables
		posX =  positionX;
		bhastighed = 10; 
		
		bvinkel=Math.random()*360;
		bhastighed=(int) (bvinkel - 180);
		
	}
	
	
	}
	public void skiftRetning(){
		bhastighed = bhastighed-1;
		double nyRetning;
		
		//nyRetning=180 gammel redning 
	}
	
	
}
