import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_dar_alta_estilo')
export class VistaVista_dar_alta_estilo extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl); justify-content: center;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); width: 100%; align-items: center; height: 100%; border: 1px solid black;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout1">
    <label style="font-size: 30px; font-weight: bolder; width: 100%; height: 100%;" id="label">Añadir Estilo</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-items: center; margin-bottom: var(--lumo-space-xl); align-self: flex-start; justify-content: space-between;" id="vaadinHorizontalLayout2">
    <label style="flex-grow: 1;" id="label1">Estilo</label>
    <vaadin-text-field required invalid="" style="width: 50%;" id="vaadinTextField"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout3">
    <vaadin-button style="width: 100%;" id="vaadinButton">
      Añadir estilo 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout4">
    <vaadin-button style="width: 100%;" id="vaadinButton1">
      Volver atrás 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
