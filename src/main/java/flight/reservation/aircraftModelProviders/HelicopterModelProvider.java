class HelicopterModelProvider implements AircraftModelProvider {
    private Helicopter aircraft;

    public HelicopterModelProvider(Helicopter aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String getModel() {
        return aircraft.getModel();
    }
}
