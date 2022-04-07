package planetTask;
public class Planet {
    public String name;
    public double mass,surfaceGravity,surfaceArea,volume;
    public int population;
    public Planet(String name, double mass, double surfaceGravity, double surfaceArea, double volume, int population) {
        this.name = name;
        this.mass = mass;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
