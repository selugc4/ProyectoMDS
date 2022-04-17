import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera_cibernauta')
export class VistaCabecera_cibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; flex-direction: row;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; flex-grow: 1; justify-content: space-between; align-self: center;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <img style="flex-grow: 0; flex-shrink: 1; align-self: center; height: 125px; width: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%;">
   <vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-s); padding: var(--lumo-space-m); margin-left: var(--lumo-space-s); flex-grow: 1;" id="vaadinVerticalLayout1">
    <label style="flex-grow: 0;" id="label">Contacto</label>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2">
     <label style="width: 115pt; flex-grow: 0;" id="label1">Teléfono: XXXXXXXXX</label>
    </vaadin-vertical-layout>
    <label style="width: 150pt; flex-grow: 0;" id="label2">Correo: correo@xxxxx.xxx</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: center; justify-content: space-between;" id="vaadinHorizontalLayout3">
   <vaadin-horizontal-layout theme="spacing-xl" style="justify-content: flex-end; flex-grow: 0;" id="vaadinHorizontalLayout5">
    <vaadin-button style="margin-right: var(--lumo-space-xl);" id="vaadinButton">
      Registrarse 
    </vaadin-button>
    <vaadin-button style="margin-right: var(--lumo-space-xl);" id="vaadinButton1">
      Iniciar Sesión 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
