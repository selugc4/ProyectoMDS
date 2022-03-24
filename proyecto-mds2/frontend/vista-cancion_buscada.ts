import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion_buscada')
export class VistaCancion_buscada extends LitElement {
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
 <label style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">Nombre de canción</label>
 <vaadin-button theme="icon" aria-label="Add new" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  <iron-icon src="https://cdn-icons-png.flaticon.com/512/18/18297.png"></iron-icon>
 </vaadin-button>
 <vaadin-button style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  Añadir a lista
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
