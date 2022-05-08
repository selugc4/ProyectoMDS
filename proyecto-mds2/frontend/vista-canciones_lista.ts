import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-canciones_lista')
export class VistaCanciones_lista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);" id="vaadinVerticalLayout">
 <label id="label">Canciones</label>
 <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <label style="font-size: 35px;" id="label1">No se han añadido canciones a esta lista de reproducción</label>
  <vaadin-button style="align-self: center;" id="vaadinButton">
    Modificar lista 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
