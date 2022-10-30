package factory;

public class GroupsFactory {
    public MusicGroup createGroup(String name, MusicStyle style) {
        MusicGroup resultGroup;
        switch (style) {
            case DISCO:
                resultGroup = new DiscoGroup(name, style);
                break;
            case JAZZ:
                resultGroup = new JazzGroup(name, style);
                break;
            case TRASH_METAL:
                resultGroup = new TrashGroup(name, style);
                break;

            default:
                throw new RuntimeException(style + " group not found");
        }
        return resultGroup;
    }
}
