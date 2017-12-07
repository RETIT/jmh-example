package de.retit.jmh;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(3)
public class SearchBenchmark {

	@State(Scope.Thread)
    public static class SearchState {
        public String text = "abcdefghijklmnopqrstuvwxyz";
        public String search = "l";
        public char searchChar = 'l';
    }
	
	@Benchmark
	public int testIndexOf(SearchState state) {
		return state.text.indexOf(state.search);
	}
	
	@Benchmark
	public int testIndexOfChar(SearchState state) {
		return state.text.indexOf(state.searchChar);
	}

	@Benchmark
	public boolean testContains(SearchState state) {
		return state.text.contains(state.search);
	}
}