package com.jwebmp.plugins.angularsanitize;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.logger.LogFactory;

import javax.validation.constraints.NotNull;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Sanitizer",
		pluginDescription = "The ngSanitize module provides functionality to sanitize HTML.",
		pluginUniqueName = "jwebswing-angular-sanitizer",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,sanitize,$sanitize, ui,web ui, framework",
		pluginSubtitle = "The ngSanitize module provides functionality to sanitize HTML.",
		pluginSourceUrl = "https://docs.angularjs.org/api/ngSanitize",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Sanitize/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Sanitize",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/api/ngSanitize",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularSanitize.jar/download")
@ComponentInformation(name = "Angular Sanitizer",
		description = "The ngSanitize module provides functionality to sanitize HTML.",
		url = "https://docs.angularjs.org/api/ngSanitize")
public class AngularSanitizePageConfigurator
		implements IPageConfigurator
{
	private static final Logger log = LogFactory.getLog(AngularSanitizePageConfigurator.class.getName());
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularSanitizePageConfigurator
	 */
	public AngularSanitizePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularSanitizePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularSanitizePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			try
			{
				if (Class.forName("com.jwebmp.plugins.textangular.TextAngularPageConfigurator") != null)
				{
					AngularSanitizePageConfigurator.log.config("Because Text Angular is installed and provides angular sanitize, it will be loaded with Text Angular.");
				}
			}
			catch (ClassNotFoundException ex)
			{
				AngularSanitizePageConfigurator.log.log(Level.FINER, "Text Angular not found, Placing in Sanitize Reference Pool", ex);
				//Only use Angular Sanitize provided if text angular sanitizer module not found
				page.getBody()
				    .addJavaScriptReference(AngularSanitizeReferencePool.AngularSanitize.getJavaScriptReference());
			}
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularSanitizePageConfigurator.enabled;
	}
}
