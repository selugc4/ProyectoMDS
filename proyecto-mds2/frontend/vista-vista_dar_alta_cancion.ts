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
          width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout style="flex-grow: 0; width: 100%; height: 100%; justify-content: space-between;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-m); align-self: flex-start;" id="vaadinHorizontalLayout1">
    <label style="font-size: 30px; font-weight: bolder;" id="label">Añadir Canción</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 1; justify-content: space-between; padding: var(--lumo-space-s);" id="vaadinHorizontalLayout2">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; width: 100%; flex-direction: row;" id="vaadinHorizontalLayout3">
     <label style="flex-grow: 0; width: 100%; padding: var(--lumo-space-s); flex-shrink: 1;" id="label1">Título</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0;" id="vaadinHorizontalLayout4">
     <vaadin-text-field required invalid="" style="flex-direction: row; flex-grow: 0; flex-shrink: 0; width: 100%;" id="vaadinTextField"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout5">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout6">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label2">Título de canción (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout7">
     <vaadin-text-field required invalid="" style="width: 100%;" id="vaadinTextField1"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout8">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout9">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label3">Título de álbum (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout10">
     <vaadin-text-field required invalid="" style="width: 100%;" id="vaadinTextField2"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%; height: 15%;" id="vaadinHorizontalLayout11">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout12">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label4">Compositores (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout13">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 100%;" id="vaadinTextArea" required></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%; height: 15%;" id="vaadinHorizontalLayout14">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout15">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label5">Productores (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout16">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 100%;" id="vaadinTextArea1" required></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%; height: 15%;" id="vaadinHorizontalLayout17">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout18">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label6">Intérpretes (créditos)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout19">
     <vaadin-text-area label="" placeholder="" style="width: 100%; height: 100%;" id="vaadinTextArea2" required></vaadin-text-area>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: flex-end; height: 100%; align-self: center;" id="vaadinVerticalLayout3">
    <label style="align-self: center; font-size: 25px; font-weight: bolder; flex-grow: 0;" id="label7">Archivo multimedia de la canción</label>
    <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout20">
     <vaadin-upload id="vaadinUpload"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout style="align-self: center; padding: var(--lumo-space-s);" id="vaadinVerticalLayout4">
     <vaadin-horizontal-layout style="align-self: flex-start;" id="vaadinHorizontalLayout21">
      <label style="align-self: center;" id="label8">Los formatos de los archivos permitidos</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout22">
      <label id="label9">son: .mp3, .mp4, .ogg. </label>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; height: 100%; justify-content: flex-end;" id="vaadinVerticalLayout5">
    <vaadin-button style="align-self: center; width: 50%; height: 10%;" id="vaadinButton">
      Añadir canción 
    </vaadin-button>
    <vaadin-button style="align-self: center; flex-shrink: 1; width: 50%; height: 10%;" id="vaadinButton1">
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
