import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscador_cancion_administracion')
export class VistaBuscador_cancion_administracion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 70%;">
   <label style="font-size: 30px; font-weight: bold; margin-left: var(--lumo-space-xl);">Estilo 1</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button style="width: 60%;">
    Modificar
   </vaadin-button>
   <vaadin-button style="width: 60%;">
    Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 70%;">
   <label style="font-size: 30px; font-weight: bold; margin-left: var(--lumo-space-xl);">Estilo 2</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button style="width: 60%;">
     Modificar 
   </vaadin-button>
   <vaadin-button style="width: 60%;">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 70%;">
   <label style="font-size: 30px; font-weight: bold; margin-left: var(--lumo-space-xl);">Estilo 3</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button style="width: 60%;">
     Modificar 
   </vaadin-button>
   <vaadin-button style="width: 60%;">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 70%;">
   <label style="font-size: 30px; font-weight: bold; margin-left: var(--lumo-space-xl);">Estilo 4 </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button style="width: 60%;">
     Modificar 
   </vaadin-button>
   <vaadin-button style="width: 60%;">
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
