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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
  <vaadin-vertical-layout style="width: 30%;">
   <vaadin-horizontal-layout theme="spacing">
    <label>Canción</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout>
    <label>Artista</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 100%;">
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100%; align-self: center; width: 100%;">
    <iron-icon src="https://w7.pngwing.com/pngs/261/757/png-transparent-computer-icons-google-play-music-button-play-angle-rectangle-triangle.png"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;">
   <vaadin-button style="width: 100%;">
    Añadir a inicio
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;">
   <vaadin-button style="width: 100%;">
    Editar
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%;">
   <vaadin-button style="width: 100%;">
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
