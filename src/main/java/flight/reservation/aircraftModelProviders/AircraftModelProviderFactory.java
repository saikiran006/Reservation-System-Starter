class AircraftModelProviderFactory {
    public static AircraftModelProvider getProvider(Aircraft aircraft) {
        public static AircraftModelProvider getProvider(Aircraft aircraft) {
            if (aircraft instanceof PassengerPlane) {
                return new PassengerPlaneModelProvider((PassengerPlane) aircraft);
            } else if (aircraft instanceof Helicopter) {
                return new HelicopterModelProvider((Helicopter) aircraft);
            } else if (aircraft instanceof PassengerDrone) {
                return new PassengerDroneModelProvider();
            } else {
                throw new IllegalArgumentException("Aircraft is not recognized");
            }
        }
}
