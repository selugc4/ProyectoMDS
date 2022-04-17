import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';

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
<vaadin-vertical-layout style="width: 100%;" id="vertical">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 100%; padding: var(--lumo-space-xl);" id="verticalContenedor">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalTitulo">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="labelTitulo">Iniciar Sesión</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center;" id="vaadinHorizontalLayout2">
   <label style="width: 100%;" id="labelUsuario">Nombre de usuario</label>
   <vaadin-text-field error-message="Introduce un valor" invalid="" style="flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-m);" placeholder="Usuario" id="tfUsuario" required></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center;" id="horizontalPass">
   <label style="flex-shrink: 1; flex-grow: 0; width: 100%;" id="labelPass">Contraseña</label>
   <vaadin-password-field label="" placeholder="Contraseña" value="" id="tfPass"></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="align-self: flex-start; width: 100%; height: 50px;" id="horizontalLogin">
   <img style="height: 100%;" src="https://cdn-icons-png.flaticon.com/512/2991/2991148.png" id="imgGoogle">
   <img style="height: 100%;" src="https://cdn-icons-png.flaticon.com/512/124/124010.png" id="imgFace">
   <img style="height: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/814px-Apple_logo_black.svg.png" id="imgApple">
   <vaadin-button style="width: 100%; padding: var(--lumo-space-xs);" id="buttonLogin">
     Iniciar Sesión 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="horizontalRecuperar">
   <label style="width: 100%;" id="labelRecuperar">¿Ha olvidado su contraseña?</label>
   <vaadin-button style="width: 100%; padding: var(--lumo-space-xs);" id="botonRecuperar">
     Recuperar cuenta 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="align-items: center; align-self: center; width: 100%;">
   <label style="align-self: center;" id="labelRegistro">¿No tienes cuenta?</label>
   <vaadin-button style="height: 100%;" id="botonRegistro">
     Regístrate aquí 
   </vaadin-button>
   <vaadin-button id="botonVolver">
     Volver atrás 
   </vaadin-button>
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
