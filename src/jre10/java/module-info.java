import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularsanitize.AngularSanitizeModule;
import com.jwebmp.plugins.angularsanitize.AngularSanitizePageConfigurator;

module com.jwebmp.plugins.angularsanitize {
	exports com.jwebmp.plugins.angularsanitize;

	requires com.jwebmp.core;
	requires java.logging;
	requires com.jwebmp.logmaster;
	requires java.validation;

	provides IPageConfigurator with AngularSanitizePageConfigurator;
	provides IAngularModule with AngularSanitizeModule;

}
