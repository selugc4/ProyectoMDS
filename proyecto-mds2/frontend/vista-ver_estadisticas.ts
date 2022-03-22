import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-split-layout/src/vaadin-split-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_estadisticas')
export class VistaVer_estadisticas extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); margin: var(--lumo-space-xl);">
  <label style="font-size:50px; font-weight:bolder;">Tus estadísticas</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 94%; margin: var(--lumo-space-xl); align-self: flex-end;">
  <vaadin-vertical-layout theme="spacing" style="width: 75%; align-self: center;">
   <vaadin-split-layout theme="minimal" style="width: 100%;">
    <label style="font-size: 25px;">Estilo más escuchado:</label>
    <label style="font-size: 25px; font-weight:bold;">Estilo más escuchado</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;">
    <label style="font-size: 25px">Artista más escuchado:</label>
    <label style="font-size: 25px; font-weight:bold;">Artista más escuchado</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;">
    <label style="font-size: 25px">Canción más escuchada:</label>
    <label style="font-size: 25px; font-weight:bold;">Canción más escuchada</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;">
    <label style="font-size: 25px">Horas escuchadas:</label>
    <label style="font-size: 25px; font-weight:bold;">Horas escuchadas</label>
   </vaadin-split-layout>
  </vaadin-vertical-layout>
  <vaadin-button style="align-self: center;">
   Volver atrás
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
