package cpw.mods.modlauncher.api;

import java.util.Map;
import java.util.function.BiFunction;

public interface INameMappingService {
	String mappingName();

	String mappingVersion();

	Map.Entry<String, String> understanding();

	BiFunction<Domain, String, String> namingFunction();

	enum Domain {
		CLASS,
		METHOD,
		FIELD
	}
}
