package net.mcreator.testmod.procedures;

import net.mcreator.testmod.TestmodModElements;

import java.util.Map;

@TestmodModElements.ModElement.Tag
public class ConfigguiCommandExecutedProcedure extends TestmodModElements.ModElement {
	public ConfigguiCommandExecutedProcedure(TestmodModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}
}
