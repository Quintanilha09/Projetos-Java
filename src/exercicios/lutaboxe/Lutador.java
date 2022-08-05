package exercicios.lutaboxe;

public class Lutador {
    public static void main(String[] args) {
        ClassLutador lutador[] = new ClassLutador[5];
        lutador[0] = new ClassLutador ("Caçador", "Brasil", 23, 1.75f, 81, 2, 15, 1);
        lutador[0].perderLuta();
        lutador[0].status();

        lutador[1] = new ClassLutador("Mata-Frango", "Brasil", 28, 1.90f, 105.8f, 30, 3, 0);
        lutador[1].ganharLuta();
        lutador[1].status();

        
        lutador[2] = new ClassLutador("Foggy", "Canadá", 31, 1.90, 91.5f, 15, 8 , 5);
        lutador[2].ganharLuta();
        lutador[2].status();

        lutador[3] = new ClassLutador("Romper-Cuerno", "Espanha", 19, 1.85f, 105.2f, 40, 10, 12);
        lutador[3].empatarLuta();
        lutador[3].status();

        lutador[4] = new ClassLutador("Ching-Chong", "Japão", 33, 1.75f, 60.1f, 0, 41, 2); 
        lutador[4].ganharLuta();
        lutador[4].status();
    }
}
