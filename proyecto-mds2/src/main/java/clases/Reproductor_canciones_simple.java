package clases;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

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

}