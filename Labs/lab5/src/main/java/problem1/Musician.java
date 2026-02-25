package problem1;

public class Musician extends Artist {

    private String recordingCompany;
    private String lastRecordAlbum;

    public Musician(String firstName,
                    String lastName,
                    int age,
                    String[] genres,
                    String recordingCompany,
                    String lastRecordAlbum) {

        super(firstName, lastName, age, genres);
        this.recordingCompany = recordingCompany;
        this.lastRecordAlbum = lastRecordAlbum;
    }

    public String getRecordingCompany() {
        return recordingCompany;
    }

    public String getLastRecordAlbum() {
        return lastRecordAlbum;
    }
}