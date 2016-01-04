package graphics;

//import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;

public class DrawGraphics {
    //BouncingBox box;
    
	int nBlack = 4;
	int [] xBlack = {5, 65, 270, 240};
	int [] yBlack = {100, 15, 170, 215};
	
	int [] xGreen = {110, 130, 210, 190};
	int [] yGreen = {49, 20, 80, 108};
	int nGreen = 4;

	int [] xOran = {60, 65, 282, 280};
	int [] yOran = {140, 130, 238, 240};
	int nOran = 4;

	int [] xCyan = {76, 80, 261, 262};
	int [] yCyan = {158, 150, 233, 235};
	int nCyan = 4;

	int [] xBlue = {107, 121, 203, 190};
	int [] yBlue = {207, 177, 210, 238};
	int nBlue = 4;

	
    /** Initializes this class for drawing. */
    public DrawGraphics() {
    //    box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
   //    surface.drawLine(50, 50, 250, 250);
   //     box.draw(surface);
    	
    	for(int i = 0; i < nBlack; i++) {
    		xBlack[i] += -2.5; 
    		yBlack[i] += -1; 
    	}

    	surface.drawPolygon(xBlack, yBlack, nBlack);
    	surface.setColor(Color.BLACK);
    	surface.fillPolygon(xBlack, yBlack, nBlack);
 
       	for(int i = 0; i < nGreen; i++) {
    		xGreen[i] += -1; 
    		yGreen[i] += -1; 
    	}
       	
       	
    	
      	Color darkGreen = new Color (52, 112, 56);
       	
    	surface.drawPolygon(xGreen, yGreen, nGreen);
    	surface.setColor(darkGreen);
    	surface.fillPolygon(xGreen, yGreen, nGreen);

      	for(int i = 0; i < nOran; i++) {
    		xOran[i] += -1; 
    		yOran[i] += 2; 
    	}


    	surface.drawPolygon(xOran, yOran, nOran);
    	surface.setColor(Color.ORANGE);
    	surface.fillPolygon(xOran, yOran, nOran);    	
 
      	for(int i = 0; i < nCyan; i++) {
    		xCyan[i] += -2; 
    		yCyan[i] += 2; 
    	}

     	Color customBlue = new Color (37, 67, 207);
    	
     	surface.drawPolygon(xCyan, yCyan, nCyan);
    	surface.setColor(customBlue);
    	surface.fillPolygon(xCyan, yCyan, nCyan);  
    	
      	for(int i = 0; i < nBlue; i++) {
    		xBlue[i] += -2.5; 
    		yBlue[i] += 2.5; 
    	}
 	
      	Color darkBlue = new Color (48, 63, 116);

    	surface.drawPolygon(xBlue, yBlue, nBlue);
    	surface.setColor(darkBlue);
    	surface.fillPolygon(xBlue, yBlue, nBlue);
    	
//    	surface.setColor(color);
//        surface.fillRect(x - SIZE/2, y - SIZE/2, SIZE, SIZE);
//        surface.setColor(Color.BLACK);
//        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
//        surface.drawRect(x - SIZE/2, y - SIZE/2, SIZE, SIZE);

    }
} 

		 