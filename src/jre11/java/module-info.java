import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularsanitize.AngularSanitizeModule;
import com.jwebmp.plugins.angularsanitize.AngularSanitizePageConfigurator;
import com.jwebmp.plugins.angularsanitize.implementations.AngularSanitizeExclusionsModule;

module com.jwebmp.plugins.angularsanitize {
	exports com.jwebmp.plugins.angularsanitize;

	requires com.jwebmp.core;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularSanitizePageConfigurator;
	provides IAngularModule with AngularSanitizeModule;

	provides IGuiceScanJarExclusions with AngularSanitizeExclusionsModule;
	provides IGuiceScanModuleExclusions with AngularSanitizeExclusionsModule;
}
