import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_comun';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';

@customElement('vista-bloqueo_inicio_sesion')
export class VistaBloqueo_inicio_sesion extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; align-self: center; margin-top: var(--lumo-space-m); padding: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
   <label style="flex-shrink: 1; flex-grow: 0;">Su cuenta ha sido bloqueada por sobrepasar los límites de</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <label style="flex-shrink: 1; flex-grow: 0;">intentos de inicio de sesión. Su cuenta estará bloqueada durante</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <label style="flex-shrink: 1; flex-grow: 0;">x minutos. Tiempo restante:</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
   <label style="flex-shrink: 1; flex-grow: 0;">xx:xx/xx:xx</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-progress-bar style="width: 100%; height: 50%;" value="1"></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: stretch;" theme="spacing-xl">
   <vaadin-button style="width: 100%;">
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
