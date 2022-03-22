import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-vista_administracion')
export class VistaVista_administracion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout theme="spacing-xl" style="margin-bottom: var(--lumo-space-xl); align-self: flex-start; align-items: flex-start; flex-direction: column; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-self: center;">
   <vaadin-button style="width: 100%; height: 100%;">
     Dar de alta 
   </vaadin-button>
   <vaadin-button style="width: 100%; height: 100%;">
     Modificar/Dar de baja usuarios 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-items: center; justify-content: flex-start; align-self: center; width: 80%;">
   <label style="flex-grow: 0; margin-right: var(--lumo-space-xl);">Número de canciones mostradas a usuarios no registrados</label>
   <vaadin-text-field required invalid="" style="width: 30%;" placeholder="Número actual"></vaadin-text-field>
   <vaadin-button style="width: 10%;">
     Modificar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-items: center; justify-content: flex-start; align-self: center; width: 80%; margin-bottom: var(--lumo-space-xl);">
   <label>Número de canciones reproducibles por usuarios no registrados</label>
   <vaadin-text-field required invalid="" style="width: 30%;" placeholder="Número actual"></vaadin-text-field>
   <vaadin-button style="width: 10%; flex-shrink: 0; flex-grow: 0;">
     Modificar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-items: center; justify-content: flex-start; align-self: center; width: 80%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 70%; align-items: center;">
    <label>Modificar canciones para el cibernauta</label>
    <vaadin-button style="flex-shrink: 0; flex-grow: 0;">
      Añadir canción 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;">
    <label>Buscador por estilos </label>
    <vaadin-text-field placeholder="Estilos" style="width: 30%;">
     <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
    </vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
