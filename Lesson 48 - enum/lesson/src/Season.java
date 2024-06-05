public enum Season {
    SUMMER(35), WINTER(-38), AUTUMN(10), SPRING(20);

    private int temperature;

    Season(int temperaturure) {
        this.temperature = temperaturure;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
