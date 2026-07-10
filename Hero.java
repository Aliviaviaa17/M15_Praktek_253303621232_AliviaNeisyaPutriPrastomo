public class Hero implements GuildMember {

    private String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    @Override
    public void terimaMisi(String namaMisi) {
        System.out.println("Hero " + nama + " siap menjalankan misi: " + namaMisi);
    }

}