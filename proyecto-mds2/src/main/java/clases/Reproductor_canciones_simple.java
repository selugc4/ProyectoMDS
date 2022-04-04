package clases;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("audio")
public class Reproductor_canciones_simple  extends Component {

    public Reproductor_canciones_simple() {
		// TODO Auto-generated constructor stub
        getElement().setAttribute("controls",true);
    }

    public  void setSource(String path){
        getElement().setProperty("src",path);
    }

}