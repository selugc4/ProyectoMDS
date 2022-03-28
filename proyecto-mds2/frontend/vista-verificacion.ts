import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-verificacion')
export class VistaVerificacion extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; align-items: center; padding: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Titulo Verificacion</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
    <label style="align-self: center;">Descripción verificación</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
    <label>Descripción verificación</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; align-self: center; flex-direction: row; align-items: center;">
   <label style="width: 100%; margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-xl);">Código</label>
   <vaadin-text-field placeholder="Código" style="margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 30%;"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);">
    <vaadin-button>
     Volver a enviar código
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
   <vaadin-password-field label="Contrase?a" placeholder="Contrase?a" value="secret1" minlength="10" has-value style="width: 100%;"></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; align-self: center; align-items: center; justify-content: space-between;" theme="spacing-xl">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);">
     Volver atr�s 
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);">
     Aceptar 
   </vaadin-button>
   <vaadin-button>
    Cambiar contraseña 
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
