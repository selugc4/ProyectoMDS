import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-evento')
export class VistaEvento extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: center;" id="vaadinHorizontalLayout">
 <label style="margin: var(--lumo-space-xl); width: 100%;" id="label">Concierto</label>
 <label style="margin: var(--lumo-space-xl); width: 100%;" id="label1">Fecha</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
