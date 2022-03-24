import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_lista_de_reproduccion')
export class VistaVer_lista_de_reproduccion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  <label style="align-self: center;">Nombre de la lista de reproducción</label>
  <vaadin-button style="margin-left: var(--lumo-space-xl);">
   Editar
  </vaadin-button>
  <vaadin-button style="margin-left: var(--lumo-space-xl);">
   Seguir
  </vaadin-button>
  <vaadin-button style="margin-left: var(--lumo-space-xl);">
   Dejar de seguir
  </vaadin-button>
  <vaadin-button style="margin-left: var(--lumo-space-xl);">
   Compartir
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
  <label style="align-self: center;">Autor: XXXXXXXXX</label>
  <vaadin-button>
   Ver perfil
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
