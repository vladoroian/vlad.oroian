package recaphomework.exception.annotations.functions.generics.io.firstrequest;

public enum SportType {

    RUN ("Running"),
    SWIM ("Swimming"),
    FOT ("Football"),
    AER ("Aerobics");

    private final String name;

    SportType (String name) {

        this.name=name;
    }

    public String getName () {

        return name;
    }

}
