package testetrycatch;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        try {
            TryCatch teste1 = new TryCatch("Quintanilha", 19);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            TryCatch teste2 = new TryCatch("Osvaldo", 20);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
