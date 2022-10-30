package factory;

abstract public class MusicGroup {
    MusicStyle style;
    String name;
    public MusicGroup(String name, MusicStyle style) {
        this.style = style;
        this.name = name;
    }

    public MusicGroup(MusicStyle style) {
        this("Unknown", style);
    }

    public MusicGroup(String name) {
        this(name, MusicStyle.UNKNOWN);
    }

    public MusicGroup() {
        this("Unknown", MusicStyle.UNKNOWN);
    }

    void playMusic() {
        System.out.printf("Group \"%s\" playing %s ...\n", name, style);
    }

    void makeConcert() {
        System.out.println("Playing concert ...");
    }

    void practice() {
        System.out.println("Going to repetition ...");
    }
}
