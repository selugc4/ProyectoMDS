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
    	  width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; margin-left: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
    <label style="font-size: 30px; font-weight: bolder; width: 100%;" id="label">Añadir Álbum</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout2">
    <label style="flex-shrink: 1; width: 100%;" id="label1">Título</label>
    <vaadin-text-field required invalid="" style="width: 100%;" id="vaadinTextField"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout3">
    <label style="flex-shrink: 1; width: 100%;" id="label2">Nombre del artista</label>
    <vaadin-text-field required invalid="" style="width: 100%;" id="vaadinTextField1"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-direction: row; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout4">
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%; flex-shrink: 1;">
     <label style="flex-shrink: 1; width: 100%;" id="label3">Imagen</label>
     <vaadin-upload id="vaadinUpload" style="width: 90%; flex-shrink: 1;"></vaadin-upload>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3"></vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; flex-direction: row; justify-content: space-between;" id="vaadinHorizontalLayout5">
    <label style="width: 100%;" id="label4">Lista de canciones</label>
    <vaadin-button style="width: 100%;" id="botonLista">
      Añadir Canción 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout6">
    <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 100%; border: 1px solid black;" id="verticalListado"></vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;" id="vaadinVerticalLayout5">
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; height: 50%;" id="vaadinHorizontalLayout7">
    <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout6">
     <vaadin-date-picker label="Fecha de Edición" placeholder="Fecha" id="fechaDeEdicion" opened></vaadin-date-picker>
     <vaadin-button id="botonFecha">
       Asignar fecha 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout7">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout8">
     <vaadin-button id="botonAdd" style="width: 100%;">
       Añadir Álbum 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout9">
     <vaadin-button id="botonVolver">
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
