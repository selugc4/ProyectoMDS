import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion')
export class VistaCancion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%;" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%;" id="vaadinHorizontalLayout1">
  <label style="margin-right: var(--lumo-space-xl); width: 100%;" id="label">Cancion</label>
  <vaadin-button theme="icon" aria-label="Add new" style="border: none; background-color: none; margin-left: var(--lumo-space-xl); width: 100%;" id="vaadinButton">
   <iron-icon src="https://cdn-icons-png.flaticon.com/512/18/18297.png" id="ironIcon"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
