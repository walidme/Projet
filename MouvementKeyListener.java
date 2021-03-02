import java.awt.*;
import java.awt.event.*;

import javax.swing.Timer;


public class MouvementKeyListener extends Frame implements KeyListener, ActionListener {

    int x, y, w, h;
    int pas = 10; // Le pas du personnage
    int t = pas;
    Graphics personnage;
   // final Timer saut = new Timer(100,this);
    
    final int height = 700;
    final int width = 1000;
    final Timer saut = new Timer(100,this);
    public MouvementKeyListener(int vx, int vy, int vw, int vh) {

        x = vx;
        y = vy;
        w = vw;
        h = vw;
        
        setSize(width, height);
        addKeyListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics personnage) {
    	super.paintComponents(personnage);
        personnage.drawRect(x, y, w, h);
        personnage.setColor(Color.ORANGE);
        personnage.fillRect(x, y, w, h);
        
        
    }

    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        
        
        
        switch (keyCode) {
            case KeyEvent.VK_UP:
            	saut.setActionCommand("Saut");
            		saut.stop();
            		saut.start();
            	
                break;
            case KeyEvent.VK_DOWN:
                y = y + pas;
                repaint();
                
                break;
            case KeyEvent.VK_LEFT:
                x = x - pas;
                repaint();
                break;
            case KeyEvent.VK_RIGHT:
                x = x + pas;
                repaint();
                break;
            
        }
        
   
	}
    	
    	
    
    public void keyTyped(KeyEvent ke) {

    }

    public void keyReleased(KeyEvent ke) {
    	int keyCode = ke.getKeyCode();
    	switch(keyCode) {
    	case KeyEvent.VK_UP:
    		//saut.setActionCommand("Arrêt");
    		//saut.stop();
    		//saut.start();
    		
    		
    		
    	}
    		
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		int ret = 0;
		if(e.getActionCommand().equals("Saut")) {
			if((ret<200000)&&(t>0)) {
				ret++;
    		if((y<h)||(y>height-h)) {t=-t;}
    		
    		y = y-2*t;
    		
    		repaint();
			}
		
	}
		if(e.getActionCommand().equals("Arrêt")) {
			
		
	}
    
}
    	
}

    

	
	
	

