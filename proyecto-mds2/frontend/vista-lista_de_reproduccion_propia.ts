import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_de_reproduccion_propia')
export class VistaLista_de_reproduccion_propia extends LitElement {
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
<vaadin-horizontal-layout class="content" style="align-items: center; width: 100%;" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%;">
  <label style="margin: var(--lumo-space-xl); width: 100%;" id="label">Lista de reproducción</label>
 </vaadin-horizontal-layout>
 <vaadin-button style="margin: var(--lumo-space-xl); width: 100%;" id="vaadinButton">
   Modificar 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
