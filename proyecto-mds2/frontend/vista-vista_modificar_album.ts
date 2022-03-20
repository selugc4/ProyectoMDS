import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comun';
import './vista-reproductor_completo';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-vista_modificar_album')
export class VistaVista_modificar_album extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; margin-left: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="font-size: 30px; font-weight: bolder">Modificar Álbum</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
    <label style="flex-shrink: 1; width: 100%;">Título</label>
    <vaadin-text-field invalid="" style="width: 100%;" placeholder="Título"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
    <label style="flex-shrink: 1; width: 100%;">Nombre del artista</label>
    <vaadin-text-field invalid="" style="width: 100%;" placeholder="Nombre del artista"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; height: 50%;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <label style="width: 100%;">Fecha de Edición</label>
     <vaadin-date-picker placeholder="Fecha" style="width: 100%;"></vaadin-date-picker>
    </vaadin-horizontal-layout>
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
   <vaadin-horizontal-layout theme="spacing" style="width: 75%; align-items: center; flex-direction: row; justify-content: space-between;">
    <label style="width: 100%;">Lista de canciones</label>
    <vaadin-button style="width: 40%;">
     Añadir Canción
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 75%;">
    <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 100%; border: 1px solid black;">
     <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); align-items: center;">
      <label style="width: 100%;">Canción 1</label>
      <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; height: 100%;">
       <iron-icon style="height: 100%; width: 100%;" src="https://w7.pngwing.com/pngs/241/639/png-transparent-bin-icon-computer-icons-desktop-button-free-high-quality-remove-icon-miscellaneous-text-rectangle.png"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); align-items: center;">
      <label style="width: 100%;">Canción 2</label>
      <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; height: 100%;">
       <iron-icon style="height: 100%; width: 100%;" src="https://w7.pngwing.com/pngs/241/639/png-transparent-bin-icon-computer-icons-desktop-button-free-high-quality-remove-icon-miscellaneous-text-rectangle.png"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); align-items: center;">
      <label style="width: 100%;">Canción 3</label>
      <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; height: 100%;">
       <iron-icon style="height: 100%; width: 100%;" src="https://w7.pngwing.com/pngs/241/639/png-transparent-bin-icon-computer-icons-desktop-button-free-high-quality-remove-icon-miscellaneous-text-rectangle.png"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); align-items: center;">
      <label style="width: 100%;">Canción 4</label>
      <vaadin-button theme="icon" aria-label="Add new" style="width: 10%; height: 100%;">
       <iron-icon style="height: 100%; width: 100%;" src="https://w7.pngwing.com/pngs/241/639/png-transparent-bin-icon-computer-icons-desktop-button-free-high-quality-remove-icon-miscellaneous-text-rectangle.png"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;">
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <vaadin-button>
      Modificar Álbum
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
 <vaadin-horizontal-layout style="width: 100%;">
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
