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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vertical">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; align-items: center; padding: var(--lumo-space-xl);" id="verticalContenedor">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalTitulo">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px" id="labelTitulo">Titulo Verificacion</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 0; flex-shrink: 1; align-items: center;" id="verticalDescripciones">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="horizontalDesc1">
    <label style="align-self: center;" id="labelDesc1">Descripción verificación</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="horizontalDesc2">
    <label id="labelDesc2">Descripción verificación</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; align-self: center; flex-direction: row; align-items: center;" id="horizontalCodigo">
   <label style="width: 100%; margin-top: var(--lumo-space-s); margin-right: var(--lumo-space-xl);" id="labelCodigo">Código</label>
   <vaadin-text-field placeholder="Código" style="margin-right: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); width: 30%;" id="tfCodigo"></vaadin-text-field>
   <vaadin-button id="botonVolverEnviar">
     Volver a enviar código 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; align-self: center; align-items: center; justify-content: space-between;" theme="spacing-xl" id="vaadinHorizontalLayout6">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);" id="botonVolver">
    Volver atrás
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="botonAceptar">
     Aceptar 
   </vaadin-button>
   <vaadin-button id="botonCContrasena">
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
