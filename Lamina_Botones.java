package practicas;

import javax.swing.*;

public class Lamina_Botones extends JPanel {
	
	public Lamina_Botones(String titulo,String [] opciones) {
		
	         setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo)); //indicamos los borde de cada caja
	
	         setLayout(new BoxLayout(this,BoxLayout.Y_AXIS)); //acabamos de indicar que va a tener una disposicion tipo caja, cuyo interior los componentes van a estar distribuido verticalmente de arriba a abajo
		
	         grupo=new ButtonGroup();
	     
	     for (int i=0;i<opciones.length;i++) {
	    	 
	    	 JRadioButton bot=new JRadioButton(opciones[i]);
	    	 
	    	 bot.setActionCommand(opciones[i]);
	    	 
	    	 add(bot);
	    	 
	    	 grupo.add(bot);
	    	 
	    	 bot.setSelected(i==0); //se selecciona la primera acción del boton
	    	 
	    	 
	    	 
	     }
	
	}
	
	public String dameSeleccion() {
		
		/*ButtonModel miboton=grupo.getSelection();
		String s=miboton.getActionCommand();
		
		return s;*/
	
		return grupo.getSelection().getActionCommand();
		
		
	}
	
	
	private ButtonGroup grupo;

}
