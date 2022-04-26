import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-listas_de_reproduccion')
export class VistaListas_de_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="padding: var(--lumo-space-s); margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-xl); margin-left: 6%;">
  <label id="label">Listas de reproducción</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="margin-right: var(--lumo-space-xl); margin-left: 6%; padding: var(--lumo-space-s);"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
