import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-notificacion')
export class VistaNotificacion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%; justify-content: space-between;">
  <label style="width: 100%;">Notificacion</label>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-m);">
   <iron-icon src="https://th.bing.com/th/id/OIP.VjTIUIy0B4o3IZR-Hjc-AgHaHa?pid=ImgDet&amp;rs=1"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
