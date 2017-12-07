package de.retit.jmh;

import org.junit.Test;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class SearchBenchmarkTest {
	
	@Test
	public void runJmhBenchmark() throws RunnerException {
		Options opt = new OptionsBuilder()
				.include(SearchBenchmark.class.getSimpleName())
				.build();

		new Runner(opt).run();
	}
}
