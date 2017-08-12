package za.co.mmagon.jwebswing.plugins.angularsanitize;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularSanitizeModule extends AngularModuleBase
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularSanitizeModule
	 */
	public AngularSanitizeModule()
	{
		super("ngSanitize");
	}
	
	@Override
	public String renderFunction()
	{
		return null;
	}
}
