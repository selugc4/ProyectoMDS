import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-estilo')
export class VistaEstilo extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="vaadinHorizontalLayout1">
   <label style="width: 100%;" id="label">Estilo </label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout2">
    <vaadin-button style="width: 100%;" id="vaadinButton">
      Modificar 
    </vaadin-button>
    <vaadin-button style="width: 100%;" id="vaadinButton1">
      Eliminar 
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
