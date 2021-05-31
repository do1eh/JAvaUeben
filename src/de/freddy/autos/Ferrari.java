package de.freddy.autos;

import java.awt.Color;

import de.do1eh.engine.Auto;
import de.do1eh.engine.Fahrer;

public class Ferrari extends Auto
{


	public Ferrari(Fahrer fahrer, Color color)
	{
		super(fahrer, color);
		
		// TODO Auto-generated constructor stub
	}

	public void vorwaerts(int i)
	{
		for (int j = 1; j < i; j++)
		{
			this.vorwaerts();
		}
	}

	
	public void rechts()
	{
		this.linksAbbiegen();
		this.linksAbbiegen();
		this.linksAbbiegen();
	}
}
