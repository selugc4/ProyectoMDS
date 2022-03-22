import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-iniciar_sesion')
export class VistaIniciar_sesion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; margin-top: var(--lumo-space-xl);">
   <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 100%; padding: var(--lumo-space-xl);">
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Iniciar Sesión</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;">
     <label style="padding-top: var(--lumo-space-l); width: 100%;">Nombre de usuario</label>
     <vaadin-text-field error-message="Please enter a value" invalid="" style="flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-m);" placeholder="Usuario"></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;">
     <label style="flex-shrink: 1; flex-grow: 0; width: 100%; margin-top: var(--lumo-space-m);">Contraseña</label>
     <vaadin-text-field error-message="Please enter a value" invalid="" style="margin-top: var(--lumo-space-s);" placeholder="Contraseña"></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="align-self: flex-start; width: 100%; height: 50px;">
     <vaadin-vertical-layout theme="spacing">
      <img style="height: 100%;" src="https://cdn-icons-png.flaticon.com/512/2991/2991148.png">
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <img style="height: 100%;" src="https://cdn-icons-png.flaticon.com/512/124/124010.png">
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <img style="height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/814px-Apple_logo_black.svg.png">
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing">
      <vaadin-button style="width: 100%; padding: var(--lumo-space-xs);">
        Iniciar Sesión 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;">
     <label style="width: 150%;">¿Ha olvidado su contraseña?</label>
     <vaadin-button style="width: 100%; padding: var(--lumo-space-xs);">
       Recuperar cuenta 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="flex-direction: row; align-self: center; flex-grow: 0;">
     <label style="align-self: center;">¿No tienes cuenta?</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="align-self: center;">
     <vaadin-button style="width: 100%; height: 100%;">
       Regístrate aquí 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="align-self: center;">
     <vaadin-button>
       Volver atrás 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
