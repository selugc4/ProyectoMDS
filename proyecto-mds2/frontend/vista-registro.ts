import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload-file.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-registro')
export class VistaRegistro extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-xl);" id="vaadinVerticalLayout2">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
    <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="label">Registro</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
    <label style="padding-top: var(--lumo-space-xl); width: 100%;" id="label1">Email*</label>
    <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" style="flex-grow: 0; flex-shrink: 0;" id="required"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout2">
    <label style="flex-shrink: 1; flex-grow: 0; padding-top: var(--lumo-space-xl); width: 100%;" id="label2">Nombre de usuario*</label>
    <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" id="required1"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vaadinVerticalLayout3">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
     <label id="label3">No está permitido introducir</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
     <label id="label4">palabras malsonantes como</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout5">
     <label id="label5">nombre de usuario y contraseña.</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; align-self: flex-start;" id="vaadinHorizontalLayout6">
    <label style="padding-top: var(--lumo-space-l); width: 100%;" id="label6">Contraseña*</label>
    <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" style="flex-grow: 0; flex-shrink: 1; width: 100%;" minlength="10" has-value id="contraseña"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vaadinVerticalLayout4">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7">
     <label id="label7">10 caracteres, 3 especiales,</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout8">
     <label id="label8">mayúsculas y minúsculas</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center; width: 100%;" id="vaadinVerticalLayout5">
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;" id="vaadinHorizontalLayout9">
     <vaadin-progress-bar style="width: 100%;" id="vaadinProgressBar"></vaadin-progress-bar>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="align-self: center; margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);" id="vaadinHorizontalLayout10">
     <label style="flex-shrink: 1; width: 100%; margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);" id="label9">Nivel de seguridad</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="vaadinHorizontalLayout11">
    <label style="width: 90%; padding-top: var(--lumo-space-l);" id="label10">Confirmar contraseña*</label>
    <vaadin-password-field label="Contraseña" placeholder="Contraseña" value="secret1" minlength="10" has-value style="width: 100%;" id="contraseña1"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="flex-direction: row;" id="vaadinHorizontalLayout12">
    <label id="label11">Foto</label>
    <vaadin-horizontal-layout theme="spacing-l" style="align-items: flex-start; height: 75%;" id="vaadinHorizontalLayout13">
     <vaadin-upload style="width: 100%; height: 100%;" id="vaadinUpload"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout14">
     <img style="height:100px" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);" id="vaadinHorizontalLayout15">
    <vaadin-button id="vaadinButton">
      Registrarse 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);" id="vaadinHorizontalLayout16">
    <vaadin-button id="vaadinButton1">
      Volver atrás 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
