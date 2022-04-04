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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; padding: var(--lumo-space-xl); align-self: center;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="label">Cambio de contraseña</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="vaadinHorizontalLayout1">
   <label style="width: 100%; padding-top: var(--lumo-space-s);" id="label1">Nueva contraseña</label>
   <vaadin-text-field error-message="Please enter a value" invalid="" style="flex-grow: 0; flex-shrink: 0; width: 50%;" placeholder="Contraseña" id="vaadinTextField"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%; align-self: flex-end;" id="vaadinHorizontalLayout2">
   <vaadin-progress-bar id="vaadinProgressBar"></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;" id="vaadinHorizontalLayout3">
   <label id="label2">Su contraseña tiene un nivel X<label id="label3">de seguridad</label></label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="vaadinHorizontalLayout4">
   <label style="flex-shrink: 1; flex-grow: 0; padding-top: var(--lumo-space-s);" id="label4">Confirmar nueva contraseña</label>
   <vaadin-text-field error-message="Please enter a value" invalid="" placeholder="Nueva contraseña" style="width: 55%;" id="vaadinTextField1"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout5">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3">
    <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vaadinVerticalLayout2">
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout6">
      <label id="label5">No está permitido introducir</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout7">
      <label style="flex-shrink: 1;" id="label6">palabras malsonantes como</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout8">
      <label id="label7">contraseña.</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout4">
    <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vaadinVerticalLayout5">
     <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout9">
      <label id="label8">10 caracteres, 3 especiales,</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout10">
      <label id="label9">mayúsculas y minúsculas</label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: stretch;" theme="spacing-xl" id="vaadinHorizontalLayout11">
   <vaadin-button style="width: 100%;" id="vaadinButton">
     Volver atrás 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="vaadinButton1">
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
