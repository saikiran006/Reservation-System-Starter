class PassengerPlaneModelProvider implements AircraftModelProvider {
    private PassengerPlane aircraft;

    public PassengerPlaneModelProvider(PassengerPlane aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String getModel() {
        return aircraft.model;
    }
}
