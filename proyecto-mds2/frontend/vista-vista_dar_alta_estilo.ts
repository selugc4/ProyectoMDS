import { LitElement, html, css, customElement } from 'lit-element';
import './vista-reproductor_completo';
import './vista-cabecera_comun';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-vista_dar_alta_estilo')
export class VistaVista_dar_alta_estilo extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vista-cabecera_comun style="width: 100%; margin-bottom: var(--lumo-space-xl);"></vista-cabecera_comun>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl); justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); width: 30%; align-items: center; height: 40%; border: 1px solid black">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
    <label style="font-size: 30px; font-weight: bolder; width: 100%; height: 100%;">Añadir Estilo</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-items: center; margin-bottom: var(--lumo-space-xl); align-self: flex-start; justify-content: space-between;">
    <label style="flex-grow: 1;">Estilo</label>
    <vaadin-text-field required invalid="" style="width: 50%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
    <vaadin-button style="width: 100%;">
     Añadir estilo
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
    <vaadin-button style="width: 100%;">
     Volver atrás
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vista-reproductor_completo style="width: 100%;"></vista-reproductor_completo>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
