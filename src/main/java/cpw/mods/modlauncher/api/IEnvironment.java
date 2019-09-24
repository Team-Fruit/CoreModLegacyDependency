package cpw.mods.modlauncher.api;

import java.util.Optional;
import java.util.function.BiFunction;

public interface IEnvironment {
	Optional<BiFunction<INameMappingService.Domain, String, String>> findNameMapping(String targetMapping);
}
