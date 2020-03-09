package HomeWork9;

public interface IGravity2 {
	default double acceleration() {
		return 9.80665;
	}
	
	default double height() {
		return 180.00;
	}
	
	default double speedAtImpact(double heightMeters) {
	return sqrt(2 * acceleration() * height());
	}

	double sqrt(double d);
}
