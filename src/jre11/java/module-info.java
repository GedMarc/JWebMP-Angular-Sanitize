module com.jwebmp.plugins.angularsanitize {
	exports com.jwebmp.plugins.angularsanitize;

	requires com.jwebmp.core;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularsanitize.AngularSanitizePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularsanitize.AngularSanitizeModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularsanitize.implementations.AngularSanitizeExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularsanitize.implementations.AngularSanitizeExclusionsModule;
}
