import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuario')
export class VistaUsuario extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
   <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png" id="img">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="vaadinHorizontalLayout1">
   <label id="label">Usuario</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
   <vaadin-button id="vaadinButton">
     Editar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
   <vaadin-button id="vaadinButton1">
     Eliminar 
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
