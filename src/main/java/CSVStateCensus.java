public class CSVStateCensus {
	String state;
	long population;
	int areaInSqKm;
	double densityPerSqKm;

	/**
	 * Constructor
	 * 
	 * @param state          - Name of the state.
	 * @param population     - Population of the state.
	 * @param areaInSqKm     - Area of the state in Square Km.
	 * @param densityPerSqKm - Density Per Square Km.
	 */
	public CSVStateCensus(String state, long population, int areaInSqKm, double densityPerSqKm) {
		super();
		this.state = state;
		this.population = population;
		this.areaInSqKm = areaInSqKm;
		this.densityPerSqKm = densityPerSqKm;
	}

	@Override
	public String toString() {
		return "CSVStateCensus [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
				+ ", densityPerSqKm=" + densityPerSqKm + "]";
	}
}