package clases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.StreamResource;

@Tag("audio")
public class Reproductor_canciones_simple  extends Component {
	public static int reproducibles =5;
	public Ver_creditos vcre = new Ver_creditos();

    public Reproductor_canciones_simple() {
   
    	this.getElement().getStyle().set("width", "100em");
        getElement().setAttribute("controls",true);
        getElement().setAttribute("type", "audio/mpeg");
        getElement().setProperty("src", "");
       
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }
    
    public String getSource() {
    	return getElement().getProperty("src");
    	
    }
    
    public void reproducir(String ruta) {
    	if(reproducibles > 0) {
    		this.getElement().setAttribute("src", "canciones/"+ruta);
			reproducibles--;
			Cibernauta.button.setVisible(true);
      	}else {
    		Notification.show("Límite de canciones reproducibles alcanzado. Si quiere escuchar más regístrese o inicie sesión");
    		this.setSource(null);
    		Cibernauta.button.setVisible(false);
    	}

    }

}