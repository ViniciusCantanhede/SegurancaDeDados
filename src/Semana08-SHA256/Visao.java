import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visao extends JFrame {
    //propriedades da classe
    private static final long serialVersionUID = 1L;

    private JTextArea txtTexto = new JTextArea();
    private JScrollPane jspTexto = new JScrollPane(txtTexto);

    private JTextField txtResumo = new JTextField();

    private JButton btnCalcular = new JButton("Calcular");

    //Metodo principal de execução da janela
    public static void main(String[] args) {
        new Visao().setVisible(true);
    }

    //metodo construtor da classe
    public Visao() {
        //config da janela
        setTitle("Cálculo do resumo unidirecional SHA-256");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //configuração area de texto
        jspTexto.setBounds(10, 10, 465, 280);
        add(jspTexto);
        txtTexto.setLineWrap(true);

        //Configuração da caixa de resumo
        txtResumo.setBounds(10, 300, 465, 20);
        add(txtResumo);

        //Config do botão de calcular
        btnCalcular.setBounds(200, 330, 100, 20);
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    txtResumo.setText(SHA256.calcular(txtTexto.getText()));
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao calcular o resumo");
                }
            }
        });
    }
}
