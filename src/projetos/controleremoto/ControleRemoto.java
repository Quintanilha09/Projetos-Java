package controleremoto;

public class ControleRemoto {
    public static void main(String[] args) {
        ClassControleRemoto controle1 = new ClassControleRemoto();
        controle1.ligar();
        controle1.play();
        controle1.abrirMenu();
        controle1.maisVolume();
        controle1.ligarMudo();

        ClassControleRemoto controle2 = new ClassControleRemoto();
        //Testando chamada dos métodos sem ligar o controle
        controle2.ligar();
        controle2.play();
        controle2.pause();
        controle2.menosVolume();
        controle2.menosVolume();
        controle2.maisVolume();
        controle2.ligarMudo();
        controle2.abrirMenu();
        controle2.fecharMenu();
    }
}
