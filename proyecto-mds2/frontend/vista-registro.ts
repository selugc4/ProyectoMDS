import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_comun';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload-file.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 1; flex-grow: 1; flex-direction: row; justify-content: space-between; margin-bottom: var(--lumo-space-xl);">
  <vista-cabecera_comun style="width: 100%; height: 100%; flex-shrink: 1; flex-grow: 1;"></vista-cabecera_comun>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-xl); border: 1px solid black">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
    <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Registro</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;">
    <label style="padding-top: var(--lumo-space-xl); width: 100%;">Email*</label>
    <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required" style="flex-grow: 0; flex-shrink: 0;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;">
    <label style="flex-shrink: 1; flex-grow: 0; padding-top: var(--lumo-space-xl); width: 100%;">Nombre de usuario*</label>
    <vaadin-text-field error-message="Please enter a value" required invalid="" label="Required"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <label>No está permitido introducir</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <label>palabras malsonantes como</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <label>nombre de usuario y contraseña.</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; align-self: flex-start;">
    <label style="padding-top: var(--lumo-space-l); width: 100%;">Contraseña*</label>
    <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" style="flex-grow: 0; flex-shrink: 1; width: 100%;" minlength="10" has-value></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <label>10 caracteres, 3 especiales,</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <label>mayúsculas y minúsculas</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;">
     <vaadin-progress-bar style="width: 100%;"></vaadin-progress-bar>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="align-self: center; margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);">
     <label style="flex-shrink: 1; width: 100%; margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">Nivel de seguridad</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
    <label style="width: 90%; padding-top: var(--lumo-space-l);">Confirmar contraseña*</label>
    <vaadin-password-field label="Contraseña" placeholder="Contraseña" value="secret1" minlength="10" has-value style="width: 100%;"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="flex-direction: row;">
    <label>Foto</label>
    <vaadin-horizontal-layout theme="spacing-l" style="align-items: flex-start; height: 75%;">
     <vaadin-upload style="width: 100%; height: 100%;"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <img style="height:100px" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);">
    <vaadin-button>
      Registrarse 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);">
    <vaadin-button>
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
