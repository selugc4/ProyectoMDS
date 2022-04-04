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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; align-items: center; padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="label">Titulo Verificacion</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1; align-items: center;" id="vaadinVerticalLayout2">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout1">
    <label style="align-self: center;" id="label1">Descripción verificación</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout2">
    <label id="label2">Descripción verificación</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; align-self: center; flex-direction: row; align-items: center;" id="vaadinHorizontalLayout3">
   <label style="width: 100%; margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-xl);" id="label3">Código</label>
   <vaadin-text-field placeholder="Código" style="margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 30%;" id="vaadinTextField"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);" id="vaadinHorizontalLayout4">
    <vaadin-button id="vaadinButton">
      Volver a enviar código 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="vaadinHorizontalLayout5">
   <vaadin-password-field label="Contrase?a" placeholder="Contrase?a" value="secret1" minlength="10" has-value style="width: 100%;" id="contraseA"></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; align-self: center; align-items: center; justify-content: space-between;" theme="spacing-xl" id="vaadinHorizontalLayout6">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);" id="vaadinButton1">
     Volver atr�s 
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="vaadinButton3">
     Aceptar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2">
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
