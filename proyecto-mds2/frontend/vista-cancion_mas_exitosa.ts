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
<vaadin-horizontal-layout theme="spacing" style="align-items: center;">
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAUhttps://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAU" style="margin: var(--lumo-space-xl);">
 <label style="margin: var(--lumo-space-xl);">Título canción</label>
 <label style="margin: var(--lumo-space-xl);">Número de reproducciones</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
