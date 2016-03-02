public class Planets {
    /*
        Enums are classes
        https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    */
    public enum Planet {
        EARTH(3.44, 5.22),
        MARS(5.36, 4.21),
        VENUS(8.33, 6.21),
        SATURN(7.15, 2.69)
    
        private final double mass
        private final double radius
        Planet(double mass, double radius) {
            this.mass = mass
            this.radius = radius
        }
        
        private static final double G = 6.67
        
        private double surfaceGravity() {
            return G * mass / (radius * radius) 
        }
    }
    
    public void getPlanetValues() {
        for(Planet p : Planet.values()) {
            printf("Your weight on %s is %f%n", p, p.surfaceGravity())
        }
    }
}
Planets planets = new Planets()
planets.getPlanetValues()
println(Planet.class)
    
