import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_administrador')
export class VistaCancion_administrador extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="width: 30%;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <label id="label">Canción</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout2">
    <label id="label1">Artista</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 100%;" id="vaadinVerticalLayout2">
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; align-self: center; width: 100%;" id="vaadinButton">
    <iron-icon src="https://w7.pngwing.com/pngs/261/757/png-transparent-computer-icons-google-play-music-button-play-angle-rectangle-triangle.png" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;" id="vaadinVerticalLayout3">
   <vaadin-button style="width: 100%;" id="vaadinButton1">
     Añadir a inicio 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;" id="vaadinVerticalLayout4">
   <vaadin-button style="width: 100%;" id="vaadinButton2">
     Editar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;" id="vaadinVerticalLayout5">
   <vaadin-button style="width: 100%;" id="vaadinButton3">
     Eliminar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
