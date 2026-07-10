public class MainGuild {

    public static void main(String[] args) {

        GuildBoard board = new GuildBoard();

        Hero hero1 = new Hero("Elena");
        Hero hero2 = new Hero("Lancelot");
        Hero hero3 = new Hero("Zilong");

        board.addMember(hero1);
        board.addMember(hero2);
        board.addMember(hero3);

        board.terbitkanMisi("Kalahkan Raja Naga");
    }

}