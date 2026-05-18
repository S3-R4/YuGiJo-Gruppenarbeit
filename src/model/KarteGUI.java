package yugiohh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;




public class YuGiOhhGui extends JFrame {
  // Anfang Attribute
  Held h = new Held("Kitty", "Dämon", "Mistvieh", 25, 75, 50, 50);
  Karte k = new Karte(h);
  
  private final Color COLOR_BG = new Color(128, 0, 0);
  private final Color COLOR_BORDER = new Color(218, 165, 35);
  private final Color COLOR_TEXT = new Color(0);
  // sind die Farben, die auch im Beispiels Bild verwendet worden sind(wir Können auch noch andere Farben nehmen)
  // Ende Attribute

  public YuGiOhhGui (String title) {
    super (title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 500;
    setSize(frameWidth, frameHeight);
    
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Container cp = getContentPane();
    
//    cp.setLayout(new BorderLayout());
//    cp.add(k, BorderLayout.CENTER);
    
    JPanel mainPanel = new JPanel(); // Das erzeugt im Hauftfenster einen dickeren Rand Ähnlich wie im beispiels bild
    mainPanel.setBackground(COLOR_BG);
    mainPanel.setBorder(new LineBorder(COLOR_BORDER, 5));
    mainPanel.setLayout(new BorderLayout(5, 5));
    cp.add(mainPanel);
    
    // Anfang Komponenten
    JPanel panelHeader = new JPanel();
    panelHeader.setBackground(COLOR_BG);
    panelHeader.setLayout(new BorderLayout());
    panelHeader.setBorder(new EmptyBorder(10, 10, 5, 10));
    
    JLabel lblName = new JLabel(h.getTyp());
    lblName.setForeground(COLOR_TEXT);
    lblName.setFont(new Font("Deine MoM", Font.BOLD, 22)); // erzeugt eine gewisse Schrifftart Ahnlich wie im beispiels bild (brauchen wir nicht umbedingt)
    panelHeader.add(lblName, BorderLayout.WEST);
    
    JLabel lblTyp = new JLabel(h.getTyp());
    lblTyp.setForeground(COLOR_TEXT);
    lblTyp.setFont(new Font("Deine MoM", Font.BOLD, 22));
    panelHeader.add(lblTyp, BorderLayout.WEST);
    
    JLabel lblBild = new JLabel();
    lblBild.setHorizontalAlignment(SwingConstants.CENTER);
    lblBild.setBorder(new LineBorder(COLOR_BORDER, 3)); // Erzeugt ein Ramen um das Bild
    
    // ImageIcon icon = new ImageIcon(getClass().getResource(...));
    // Is dafür da, dass das Panel Schöner ist (Bild soll abstand zur karte haben)
    JPanel panelBildContainer = new JPanel(new BorderLayout());
    panelBildContainer.setBackground(COLOR_BG);
    panelBildContainer.setBorder(new EmptyBorder(5, 10, 5, 10));
    panelBildContainer.add(lblBild, BorderLayout.CENTER);
    
    mainPanel.setBorder(new LineBorder(COLOR_BORDER, 3));
    
    JPanel panelSouth = new JPanel();
    panelSouth.setBackground(COLOR_BG);
    panelSouth.setLayout(new BoxLayout(panelSouth, BoxLayout.Y_AXIS));
    panelSouth.setBorder(new LineBorder(COLOR_BORDER, 3));
    // soll ähnlich wie das obere einfach dafür sorgen, dass es schöner ist (Panel Klebt nicht unten am rand)
    JPanel panelSouthContainer = new JPanel(new BorderLayout());
    panelSouthContainer.setBackground(COLOR_BG);
    panelSouthContainer.setBorder(new EmptyBorder(5, 10, 5, 10));
    panelSouthContainer.add(panelSouth, BorderLayout.CENTER);
    
    JLabel lblBeschreibung = new JLabel();
    lblBeschreibung.setForeground(COLOR_TEXT);
    lblBeschreibung.setFont(new Font("Deine MoM", Font.PLAIN, 22));
    lblBeschreibung.setBorder(new EmptyBorder(10, 10, 5, 10));
    panelSouth.add(lblBeschreibung);
    
    JPanel panelGridStats = new JPanel(new GridLayout());
    //panelGridStats.setOpaque(false); // macht Panel durchsichtig ka ob wir das brauchen sieht aber schön aus
    panelGridStats.setBorder(new EmptyBorder(5, 10, 5, 10));
    
    // Die werte sollen ab hier eingetragen werden (JL lblWert = new JL(get.Wert))
    
    // Ende Komponenten
    
    setResizable(true);
    setVisible(true);
  }

  // Anfang Methoden
  // Ende Methoden

  public static void main(String[] args) {
    new YuGiOhhGui("KarteGUI");
  }
}
