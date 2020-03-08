package com.jwebmp.plugins.angularsanitize.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularSanitizeExclusionsModule
		implements IGuiceScanModuleExclusions<AngularSanitizeExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularsanitize");
		return strings;
	}
}
