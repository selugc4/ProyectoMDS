import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver_creditos')
export class VistaVer_creditos extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-xl); height: 11%; margin-bottom: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing">
   <label>Título de canción </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%;">
   <label style="width: 100%; height: 100%;">Texto de ejemplo donde iría el título de la canción</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; height: 11%; margin-bottom: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <label>Título del álbum</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <label style="width: 100%; height: 100%;">Texto de ejemplo donde iría el título del álbum</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; height: 11%; margin-bottom: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing">
   <label>Compositores</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <label style="width: 100%; height: 100%;">Texto de ejemplo donde iría el nombre de los compositores</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; height: 11%; margin-bottom: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing">
   <label>Productores</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <label style="width: 100%; height: 100%;">Texto de ejemplo donde iría el nombre de los productores</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; flex-shrink: 0; height: 11%; margin-bottom: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing">
   <label>Intérpretes</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <label style="width: 100%; height: 100%;">Texto de ejemplo donde iría el nombre de los intérpretes</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
