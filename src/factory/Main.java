package factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupsFactory groupsFactory = new GroupsFactory();
        List<MusicGroup> groups = new ArrayList<>();

        MusicGroup discoGroup = groupsFactory.createGroup("Boney M", MusicStyle.DISCO);
        MusicGroup trashGroup = groupsFactory.createGroup("Metallica", MusicStyle.TRASH_METAL);
        MusicGroup jazzGroup = groupsFactory.createGroup("Miles Davis", MusicStyle.JAZZ);

        groups.add(discoGroup);
        groups.add(trashGroup);
        groups.add(jazzGroup);
        playMusic(groups);
    }

    public static void playMusic(List<MusicGroup> groups) {
        for (MusicGroup group : groups) {
            group.playMusic();
        }
    }
}
