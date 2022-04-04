import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing-xl" style="width: 100%; margin-left: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <label style="font-size: 30px; font-weight: bolder" id="label">Modificar Álbum</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout2">
    <label style="flex-shrink: 1; width: 100%;" id="label1">Título</label>
    <vaadin-text-field invalid="" style="width: 100%;" placeholder="Título" id="vaadinTextField"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout3">
    <label style="flex-shrink: 1; width: 100%;" id="label2">Nombre del artista</label>
    <vaadin-text-field invalid="" style="width: 100%;" placeholder="Nombre del artista" id="vaadinTextField1"></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%;" id="vaadinHorizontalLayout4">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout5">
     <label style="width: 100%;" id="label3">Fecha de Edición</label>
     <vaadin-date-picker placeholder="Fecha" style="width: 100%;" id="vaadinDatePicker"></vaadin-date-picker>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 60%; flex-direction: row; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout6">
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2">
     <label style="flex-shrink: 1; width: 100%;" id="label4">Imagen</label>
     <vaadin-upload id="vaadinUpload"></vaadin-upload>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3">
     <img style="width: 125px; height: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 75%; align-items: center; flex-direction: row; justify-content: space-between;" id="vaadinHorizontalLayout7">
    <label style="width: 100%;" id="label5">Lista de canciones</label>
    <vaadin-button style="width: 40%;" id="vaadinButton">
      Añadir Canción 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; width: 100%; justify-content: flex-end;" id="vaadinVerticalLayout4">
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout5">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout8">
     <vaadin-button id="vaadinButton1">
       Modificar Álbum 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout9">
     <vaadin-button id="vaadinButton2">
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
