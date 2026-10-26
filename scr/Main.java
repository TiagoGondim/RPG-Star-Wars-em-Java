
import javax.swing.JFrame;

public class Main {

    public static void main (String[] args){

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setTitle("Star Wars");

        TelaJogo telaJogo = new TelaJogo();
        janela.add(telaJogo);

        janela.pack();

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}