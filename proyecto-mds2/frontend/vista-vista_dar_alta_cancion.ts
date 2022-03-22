import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_dar_alta_cancion')
export class VistaVista_dar_alta_cancion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);">
  <vaadin-vertical-layout style="flex-grow: 0; width: 100%; height: 100%; justify-content: space-between;">
   <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-m);">
    <label style="font-size: 30px; font-weight: bolder">Añadir Canción</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; padding: var(--lumo-space-m); flex-shrink: 1; justify-content: space-between;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 0; flex-shrink: 0;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;">Título</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
     <vaadin-text-field required invalid="" style="flex-direction: row; flex-grow: 0; flex-shrink: 0; width: 100%;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Título de canción (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
     <vaadin-text-field required invalid="" style="width: 100%;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Título de álbum (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
     <vaadin-text-field required invalid="" style="width: 100%;"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Compositores (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%;">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 120%;"></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Productores (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 120%;"></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Intérpretes (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 50%;">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 120%;"></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: flex-end; height: 100%; align-self: center;">
    <label style="align-self: center; font-size: 25px; font-weight: bolder; flex-grow: 0;">Archivo multimedia de la canción</label>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;">
     <vaadin-upload></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout style="align-self: center; padding: var(--lumo-space-s);">
     <vaadin-horizontal-layout style="align-self: flex-start;">
      <label style="align-self: center;">Los formatos de los archivos permitidos</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;">
      <label>son: .mp3, .mp4, .ogg. </label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; height: 100%; justify-content: flex-end;">
    <vaadin-button style="align-self: center; width: 25%; height: 10%;">
      Añadir canción 
    </vaadin-button>
    <vaadin-button style="align-self: center; flex-shrink: 1; width: 25%; height: 10%;">
      Volver atrás 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
