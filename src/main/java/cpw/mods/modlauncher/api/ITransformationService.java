package cpw.mods.modlauncher.api;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public interface ITransformationService {
	String name();

	default void argumentValues(final OptionResult option) {
	}

	void initialize(IEnvironment environment);

	void beginScanning(IEnvironment environment);

	void onLoad(IEnvironment env, Set<String> otherServices) throws IncompatibleEnvironmentException;

	@SuppressWarnings("rawtypes")
	List<ITransformer> transformers();

	default Map.Entry<Set<String>, Supplier<Function<String, Optional<URL>>>> additionalClassesLocator() {
		return null;
	}

	default Map.Entry<Set<String>, Supplier<Function<String, Optional<URL>>>> additionalResourcesLocator() {
		return null;
	}

	interface OptionResult {
	}
}
