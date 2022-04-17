import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-recuperar_contrasena')
export class VistaRecuperar_contrasena extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; padding: var(--lumo-space-xl);" id="verticalCotenedor">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalTitulo">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px; align-self: center;" id="labelTitulo">Recuperar cuenta</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center; width: 100%;" id="horizontalCorreo">
   <label style="width: 100%; margin-right: var(--lumo-space-xl);" id="labelCorreo">Correo Electrónico</label>
   <vaadin-text-field placeholder="Email" style="margin-left: var(--lumo-space-xl);" id="tfCorreo"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; justify-content: space-between; align-items: center; align-self: center;" theme="spacing-xl" id="horizontalBotones">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);" id="botonVolver">
     Volver atrás 
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="botonConfirmar">
     Confirmar 
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
