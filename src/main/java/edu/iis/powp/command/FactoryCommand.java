package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FactoryCommand {
	
	public static ComplexCommand createRectangle(int x, int y, int height, int width ) {
		List<PlotterCommand> commandArrayList = new ArrayList<PlotterCommand>();
		commandArrayList.add(new CommandSetPosition(x, y));
		commandArrayList.add(new CommandDrawLineToPosition(x + width, y));
		commandArrayList.add(new CommandDrawLineToPosition(x + width, y + height));
		commandArrayList.add(new CommandDrawLineToPosition(x, y + height));
		commandArrayList.add(new CommandDrawLineToPosition(x, y));
 		return new ComplexCommand(commandArrayList);
	}
	
	public static ComplexCommand createRightTrapezoid(int x, int y, int height, int width ) {
		List<PlotterCommand> commandArrayList = new ArrayList<PlotterCommand>();
		commandArrayList.add(new CommandSetPosition(x, y));
		commandArrayList.add(new CommandDrawLineToPosition(x + width, y));
		commandArrayList.add(new CommandDrawLineToPosition(x + width - (width / 3), y + height));		
		commandArrayList.add(new CommandDrawLineToPosition(x , y + height));		
		commandArrayList.add(new CommandDrawLineToPosition(x, y));
 		return new ComplexCommand(commandArrayList);
	}
	
}
