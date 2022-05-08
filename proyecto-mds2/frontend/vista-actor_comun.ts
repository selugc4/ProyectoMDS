import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-actor_comun')
export class VistaActor_comun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
    	  width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout1"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-self: flex-end;">
  <vaadin-button id="vaadinButton" style="align-self: flex-end;">
    Ver estadísticas 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
