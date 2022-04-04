import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_para_album')
export class VistaCancion_para_album extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-m); align-items: center; width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;" id="vaadinHorizontalLayout1">
   <label style="width: 100%;" id="label">Canción 1</label>
   <vaadin-button style="width: 100%;" id="vaadinButton">
     Añadir a Álbum 
   </vaadin-button>
   <img style="width: 50px; height: 50px;" src="https://th.bing.com/th/id/R.637bcd9c2940cbd2d6026782c1d7b110?rik=S5%2bJchxCr8QqCg&amp;riu=http%3a%2f%2fcdn.onlinewebfonts.com%2fsvg%2fimg_487212.png&amp;ehk=cd9IBuyS8Zsgetraav%2bzV%2fmEER%2b323nxzTpKjdofcq8%3d&amp;risl=&amp;pid=ImgRaw&amp;r=0" id="img">
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
