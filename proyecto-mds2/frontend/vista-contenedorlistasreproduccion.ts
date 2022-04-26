import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-contenedorlistasreproduccion')
export class VistaContenedorlistasreproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: column;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin: var(--lumo-space-xl); padding: var(--lumo-space-s);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
