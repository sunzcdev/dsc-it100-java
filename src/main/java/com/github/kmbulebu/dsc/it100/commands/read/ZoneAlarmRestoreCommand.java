
package com.github.kmbulebu.dsc.it100.commands.read;

import com.github.kmbulebu.dsc.it100.commands.ICommandHelp;

public class ZoneAlarmRestoreCommand extends BasePartitionZoneCommand implements ICommandHelp {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5642203366452257877L;
	public static final String CODE = "602";

	public String getDescription() {
		return "This IT-100 command indicates that a zone alarm and associated partition has been restored.";
	}

	@Override
	public String toString() {
		return "ZoneAlarmRestoreCommand [toString()=" + super.toString() + "]";
	}
	
}
