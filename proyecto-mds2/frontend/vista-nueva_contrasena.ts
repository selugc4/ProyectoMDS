import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-nueva_contrasena')
export class VistaNueva_contrasena extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; padding: var(--lumo-space-xl); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Cambio de contraseña</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
   <label style="width: 100%; padding-top: var(--lumo-space-s);">Nueva contraseña</label>
   <vaadin-text-field error-message="Please enter a value" invalid="" style="flex-grow: 0; flex-shrink: 0; width: 50%;" placeholder="Contraseña"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%; align-self: flex-end;">
   <vaadin-progress-bar></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;">
   <label>Su contraseña tiene un nivel X<label>de seguridad</label></label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
   <label style="flex-shrink: 1; flex-grow: 0; padding-top: var(--lumo-space-s);">Confirmar nueva contraseña</label>
   <vaadin-text-field error-message="Please enter a value" invalid="" placeholder="Nueva contraseña" style="width: 55%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl">
   <vaadin-vertical-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; flex-grow: 0; flex-shrink: 1; align-items: center;">
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
      <label>No está permitido introducir</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
      <label style="flex-shrink: 1;">palabras malsonantes como</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
      <label>contraseña.</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing">
    <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;">
     <vaadin-horizontal-layout theme="spacing">
      <label>10 caracteres, 3 especiales,</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
      <label>mayúsculas y minúsculas</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: stretch;" theme="spacing-xl">
   <vaadin-button style="width: 100%;">
     Volver atrás 
   </vaadin-button>
   <vaadin-button style="width: 100%;">
     Confirmar contraseña 
   </vaadin-button>
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
