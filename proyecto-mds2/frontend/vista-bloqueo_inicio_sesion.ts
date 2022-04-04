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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; align-self: center; margin-top: var(--lumo-space-m); padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout">
   <label style="flex-shrink: 1; flex-grow: 0;" id="label1">Su cuenta ha sido bloqueada por sobrepasar los límites de</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <label style="flex-shrink: 1; flex-grow: 0;" id="label">intentos de inicio de sesión. Su cuenta estará bloqueada durante</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
   <label style="flex-shrink: 1; flex-grow: 0;" id="label2">x minutos. Tiempo restante:</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout3">
   <label style="flex-shrink: 1; flex-grow: 0;" id="label3">xx:xx/xx:xx</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout4">
   <vaadin-progress-bar style="width: 100%; height: 50%;" value="1" id="vaadinProgressBar"></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: stretch;" theme="spacing-xl" id="vaadinHorizontalLayout5">
   <vaadin-button style="width: 100%;" id="vaadinButton">
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
