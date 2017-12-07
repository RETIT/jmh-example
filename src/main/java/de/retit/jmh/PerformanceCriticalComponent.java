package de.retit.jmh;

public class PerformanceCriticalComponent {

	public static double performanceCriticalMethod() {
		double sum = 0;
		for(int i = 0; i < 1000000; i++) {
			sum += Math.random();
		}
		return sum;
	}
}
