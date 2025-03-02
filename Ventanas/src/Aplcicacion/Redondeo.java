import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

class Redondeo implements Border {

    private int radio;
    private Color color;

    Redondeo(int radio) {
        this.radio = radio;
        this.color = new Color(169,169,169);
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radio+1, this.radio+1, this.radio+2, this.radio);
    }

    public boolean isBorderOpaque() {
        return true;
    }
    public void setColorFondo(Color colorFondo) {
        this.color = colorFondo;
    }
    

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    	 g.setColor(color);
        g.drawRoundRect(x, y, width-1, height-1, radio, radio);

    }
}