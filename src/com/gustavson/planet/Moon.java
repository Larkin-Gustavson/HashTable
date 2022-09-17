package com.gustavson.planet;

/*
    All planet and moon information were found with the websites https://www.go-astronomy.com/planets/planet-moons.htm,
    https://en.wikipedia.org/wiki/Main_Page, https://solarsystem.nasa.gov/planets/overview/,
    and https://solarsystem.nasa.gov/moons/overview/.
 */

/**
 * An enum to represent all the Moons in our solar system that the Planets have.
 */
public enum Moon {
    // Mercury Moons = 0 moons

    // Venus Moons = 0 moons

    // Earth Moon = 1 moon

    /**
     * An enumeration constant representing the Earth moon of Luna.
     */
    LUNA("Luna", Constants.EARTH, 1.7374E+3),

    // Mars Moons = 2 moons

    /**
     * An enumeration constant representing the Mars moon of Phobos.
     */
    PHOBOS("Phobos", Constants.MARS, 1.11E+1),

    /**
     * An enumeration constant representing the Mars moon of Deimos.
     */
    DEIMOS("Deimos", Constants.MARS, 6.2E+0),

    // Jupiter Moons = 80 (had to take one moon out because it was duplicated, so really 79 moons (enumeration constants))

    /**
     * An enumeration constant representing the Jupiter moon of Ganymede.
     */
    GANYMEDE("Ganymede", Constants.JUPITER, 2.6312E+3),

    /**
     * An enumeration constant representing the Jupiter moon of Callisto.
     */
    CALLISTO("Callisto", Constants.JUPITER, 2.4103E+3),

    /**
     * An enumeration constant representing the Jupiter moon of Io.
     */
    IO("Io", Constants.JUPITER, 1.8216E+3),

    /**
     * An enumeration constant representing the Jupiter moon of Europa.
     */
    EUROPA("Europa", Constants.JUPITER, 1.5608E+3),

    /**
     * An enumeration constant representing the Jupiter moon of Amalthea.
     */
    AMALTHEA("Amalthea", Constants.JUPITER, 8.345E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Himalia.
     */
    HIMALIA("Himalia", Constants.JUPITER, 8.5E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Thebe.
     */
    THEBE("Thebe", Constants.JUPITER, 4.93E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Elara.
     */
    ELARA("Elara", Constants.JUPITER, 4.3E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Pasiphae.
     */
    PASIPHAE("Pasiphae", Constants.JUPITER, 3.00E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Metis.
     */
    METIS("Metis", Constants.JUPITER, 2.15E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Carme.
     */
    CARME("Carme", Constants.JUPITER, 2.30E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Sinope.
     */
    SINOPE("Sinope", Constants.JUPITER, 1.90E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Lysithea.
     */
    LYSITHEA("Lysithea", Constants.JUPITER, 1.80E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Ananke.
     */
    ANANKE("Ananke", Constants.JUPITER, 1.40E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Leda.
     */
    LEDA("Leda", Constants.JUPITER, 1.00E+1),

    /**
     * An enumeration constant representing the Jupiter moon of Adrastea.
     */
    ADRASTEA("Adrastea", Constants.JUPITER, 8.2E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Callirrhoe.
     */
    CALLIRRHOE("Callirrhoe", Constants.JUPITER, 4.3E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Themisto.
     */
    THEMISTO("Themisto", Constants.JUPITER, 4.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Praxidike.
     */
    PRAXIDIKE("Praxidike", Constants.JUPITER, 3.4E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Kalyke.
     */
    KALYKE("Kalyke", Constants.JUPITER, 2.6E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Iocaste.
     */
    IOCASTE("Iocaste", Constants.JUPITER, 2.6E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Megaclite.
     */
    MEGACLITE("Megaclite", Constants.JUPITER, 2.7E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Taygete.
     */
    TAYGETE("Taygete", Constants.JUPITER, 2.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Aoede.
     */
    AOEDE("Aoede", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Autonoe.
     */
    AUTONOE("Autonoe", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Chaldene.
     */
    CHALDENE("Chaldene", Constants.JUPITER, 1.9E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Dia.
     */
    DIA("Dia", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Eirene.
     */
    EIRENE("Eirene", Constants.JUPITER, 1.2E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Eukelade.
     */
    EUKELADE("Eukelade", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Harpalyke.
     */
    HARPALYKE("Harpalyke", Constants.JUPITER, 2.2E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Helike.
     */
    HELIKE("Helike", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Hermippe.
     */
    HERMIPPE("Hermippe", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Isonoe.
     */
    ISONOE("Isonoe", Constants.JUPITER, 1.9E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Thyone.
     */
    THYONE("Thyone", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Aitne.
     */
    AITNE("Aitne", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Arche.
     */
    ARCHE("Arche", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Carpo.
     */
    CARPO("Carpo", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Erinome.
     */
    ERINOME("Erinome", Constants.JUPITER, 1.6E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Ersa.
     */
    ERSA("Ersa", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Euanthe.
     */
    EUANTHE("Euanthe", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Eurydome.
     */
    EURYDOME("Eurydome", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Hegemone.
     */
    HEGEMONE("Hegemone", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Pandia.
     */
    PANDIA("Pandia", Constants.JUPITER, 1.5E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2002 J2.
     */
    S2003J2("S/2003 J2", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J9.
     */
    S2017J9("S/2017 J9", Constants.JUPITER, 3.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Cyllene.
     */
    CYLLENE("Cyllene", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Eupheme.
     */
    EUPHEME("Eupheme", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Euporie.
     */
    EUPORIE("Euporie", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Herse.
     */
    HERSE("Herse", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Kale.
     */
    KALE("Kale", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Kallichore.
     */
    KALLICHORE("Kallichore", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Kore.
     */
    KORE("Kore", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Mneme.
     */
    MNEME("Mneme", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Orthosie.
     */
    ORTHOSIE("Orthosie", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Pasithee.
     */
    PASITHEE("Pasithee", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Philophrosyne.
     */
    PHILOPHROSYNE("Philophrosyne", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Hegemone.
     */
    SPONDE("Sponde", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Thelxinoe.
     */
    THELXINOE("Thelxinoe", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J4
     */
    S2003J4("S/2003 J4", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J10.
     */
    S2003J10("S/2003 J10", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J16.
     */
    S2003J16("S/2003 J16", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J18.
     */
    S2003J18("S/2003 J18", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J19.
     */
    S2003J19("S/2003 J19", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J23.
     */
    S2003J23("S/2003 J23", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2010 J1.
     */
    S2010J1("S/2010 J1", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2011 J1.
     */
    S2011J1("S/2011 J1", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J1.
     */
    S2017J1("S/2017 J1", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J2.
     */
    S2017J2("S/2017 J2", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J3.
     */
    S2017J3("S/2017 J3", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J5.
     */
    S2017J5("S/2017 J5", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J6.
     */
    S2017J6("S/2017 J6", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J7.
     */
    S2017J7("S/2017 J7", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of Valetudo.
     */
    VALETUDO("Valetudo", Constants.JUPITER, 5E-1),

    /**
     * An enumeration constant representing the Jupiter moon of S/2010 J2.
     */
    S2010J2("S/2010 J2", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2016 J1.
     */
    S2016J1("S/2016 J1", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J12.
     */
    S2003J12("S/2003 J12", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2017 J8.
     */
    S2017J8("S/2017 J8", Constants.JUPITER, 1.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2011 J2.
     */
    S2011J2("S/2011 J2", Constants.JUPITER, 2.0E+0),

    /**
     * An enumeration constant representing the Jupiter moon of S/2003 J9.
     */
    S2003J9("S/2003 J9", Constants.JUPITER, 5E-1),

    // Saturn Moons = 83 moons

    /**
     * An enumeration constant representing the Saturn moon of Titan.
     */
    TITAN("Titan", Constants.SATURN, 2.5747E+3),

    /**
     * An enumeration constant representing the Saturn moon of Rhea.
     */
    RHEA("Rhea", Constants.SATURN, 7.643E+2),

    /**
     * An enumeration constant representing the Saturn moon of Iapetus.
     */
    IAPETUS("Iapetus", Constants.SATURN, 7.356E+2),

    /**
     * An enumeration constant representing the Saturn moon of Dione.
     */
    DIONE("Dione", Constants.SATURN, 5.617E+2),

    /**
     * An enumeration constant representing the Saturn moon of Tethys.
     */
    TETHYS("Tethys", Constants.SATURN, 5.330E+2),

    /**
     * An enumeration constant representing the Saturn moon of Enceladus.
     */
    ENCELADUS("Enceladus", Constants.SATURN, 2.521E+2),

    /**
     * An enumeration constant representing the Saturn moon of Himas.
     */
    MIMAS("Mimas", Constants.SATURN, 1.9820E+2),

    /**
     * An enumeration constant representing the Saturn moon of Hyperion.
     */
    HYPERION("Hyperion", Constants.SATURN, 1.350E+2),

    /**
     * An enumeration constant representing the Saturn moon of Phoebe.
     */
    PHOEBE("Phoebe", Constants.SATURN, 1.065E+2),

    /**
     * An enumeration constant representing the Saturn moon of Janus.
     */
    JANUS("Janus", Constants.SATURN, 8.95E+1),

    /**
     * An enumeration constant representing the Saturn moon of Epimetheus.
     */
    EPIMETHEUS("Epimetheus", Constants.SATURN, 5.81E+1),

    /**
     * An enumeration constant representing the Saturn moon of Prometheus.
     */
    PROMETHEUS("Prometheus", Constants.SATURN, 4.31E+1),

    /**
     * An enumeration constant representing the Saturn moon of Pandora.
     */
    PANDORA("Pandora", Constants.SATURN, 4.07E+1),

    /**
     * An enumeration constant representing the Saturn moon of Siarnaq.
     */
    SIARNAQ("Siarnaq", Constants.SATURN, 2.00E+1),

    /**
     * An enumeration constant representing the Saturn moon of Helene.
     */
    HELENE("Helene", Constants.SATURN, 1.76E+1),

    /**
     * An enumeration constant representing the Saturn moon of Albiorix.
     */
    ALBIORIX("Albiorix", Constants.SATURN, 1.60E+1),

    /**
     * An enumeration constant representing the Saturn moon of Atlas.
     */
    ATLAS("Atlas", Constants.SATURN, 1.51E+1),

    /**
     * An enumeration constant representing the Saturn moon of Pan.
     */
    PAN("Pan", Constants.SATURN, 1.41E+1),

    /**
     * An enumeration constant representing the Saturn moon of Telesto.
     */
    TELESTO("Telesto", Constants.SATURN, 1.24E+1),

    /**
     * An enumeration constant representing the Saturn moon of Paaliaq.
     */
    PAALIAQ("Paaliaq", Constants.SATURN, 1.10E+1),

    /**
     * An enumeration constant representing the Saturn moon of Calypso.
     */
    CALYPSO("Calypso", Constants.SATURN, 1.07E+1),

    /**
     * An enumeration constant representing the Saturn moon of Ymir.
     */
    YMIR("Ymir", Constants.SATURN, 9.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Kiviuq.
     */
    KIVIUQ("Kiviuq", Constants.SATURN, 8.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Tarvos.
     */
    TARVOS("Tarvos", Constants.SATURN, 7.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Ijiraq.
     */
    IJIRAQ("Ijiraq", Constants.SATURN, 6.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Erriapus.
     */
    ERRIAPUS("Erriapus", Constants.SATURN, 5.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Hyrrokkin.
     */
    HYRROKKIN("Hyrrokkin", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Skathi.
     */
    SKATHI("Skathi", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Thrymr.
     */
    THRYMR("Thrymr", Constants.SATURN, 3.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Daphnis.
     */
    DAPHNIS("Daphnis", Constants.SATURN, 3.8E+0),

    /**
     * An enumeration constant representing the Saturn moon of Bestla.
     */
    BESTLA("Bestla", Constants.SATURN, 3.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Mundilfari.
     */
    MUNDILFARI("Mundilfari", Constants.SATURN, 3.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Narvi.
     */
    NARVI("Narvi", Constants.SATURN, 3.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Sattungr.
     */
    SUTTUNGR("Suttungr", Constants.SATURN, 3.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Tareq.
     */
    TARQEQ("Tarqeq", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Aegir.
     */
    AEGIR("Aegir", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Bebhionn.
     */
    BEBHIONN("Bebhionn", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Fornjot.
     */
    FORNJOT("Fornjot", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Jarnsaxa.
     */
    JARNSAXA("Jarnsaxa", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Kari.
     */
    KARI("Kari", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Surtur.
     */
    SURTUR("Surtur", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S7.
     */
    S2004S7("S/2004 S7", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S13.
     */
    S2004S13("S/2004 S13", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S27.
     */
    S2004S27("S/2004 S27", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S35.
     */
    S2004S35("S/2004 S35", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2006 S1.
     */
    S2006S1("S/2006 S1", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S2.
     */
    S2006S3("S/2006 S3", Constants.SATURN, 2.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S2.
     */
    S2007S2("S/2007 S2", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2010 S1.
     */
    S2019S1("S/2019 S1", Constants.SATURN, 2.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Bergelmir.
     */
    BERGELMIR("Bergelmir", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Farbauti.
     */
    FARBAUTI("Farbauti", Constants.SATURN, 2.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Greip.
     */
    GREIP("Greip", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Hati.
     */
    HATI("Hati", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Loge.
     */
    LOGE("Loge", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Skoll.
     */
    SKOLL("Skoll", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S12.
     */
    S2004S12("S/2004 S12", Constants.SATURN, 2.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2007 S3.
     */
    S2007S3("S/2007 S3", Constants.SATURN, 2.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Pallene.
     */
    PALLENE("Pallene", Constants.SATURN, 2.5E+0),

    /**
     * An enumeration constant representing the Saturn moon of Fenrir.
     */
    FENRIR("Fenrir", Constants.SATURN, 2.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S17.
     */
    S2004S17("S/2004 S17", Constants.SATURN, 2.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S20.
     */
    S2004S20("S/2004 S20", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S23.
     */
    S2004S23("S/2004 S23", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S25.
     */
    S2004S25("S/2004 S25", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S26.
     */
    S2004S26("S/2004 S26", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S28.
     */
    S2004S28("S/2004 S28", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S29.
     */
    S2004S29("S/2004 S29", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S31.
     */
    S2004S31("S/2004 S31", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S32.
     */
    S2004S32("S/2004 S32", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S33.
     */
    S2004S33("S/2004 S33", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S37.
     */
    S2004S37("S/2004 S37", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S38.
     */
    S2004S38("S/2004 S38", Constants.SATURN, 4.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S21.
     */
    S2004S21("S/2004 S21", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S22.
     */
    S2004S22("S/2004 S22", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S24.
     */
    S2004S24("S/2004 S24", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S30.
     */
    S2004S30("S/2004 S30", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S34.
     */
    S2004S34("S/2004 S34", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S36.
     */
    S2004S36("S/2004 S36", Constants.SATURN, 3.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of S/2004 S39.
     */
    S2004S39("S/2004 S39", Constants.SATURN, 2.0E+0),

    /**
     * An enumeration constant representing the Saturn moon of Methone.
     */
    METHONE("Methone", Constants.SATURN, 1.6E+0),

    /**
     * An enumeration constant representing the Saturn moon of Polydeuces.
     */
    POLYDEUCES("Polydeuces", Constants.SATURN, 1.3E+0),

    /**
     * An enumeration constant representing the Saturn moon of Anthe.
     */
    ANTHE("Anthe", Constants.SATURN, 9E-1),

    /**
     * An enumeration constant representing the Saturn moon of Aegaeon.
     */
    AEGAEON("Aegaeon", Constants.SATURN, 3E-1),

    /**
     * An enumeration constant representing the Saturn moon of S/2009 S1.
     */
    S2009S1("S/2009 S1", Constants.SATURN, 3E-1),

    // Uranus Moons = 27 moons

    /**
     * An enumeration constant representing the Uranus moon of Titania.
     */
    TITANIA("Titania", Constants.URANUS, 7.889E+2),

    /**
     * An enumeration constant representing the Uranus moon of Oberon.
     */
    OBERON("Oberon", Constants.URANUS, 7.614E+2),

    /**
     * An enumeration constant representing the Uranus moon of Umbriel.
     */
    UMBRIEL("Umbriel", Constants.URANUS, 5.847E+2),

    /**
     * An enumeration constant representing the Uranus moon of Ariel.
     */
    ARIEL("Ariel", Constants.URANUS, 5.789E+2),

    /**
     * An enumeration constant representing the Uranus moon of Miranda.
     */
    MIRANDA("Miranda", Constants.URANUS, 2.358E+2),

    /**
     * An enumeration constant representing the Uranus moon of Puck.
     */
    PUCK("Puck", Constants.URANUS, 8.10E+1),

    /**
     * An enumeration constant representing the Uranus moon of Sycorax.
     */
    SYCORAX("Sycorax", Constants.URANUS, 7.50E+1),

    /**
     * An enumeration constant representing the Uranus moon of Portia.
     */
    PORTIA("Portia", Constants.URANUS, 6.76E+1),

    /**
     * An enumeration constant representing the Uranus moon of Juliet.
     */
    JULIET("Juliet", Constants.URANUS, 4.68E+1),

    /**
     * An enumeration constant representing the Uranus moon of Belinda.
     */
    BELINDA("Belinda", Constants.URANUS, 4.03E+1),

    /**
     * An enumeration constant representing the Uranus moon of Cressida.
     */
    CRESSIDA("Cressida", Constants.URANUS, 3.98E+1),

    /**
     * An enumeration constant representing the Uranus moon of Rosalind.
     */
    ROSALIND("Rosalind", Constants.URANUS, 3.60E+1),

    /**
     * An enumeration constant representing the Uranus moon of Desdemona.
     */
    DESDEMONA("Desdemona", Constants.URANUS, 3.20E+1),

    /**
     * An enumeration constant representing the Uranus moon of Bianca.
     */
    BIANCA("Bianca", Constants.URANUS, 2.57E+1),

    /**
     * An enumeration constant representing the Uranus moon of Prospero.
     */
    PROSPERO("Prospero", Constants.URANUS, 2.50E+1),

    /**
     * An enumeration constant representing the Uranus moon of Setebos.
     */
    SETEBOS("Setebos", Constants.URANUS, 2.40E+1),

    /**
     * An enumeration constant representing the Uranus moon of Ophelia.
     */
    OPHELIA("Ophelia", Constants.URANUS, 2.14E+1),

    /**
     * An enumeration constant representing the Uranus moon of Caliban.
     */
    CALIBAN("Caliban", Constants.URANUS, 3.60E+1),

    /**
     * An enumeration constant representing the Uranus moon of Cordelia.
     */
    CORDELIA("Cordelia", Constants.URANUS, 2.01E+1),

    /**
     * An enumeration constant representing the Uranus moon of Stephano.
     */
    STEPHANO("Stephano", Constants.URANUS, 1.60E+1),

    /**
     * An enumeration constant representing the Uranus moon of Perdita.
     */
    PERDITA("Perdita", Constants.URANUS, 1.50E+1),

    /**
     * An enumeration constant representing the Uranus moon of Mab.
     */
    MAB("Mab", Constants.URANUS, 2.40E+1),

    /**
     * An enumeration constant representing the Uranus moon of Francisco.
     */
    FRANCISCO("Francisco", Constants.URANUS, 1.1E+1),

    /**
     * An enumeration constant representing the Uranus moon of Margaret.
     */
    MARGARET("Margaret", Constants.URANUS, 1.00E+1),

    /**
     * An enumeration constant representing the Uranus moon of Ferdinand.
     */
    FERDINAND("Ferdinand", Constants.URANUS, 1.00E+1),

    /**
     * An enumeration constant representing the Uranus moon of Cupid.
     */
    CUPID("Cupid", Constants.URANUS, 1.80E+1),

    /**
     * An enumeration constant representing the Uranus moon of Trinculo.
     */
    TRINCULO("Trinculo", Constants.URANUS, 9.0E+0),

    // Neptune Moons = 14 moons

    /**
     * An enumeration constant representing the Neptune moon of Triton.
     */
    TRITON("Triton", Constants.NEPTUNE, 1.3534E+3),

    /**
     * An enumeration constant representing the Neptune moon of Proteus.
     */
    PROTEUS("Proteus", Constants.NEPTUNE, 2.100E+2),

    /**
     * An enumeration constant representing the Neptune moon of Nereid.
     */
    NEREID("Nereid", Constants.NEPTUNE, 1.7E+2),

    /**
     * An enumeration constant representing the Neptune moon of Larissa.
     */
    LARISSA("Larissa", Constants.NEPTUNE, 9.70E+1),

    /**
     * An enumeration constant representing the Neptune moon of Galatea.
     */
    GALATEA("Galatea", Constants.NEPTUNE, 8.80E+1),

    /**
     * An enumeration constant representing the Neptune moon of Despina.
     */
    DESPINA("Despina", Constants.NEPTUNE, 7.50E+1),

    /**
     * An enumeration constant representing the Neptune moon of Thalissa.
     */
    THALISSA("Thalassa", Constants.NEPTUNE, 4.10E+1),

    /**
     * An enumeration constant representing the Neptune moon of Halimede.
     */
    HALIMEDE("Halimede", Constants.NEPTUNE, 3.10E+1),

    /**
     * An enumeration constant representing the Neptune moon of Naiad.
     */
    NAIAD("Naiad", Constants.NEPTUNE, 3.30E+1),

    /**
     * An enumeration constant representing the Neptune moon of Neso.
     */
    NESO("Neso", Constants.NEPTUNE, 3.00E+1),

    /**
     * An enumeration constant representing the Neptune moon of Sao.
     */
    SAO("Sao", Constants.NEPTUNE, 2.20E+1),

    /**
     * An enumeration constant representing the Neptune moon of Laomedia.
     */
    LAOMEDEIA("Laomedeia", Constants.NEPTUNE, 2.10E+1),

    /**
     * An enumeration constant representing the Neptune moon of Psamathe.
     */
    PSAMATHE("Psamathe", Constants.NEPTUNE, 2.00E+1),

    /**
     * An enumeration constant representing the Neptune moon of Hippocamp.
     */
    HIPPOCAMP("Hippocamp", Constants.NEPTUNE, 9.0E+0),

    // Pluto Moons = 5 moons

    /**
     * An enumeration constant representing the Pluto moon of Charon.
     */
    CHARON("Charon", Constants.PLUTO, 6.036E+2),

    /**
     * An enumeration constant representing the Pluto moon of Hydra.
     */
    HYDRA("Hydra", Constants.PLUTO, 3.6E+1),

    /**
     * An enumeration constant representing the Pluto moon of Nix.
     */
    NIX("Nix", Constants.PLUTO, 2.49E+1),

    /**
     * An enumeration constant representing the Pluto moon of Kerberos.
     */
    KERBEROS("Kerberos", Constants.PLUTO, 4E+0),

    /**
     * An enumeration constant representing the Pluto moon of Styx.
     */
    STYX("Styx", Constants.PLUTO, 1.75E+1);

    /**
     * A private field to represent the name of a Moon but in a more human friendly way (Uppercase first letter, lower case all other letters).
     */
    private final String moonName;

    /**
     * A private field to represent the name of the planet that holds the moon within it's gravitational field.
     */
    private final String planetName;

    // TODO ADD MASS (AS A DOUBLE, IN KG), DENSITY (GM/CM^3)? MAYBE, DISTANCE FROM THE PLANET (KM)? MAYBE FOR THE MOONS

    /**
     * A private field to represent a Planets radius (in KM).
     */
    private final double radiusInKm;

    /**
     * A method to return the moon name.
     *
     * @return The Moon name.
     */
    public String getMoonName() {
        return this.moonName;
    }

    /**
     * A method to return the associated name of the Planet that is associated with a Moon.
     *
     * @return The name of the Planet that is associated with a Moon.
     */
    public String getPlanetName() {
        return this.planetName;
    }

    /**
     * A method to return the radius of a moon.
     *
     * @return The radius of a moon in Kilometers (KM).
     */
    public double getRadiusInKm() {
        return this.radiusInKm;
    }

    /**
     * A static method to retrieve a moon, based on a moon name. This method acts in the same way as the Moon.{@link Moon valueOf} method.
     * <p>
     * <strong>Note</strong> this method will work on a case sensitive basis. Meaning, if the method receives the
     * planet name of "Titan" it will not retrieve the enumeration constant for Titan (TITAN).
     * </p>
     *
     * @param moonName The name of the moon to retrieve.
     * @return The moon with the same name as the name used in the parameter. If it isn't found, it will throw an {@link IllegalArgumentException}.
     */
    public static Moon getMoon(String moonName) {
        return Moon.valueOf(moonName);
    }

    /**
     * A private constructor to assign information about a Moon
     * (the name of the moon, the associated name of the planet that the moon is held by gravity to, and the radius (in KM)).
     *
     * @param moonName   The human friendly name of a planet.
     * @param planetName The name of the planet that holds the moon within it's gravitational field.
     * @param radiusInKm The radius of the moon in Kilometers (KM).
     */
    Moon(String moonName, String planetName, double radiusInKm) {
        this.moonName = moonName;
        this.planetName = planetName;
        this.radiusInKm = radiusInKm;
    }

    /**
     * An overridden method from the {@link Object} class to represent a Moon as a string.
     *
     * @return The string form of a Moon object.
     */
    @Override
    public String toString() {
        return this.moonName + " | Radius = " + this.radiusInKm + " KM";
    }
}
