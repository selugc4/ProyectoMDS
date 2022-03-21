import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_encontrada')
export class VistaCancion_encontrada extends LitElement {
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
<vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-m); align-items: center; justify-content: space-between; width: 100%;">
  <label style="width: 100%;">Canción 1</label>
  <vaadin-button style="width: 100%;">
   Añadir a Álbum
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
