import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_dar_alta_album')
export class VistaVista_dar_alta_album extends LitElement {
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
  <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; margin-left: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="font-size: 30px; font-weight: bolder">Añadir Álbum</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
    <label style="flex-shrink: 1; width: 100%;">Título</label>
    <vaadin-text-field required invalid="" style="width: 100%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
    <label style="flex-shrink: 1; width: 100%;">Nombre del artista</label>
    <vaadin-text-field required invalid="" style="width: 100%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 60%; flex-direction: row; align-items: center; justify-content: space-between;">
    <vaadin-vertical-layout theme="spacing">
     <label style="flex-shrink: 1; width: 100%;">Imagen</label>
     <vaadin-upload></vaadin-upload>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 60%; align-items: center; flex-direction: row; justify-content: space-between;">
    <label style="width: 100%;">Lista de canciones</label>
    <vaadin-button style="width: 40%;">
      Añadir Canción 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 75%;">
    <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 100%; border: 1px solid black;"></vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; height: 50%;">
    <vaadin-vertical-layout theme="spacing" style="align-items: center;">
     <vaadin-date-picker label="Fecha de Edición" placeholder="Fecha"></vaadin-date-picker>
     <vaadin-button>
       Asignar fecha 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Añadir Álbum 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Volver atrás 
     </vaadin-button>
    </vaadin-horizontal-layout>
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
