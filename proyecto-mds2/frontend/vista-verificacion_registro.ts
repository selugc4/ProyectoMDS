import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-verificacion_registro')
export class VistaVerificacion_registro extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-shrink: 0;">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding: var(--lumo-space-xl); ">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
    <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Confirmación de registro</label>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1; align-items: center;">
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <label style="align-self: center;">Se ha enviado un correo a su email con</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
     <label>un código para verificar sus datos</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; align-self: flex-start;">
    <label style="width: 100%; margin-top: var(--lumo-space-s);">Código </label>
    <vaadin-text-field placeholder="Código"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button style="width: 100%;">
       Volver a enviar código 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
    <vaadin-password-field label="Contrase�a" placeholder="Contrase�a" value="secret1" minlength="10" has-value style="width: 100%;"></vaadin-password-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="flex-direction: row; justify-content: space-between; flex-shrink: 0; align-self: stretch;" theme="spacing-xl">
    <vaadin-button style="flex-shrink: 1; flex-grow: 1;">
      Volver atrás 
    </vaadin-button>
    <vaadin-button style="flex-grow: 1;">
      Aceptar 
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
