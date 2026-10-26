
import javax.swing.*;
import java.awt.*;

public class TelaJogo extends JPanel {

    // Configurações da Tela
    final int TamanhoOriginalTela = 16; // 16 significa que a tela vai ser 32 por 32, suscetível a mudanças.
    final int escala = 3;

    final int TamanhoTela = TamanhoOriginalTela * escala; // 48 por 48
    final int ColunaMaxima = 16;
    final int LinhaMaxima = 12;
    final int LarguraTela = TamanhoTela * ColunaMaxima; // 768 pixels
    final int AlturaTela = TamanhoTela * LinhaMaxima; // 576 pixels

    public TelaJogo () {

        this.setPreferredSize(new Dimension(LarguraTela, AlturaTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

    }
}
