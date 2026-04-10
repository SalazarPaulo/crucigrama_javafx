package src.Parametros;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class FondoArriba extends JPanel {

    private JLabel img, logo_utp;
    private ImageIcon image;
    private JTextArea textArea1, textArea2, textArea3;
    private JPanel center, este, oeste;
    private Color color1;

    public FondoArriba() {

        color1 = new Color(251, 192, 175);

        this.setLayout(new BorderLayout());
        center = new JPanel();
        center.setLayout(new GridBagLayout());
        center.setBackground(color1);
        este = new JPanel();
        este.setLayout(null);
        este.setMinimumSize(new Dimension(100, 50));
        este.setPreferredSize(new Dimension(100, 50));
        este.setBackground(color1);
        oeste = new JPanel();
        oeste.setLayout(null);


        image = new ImageIcon(getClass().getResource("/Assets/logofisc.png"));
        img = new JLabel();
        img.setBounds(30,0, 50, 50);
        img.setIcon(new ImageIcon(image.getImage().getScaledInstance(img.getWidth(), img.getHeight(), 200)));
        img.setHorizontalAlignment(SwingConstants.CENTER);
        este.add(img);

        this.add(este, BorderLayout.WEST);

        logo_utp = new JLabel();
        logo_utp.setBounds(20, 0, 50, 50);
        logo_utp.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Assets/logoutp.png")).getImage().getScaledInstance(logo_utp.getWidth(), logo_utp.getHeight(), 200)));
        oeste.add(logo_utp);
        oeste.setMinimumSize(new Dimension(90, 50));
        oeste.setPreferredSize(new Dimension(90, 50));
        oeste.setBackground(color1);
        this.add(oeste, BorderLayout.EAST);

        textArea1 = new JTextArea();
        textArea1.setText("  AUTOR:\n\t-PEDRO SALAZAR\n");
        textArea1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        textArea1.setForeground(Color.BLACK);
        textArea1.setEditable(false);
        textArea1.setBounds(0, 0, 75, 50);
        textArea1.setOpaque(false);
        center.add(textArea1);

        this.add(center, BorderLayout.CENTER);
    }
}
