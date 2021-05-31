package de.freddy;

import java.awt.Color;

import de.do1eh.engine.Auto;
import de.do1eh.engine.Fahrer;
import de.do1eh.engine.JavaRace;
import de.do1eh.engine.Level;
import de.do1eh.engine.LevelFactory;
import de.freddy.autos.Ferrari;
import de.freddy.fahrer.Michael;

public class Main
{

	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		
		Fahrer fahrer=new Michael();
		Auto auto=new Ferrari(fahrer,Color.RED);
		Level level=LevelFactory.loadLevel6(auto);
		
		JavaRace.start(level);
		
		    
		    
		  
		    

	}
	
	 
	
}
