import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista_de_reproduccion_buscador')
export class VistaLista_de_reproduccion_buscador extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 40%; margin: var(--lumo-space-xl); align-items: center;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout style="margin-right: var(--lumo-space-xl);" id="vaadinVerticalLayout">
  <label id="label">Lista de reproducción</label>
  <label style="font-size: 13px" id="label1">Autor</label>
 </vaadin-vertical-layout>
 <vaadin-button style="margin-left: var(--lumo-space-xl); width: 100%;" id="vaadinButton">
   Seguir 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
