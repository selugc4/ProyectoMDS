package clases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.server.AbstractStreamResource;
import com.vaadin.flow.server.StreamResource;

@Tag("audio")
public class Reproductor_canciones_simple  extends Component {

    public Reproductor_canciones_simple() {
   
		// TODO Auto-generated constructor stub
    	this.getElement().getStyle().set("width", "100%");
        getElement().setAttribute("controls",true);
        getElement().setAttribute("type", "audio/mpeg");
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }
    
    public String getSource() {
    	return getElement().getProperty("src");
    	
    }
    
    public void reproducir(String ruta) {
    	try {
			FileInputStream aux = new FileInputStream(new File(ruta));
			AbstractStreamResource resource = new StreamResource("cambioCancion.png", () -> aux);
			this.getElement().setAttribute("src", resource);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    }

}