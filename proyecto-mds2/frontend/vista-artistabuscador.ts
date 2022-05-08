import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-artistabuscador')
export class VistaArtistabuscador extends LitElement {
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
<vaadin-horizontal-layout class="content" style="height: 100%; width: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-l); align-items: center; width: 100%;" id="vaadinVerticalLayout">
  <img style="width: 200px;" src="https://media.revistagq.com/photos/5fc0cb787e8773c13e83a61e/3:4/w_2088,h_2784,c_limit/GettyImages-1280266077.jpg" id="img">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <label style="align-self: center;" id="label">Artista</label>
  </vaadin-horizontal-layout>
  <vaadin-button id="vaadinButton">
    Editar 
  </vaadin-button>
  <vaadin-button id="vaadinButton1">
    Eliminar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
