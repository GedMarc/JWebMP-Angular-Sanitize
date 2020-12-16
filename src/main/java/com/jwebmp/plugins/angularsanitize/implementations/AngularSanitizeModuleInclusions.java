package com.jwebmp.plugins.angularsanitize.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularSanitizeModuleInclusions implements IGuiceScanModuleInclusions<AngularSanitizeModuleInclusions>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularsanitize");
		return set;
	}
}
