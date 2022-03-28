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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-l); width: 15%; align-items: center;">
  <img style="width: 100%;" src="https://media.revistagq.com/photos/5fc0cb787e8773c13e83a61e/3:4/w_2088,h_2784,c_limit/GettyImages-1280266077.jpg">
  <label style="align-self: center;">Artista</label>
  <vaadin-button>
   Editar
  </vaadin-button>
  <vaadin-button>
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
