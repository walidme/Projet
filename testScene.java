import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.mathmaurer.objets.Bloc;
import com.mathmaurer.objets.TuyauRouge;
import com.mathmaurer.personnages.Mario;


@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	
	//**** VARIABLES **//
	private ImageIcon Fondec;
	private Image ImgFondec;
	private ImageIcon Playermario;
	private Image Imgmarioo;
	
	 
	
	
	private int xFondec;
	
	
	
	
	//**** CONSTRUCTEUR ****//	
	public Scene(){
		
		super();
		
		this.xFondec = -50;
		
		Fondec = new ImageIcon(getClass().getResource("/Desktop/Fondecran.png"));
		this.ImgFondec = this.Fondec.getImage();
		Playermario = new ImageIcon(getClass().getResource("/Desktop/marioo.png"));
		this.Imgmarioo = this.Imgmarioo.getImage();
		
		
		
	
	





	public void paintComponent(Graphics g) { // Dessin de toutes les images visibles à l'écran
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;

		
		
		
		g2.drawImage(this.imgFondec, this.xFondec, 0, null); // Fondecran
		g2.drawImage(imgmarioo, 300, 240, null);
		
