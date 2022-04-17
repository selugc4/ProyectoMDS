import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-upload/src/vaadin-upload-file.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="verticalPrincipal">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-xl);" id="verticalContenedor">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalTitulo">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="tituloRegistro">Registro</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center;" id="horizontalEmail">
   <label style="width: 100%;" id="labelEmail">Email*</label>
   <vaadin-text-field error-message="Introduzca un valor" required invalid="" style="flex-grow: 0; flex-shrink: 0;" id="tfemail" placeholder="Email"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center;" id="horizontalUsuario">
   <label style="flex-shrink: 1; flex-grow: 0; width: 100%;" id="labelUsuario">Nombre de usuario*</label>
   <vaadin-text-field error-message="Introduzca un valor" required invalid="" id="tfusuario" placeholder="Usuario"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vertticalMalsonantes">
   <label id="labelMalsonante1">No está permitido introducir</label>
   <label id="labelMalsonante2">palabras malsonantes como</label>
   <label id="labelMalsonante3">nombre de usuario y contraseña.</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; align-self: flex-start; align-items: center;" id="horizontalcontrasena">
   <label style="width: 100%;" id="labelPass">Contraseña*</label>
   <vaadin-password-field label="Contraseña" placeholder="Enter password" style="flex-grow: 0; flex-shrink: 1; width: 100%;" minlength="10" has-value id="tfcontrasena1"></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center;" id="verticalcaracteres">
   <vaadin-horizontal-layout theme="spacing" id="horizontalcarac1">
    <label id="labelcaracteres1">10 caracteres, 3 especiales,</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="horizontalcarac2">
    <label id="labelcaracteres11">mayúsculas y minúsculas</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center; width: 100%;" id="verticalSeguridad">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;" id="horizontalbarra">
    <vaadin-progress-bar style="width: 100%;" id="vaadinProgressBar"></vaadin-progress-bar>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-m);" id="horizontalNivel">
    <label style="flex-shrink: 1; width: 100%; padding-left: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" id="NivelSec">Nivel de seguridad</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-items: center;" id="horizontalccontrasena">
   <label style="width: 90%;" id="labelConfPass">Confirmar contraseña*</label>
   <vaadin-password-field placeholder="Contraseña" minlength="10" has-value style="width: 100%;" id="tfccontrasena"></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="flex-direction: row;" id="horizontalFoto">
   <label id="labelfoto">Foto</label>
   <vaadin-horizontal-layout theme="spacing-l" style="align-items: flex-start; height: 100%;" id="horizontalUpload">
    <vaadin-upload style="width: 100%; height: 100%;" id="vaadinUpload"></vaadin-upload>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="horizontalimg">
    <img style="height:100px" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);" id="horizontalRegistrarse">
   <vaadin-button id="botonRegistro">
     Registrarse 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: center; margin-top: var(--lumo-space-xl);" id="horizontalAtras">
   <vaadin-button id="botonVolver">
     Volver atrás 
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
