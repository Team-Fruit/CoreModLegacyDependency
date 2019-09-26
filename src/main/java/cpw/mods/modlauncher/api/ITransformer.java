package cpw.mods.modlauncher.api;

import java.util.Set;

public interface ITransformer<T> {
	String[] DEFAULT_LABEL = { "default" };

	T transform(T input, ITransformerVotingContext context);

	TransformerVoteResult castVote(ITransformerVotingContext context);

	Set<Target> targets();

	default String[] labels() {
		return DEFAULT_LABEL;
	}

	enum TargetType {
		CLASS,
		METHOD,
		FIELD
	}

	final class Target {
	}
}
