import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-recupera_contrasena')
export class VistaRecupera_contrasena extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; padding: var(--lumo-space-xl); width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px">Recuperar cuenta</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center;">
   <label style="width: 100%; margin-right: var(--lumo-space-xl);">Correo Electrónico</label>
   <vaadin-text-field placeholder="Email" style="width: 100%; margin-left: var(--lumo-space-xl);"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; justify-content: space-between; align-items: center; align-self: center;" theme="spacing-xl">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);">
    Volver atrás
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);">
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
