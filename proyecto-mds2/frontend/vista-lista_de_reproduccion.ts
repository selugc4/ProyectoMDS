import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; align-items: center; width: 100%; justify-content: space-between;">
  <label style="margin: var(--lumo-space-m); width: 100%;">Lista de reproducción</label>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button>
    Seguir
   </vaadin-button>
   <vaadin-button>
    Editar
   </vaadin-button>
   <vaadin-button>
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
