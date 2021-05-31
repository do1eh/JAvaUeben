package de.freddy.fahrer;

import de.do1eh.engine.Fahrer;
import de.freddy.autos.Ferrari;

public class Michael extends Fahrer
{

	Ferrari	lightingMcQeueen;

	@Override
	public void autopilot()
	{
		lightingMcQeueen = (Ferrari) this.auto;
		lightingMcQeueen.setGeschwindigkeit(100);
		//level4loesung();

	}

	private void level4loesung()
	{
		for (int i = 12; i > 0; i--)
		{
			lightingMcQeueen.vorwaerts(i);
			lightingMcQeueen.rechts();
		}
	}

	
	


}
