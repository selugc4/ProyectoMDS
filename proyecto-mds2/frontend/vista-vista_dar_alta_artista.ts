import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comun';
import './vista-reproductor_completo';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_dar_alta_artista')
export class VistaVista_dar_alta_artista extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-bottom: var(--lumo-space-xl);">
  <vista-cabecera_comun style="width: 100%;"></vista-cabecera_comun>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; justify-content: center; margin-bottom: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; border: 1px solid black; padding: var(--lumo-space-xl); width: 25%;">
   <vaadin-horizontal-layout theme="spacing">
    <label style="font-weight: bolder; font-size: 30px">Dar de alta al Artista</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Email*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field error-message="Please enter a value" required invalid=""></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Nombre de artista*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field error-message="Please enter a value" required invalid=""></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Contraseña*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field error-message="Please enter a value" required invalid=""></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;">Confirmar contraseña*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field error-message="Please enter a value" required invalid=""></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;">Estilo(s)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-text-field error-message="Please enter a value" required invalid=""></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="flex-direction: row; width: 100%; padding: var(--lumo-space-s); margin-bottom: var(--lumo-space-xl);">
    <label style="width: 100%; align-self: center; padding: var(--lumo-space-s);">Foto</label>
    <vaadin-horizontal-layout theme="spacing-l" style="align-items: flex-start; height: 100%; width: 100%;">
     <vaadin-upload style="width: 100%;"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%; padding: var(--lumo-space-s);">
     <img style="height:100px" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button>
     Dar de alta
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-button>
    Volver atrás
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vista-reproductor_completo style="width: 100%;"></vista-reproductor_completo>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}