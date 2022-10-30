package factory;

public enum MusicStyle {
    UNKNOWN("Unknown style"),
    TRASH_METAL("Trash-metal"),
    HARDROCK("Hard-rock"),
    JAZZ("Jazz"),
    CLASSIC("Classic"),
    POP("Pop"),
    DISCO("Disco");
    public final String style;
    MusicStyle(String style) {
        this.style = style;
        //System.out.println(style);
    }

    @Override
    public String toString() {
        return style;
    }
}
