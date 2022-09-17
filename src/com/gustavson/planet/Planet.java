package com.gustavson.planet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    All planet and moon information were found with the websites:
    https://www.go-astronomy.com/planets/planet-moons.htm,
    https://en.wikipedia.org/wiki/Main_Page, https://solarsystem.nasa.gov/planets/overview/,
    and https://solarsystem.nasa.gov/moons/overview/.
 */

/**
 * An enum to represent the Planets (and the dwarf planet of Pluto) in our Solar System.
 */
public enum Planet {
    /**
     * An enumeration constant to represent the planet of Mercury.
     */
    MERCURY(Constants.MERCURY, 3.3022E+23, 2_440, true, List.of()),

    /**
     * An enumeration constant to represent the planet of Venus.
     */
    VENUS(Constants.VENUS, 4.8685E+24, 6_051, true, List.of()),

    /**
     * An enumeration constant to represent the planet of Earth.
     */
    EARTH(Constants.EARTH, 5.9736E+24, 6_378, true,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName().equals(Constants.EARTH))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Mars.
     */
    MARS(Constants.MARS, 6.4185E+23, 3_397, true,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName().equals(Constants.MARS))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Jupiter.
     */
    JUPITER(Constants.JUPITER, 1.8986E+27, 71_492, false,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName()
                                    .equals(Constants.JUPITER))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Saturn.
     */
    SATURN(Constants.SATURN, 5.6846E+26, 60_268, false,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName()
                                    .equals(Constants.SATURN))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Uranus.
     */
    URANUS(Constants.URANUS, 8.6810E+25, 25_559, false,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName()
                                    .equals(Constants.URANUS))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Neptune.
     */
    NEPTUNE(Constants.NEPTUNE, 10.243E+25, 24_764, false,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName()
                                    .equals(Constants.NEPTUNE))
                            .toList()
            )
    ),

    /**
     * An enumeration constant to represent the planet of Pluto.
     */
    PLUTO(Constants.PLUTO, 1.25E+22, 1_151, false,
            new ArrayList<>(
                    Arrays.stream(Moon.values())
                            .filter(moon -> moon.getPlanetName()
                                    .equals(Constants.PLUTO))
                            .toList()
            )
    );

    /**
     * A private field to represent the Planet's name in a more human friendly way (uppercase first letter, lowercase letters after that).
     */
    private final String name;

    /**
     * A private field to represent the mass in KG (Kilograms) of a Planet.
     */
    private final double massInKg;

    /**
     * A private field to represent the radius in KM (Kilometers) of a Planet.
     */
    private final int radiusInKm;

    /**
     * A private field to represent if a Planet is terrestrial (a planet is rocky) or not.
     */
    private final boolean isTerrestrial;

    /**
     * A private list to represent the list of moons a Planet may have.
     * Some planets have zero moons (Mercury and Venus), while others may have one or more moons.
     */
    private final List<Moon> moons;

    /**
     * A private constructor to assign the fields of a Planet to the associated enumeration constant.
     *
     * @param name          The human friendly name of a planet.
     * @param massInKg      The mass in Kilograms (KG) of a planet.
     * @param radiusInKm    The radius in Kilometers (KM) of a planet.
     * @param isTerrestrial If the planet is terrestrial (a planet that is rocky) or not.
     * @param moons         The list of moons that each planet has.
     */
    Planet(String name, double massInKg, int radiusInKm, boolean isTerrestrial, List<Moon> moons) {
        this.name = name;
        this.massInKg = massInKg;
        this.radiusInKm = radiusInKm;
        this.isTerrestrial = isTerrestrial;
        this.moons = moons;
    }

    /**
     * A method to retrieve the human friendly name of a planet.
     *
     * @return The human friendly name of a planet.
     */
    public String getName() {
        return this.name;
    }

    /**
     * A method to retrieve the mass in Kilograms (KG) of a planet.
     *
     * @return The mass in Kilograms (KG) of a planet.
     */
    public double getMassInKg() {
        return this.massInKg;
    }

    /**
     * A method to retrieve the radius in Kilometers (KM) of a planet.
     *
     * @return The radius in Kilometers (KM) of a planet.
     */
    public int getRadiusInKm() {
        return this.radiusInKm;
    }

    /**
     * A method to retrieve if a planet is terrestrial (a planet is rocky) or not.
     *
     * @return <b>True</b> if the planet is terrestrial (a planet is rocky).
     * <br/>
     * <b>False</b> if the planet is not terrestrial (a planet is not rocky).
     */
    public boolean isTerrestrial() {
        return this.isTerrestrial;
    }

    /**
     * A method retrieve the list of moons for a planet.
     *
     * @return A list of the moons of a Planet.
     */
    public List<Moon> getMoons() {
        return this.moons;
    }

    /**
     * A method to retrieve the total number of moons for a specific planet.
     *
     * @return The total number of moons for a specific planet.
     */
    public int getNumberOfMoons() {
        return this.moons.size();
    }

    /**
     * A static method to retrieve a planet, based on a planet name. This method acts in the same way as the Planet.{@link Planet valueOf} method.
     * <p>
     * <strong>Note</strong> this method will work on a case sensitive basis. Meaning, if the method receives the
     * planet name of "Earth" it will not retrieve the enumeration constant of Earth (EARTH).
     * </p>
     *
     * @param planetName The name of the planet to retrieve.
     * @return The planet with the same name as the name used in the parameter. If it isn't found, it will throw an {@link IllegalArgumentException}.
     */
    public static Planet getPlanet(String planetName) {
        return Planet.valueOf(planetName);
    }

    /**
     * A public field to represent the total number of moons for all planets.
     */
    public static final int TOTAL_NUMBER_OF_MOONS_FOR_ALL_PLANETS = Moon.values().length;

    /**
     * A public static field to represent the Universal Gravitational Constant in m ^ 2 / kg ^ 2 * N. Where N is Newtons.
     */
    public static final double G = 6.673E-11;

    /**
     * An overridden method to represent the string form of a Planet enum.
     *
     * @return The string form of a Planet enumeration constant.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName()
               + " { "
               + "Name = " + name
               + ", MassInKg = " + massInKg
               + " KG " + ", RadiusInKm = " + radiusInKm
               + " KM " + ", isTerrestrial = " + isTerrestrial
               + ", Moon(s) = " + moons
               + " } ";
    }
}
