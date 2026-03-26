package problem2;

import java.util.List;

public class Band implements Creator {

    private String name;
    private List<RecordingArtist> members;

    public Band(String name, List<RecordingArtist> members) {
        this.name = name;
        this.members = members;
    }

    public List<RecordingArtist> getMembers() {
        return members;
    }
}