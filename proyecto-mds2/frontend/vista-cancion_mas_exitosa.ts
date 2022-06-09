import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_mas_exitosa')
export class VistaCancion_mas_exitosa extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="vaadinHorizontalLayout">
 <img id="img" style="margin: var(--lumo-space-xl); width: 150px; height: 150px;">
 <label style="margin: var(--lumo-space-xl);" id="label">Título canción</label>
 <label style="margin: var(--lumo-space-xl);" id="label1">Número de reproducciones</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
