import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion_con_imagen')
export class VistaCancion_con_imagen extends LitElement {
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
 <vaadin-vertical-layout theme="spacing">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAUhttps://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAU">
  <label>Título canción</label>
  <label>Nombre artista</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
