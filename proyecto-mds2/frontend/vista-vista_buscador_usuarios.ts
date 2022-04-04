import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_buscador_usuarios')
export class VistaVista_buscador_usuarios extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; flex-shrink: 0; flex-grow: 1; height: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;" id="vaadinHorizontalLayout">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; flex-shrink: 1;" id="vaadinHorizontalLayout1">
    <label style="font-size: 30px;" id="label">Buscador usuario: </label>
    <vaadin-text-field placeholder="Search" style="width: 15%;" id="vaadinTextField">
     <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
    </vaadin-text-field>
   </vaadin-horizontal-layout>
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
