import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vertical">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; padding: var(--lumo-space-xl); align-self: center;" id="verticalContenedor">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout" dir="horizontalTitulo">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="labelTitulo">Cambio de contraseña</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="horizontalPass">
   <label style="width: 100%; padding-top: var(--lumo-space-s);" id="labelPass">Nueva contraseña</label>
   <vaadin-password-field placeholder="Contraseña" value="secret1" id="tfPass" has-value></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%; align-self: flex-end;" id="horizontalBarra">
   <vaadin-progress-bar id="vaadinProgressBar"></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 50%;" id="horizontalSec">
   <label id="labelSec1">Su contraseña tiene un nivel de seguridad</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="horizontalCC">
   <label style="flex-shrink: 1; flex-grow: 0; padding-top: var(--lumo-space-s);" id="labelCC">Confirmar nueva contraseña</label>
   <vaadin-password-field placeholder="Contraseña" value="secret1" id="tfPassC" has-value></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="horizontalCaracteres">
   <vaadin-vertical-layout theme="spacing" id="verticalIzquierdo">
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="horizontalIzq1">
     <label id="labelIzq1">No está permitido introducir</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="horizontalIzq2">
     <label style="flex-shrink: 1;" id="labelIzq2">palabras malsonantes como</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="horizontalIzq3">
     <label id="labelIzq3">contraseña.</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="verticalDcha">
    <vaadin-horizontal-layout theme="spacing" id="horizontalDcha1">
     <label id="labelDcha1">10 caracteres, 3 especiales,</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="horizontalDcha2">
     <label id="labelDcha2">mayúsculas y minúsculas</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: stretch;" theme="spacing-xl" id="horizontalBoton">
   <vaadin-button style="width: 100%;" id="botonVolver">
     Volver atrás 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="botonConfirmar">
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
