import java.util.ArrayList;
import java.util.List;

public class GuildBoard {

    private List<GuildMember> members;

    public GuildBoard() {
        members = new ArrayList<>();
    }

    // Menambahkan member
    public void addMember(GuildMember m) {
        members.add(m);
    }

    // Menerbitkan misi
    public void terbitkanMisi(String namaMisi) {

        for (GuildMember member : members) {
            member.terimaMisi(namaMisi);
        }

        LoggerSingleton.getInstance().catat("Misi diterbitkan: " + namaMisi);
    }

}