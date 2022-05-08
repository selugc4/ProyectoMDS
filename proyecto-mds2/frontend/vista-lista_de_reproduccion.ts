import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_de_reproduccion')
export class VistaLista_de_reproduccion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; align-items: center; width: 100%; justify-content: space-between;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; margin: var(--lumo-space-xl);">
   <label style="width: 100%; height: 100%;" id="label">Lista de reproducción</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-button id="vaadinButton">
     Seguir 
   </vaadin-button>
   <vaadin-button id="vaadinButton1">
     Editar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2">
     Eliminar 
   </vaadin-button>
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
