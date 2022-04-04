import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_modificar_cancion')
export class VistaVista_modificar_cancion extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 1;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout style="flex-grow: 0; width: 100%; height: 100%; justify-content: space-between;" id="vaadinVerticalLayout1">
    <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-m);" id="vaadinHorizontalLayout2">
     <label style="font-size: 30px; font-weight: bolder" id="label">Modificar Canción</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 100%; padding: var(--lumo-space-m); flex-shrink: 1; justify-content: space-between;" id="vaadinHorizontalLayout3">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 0; flex-shrink: 0;" id="vaadinHorizontalLayout4">
      <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label1">Título</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout5">
      <vaadin-text-field invalid="" style="flex-direction: row; flex-grow: 0; flex-shrink: 0; width: 100%;" placeholder="Título Cancion" id="vaadinTextField"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout6">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;" id="vaadinHorizontalLayout7">
      <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label2">Título de canción (créditos)</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout8">
      <vaadin-text-field invalid="" style="width: 100%;" placeholder="Título" id="vaadinTextField1"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout9">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;" id="vaadinHorizontalLayout10">
      <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label3">Título de Álbum (créditos)</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout11">
      <vaadin-text-field invalid="" style="width: 100%;" placeholder="Título" id="vaadinTextField2"></vaadin-text-field>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout12">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;" id="vaadinHorizontalLayout13">
      <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label4">Compositores (créditos)</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%;" id="vaadinHorizontalLayout14">
      <vaadin-text-area label="" placeholder="Compositores" style="width: 100%;" id="vaadinTextArea"></vaadin-text-area>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-l" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout15">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;" id="vaadinHorizontalLayout16">
      <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label5">Productores (créditos)</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout17">
      <vaadin-text-area label="" placeholder="Productores" style="width: 100%;" id="vaadinTextArea1"></vaadin-text-area>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout18">
     <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1;" id="vaadinHorizontalLayout19">
      <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label6">Intérpretes (créditos)</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout theme="spacing" style="width: 50%;" id="vaadinHorizontalLayout20">
      <vaadin-text-area label="" placeholder="Intérpretes" style="width: 100%;" id="vaadinTextArea2"></vaadin-text-area>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout2">
    <vaadin-vertical-layout theme="spacing" style="width: 100%; justify-content: flex-end; height: 50%; align-self: center;" id="vaadinVerticalLayout3">
     <label style="align-self: center; font-size: 25px; font-weight: bolder; flex-grow: 0;" id="label7">Archivo multimedia de la canción</label>
     <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout21">
      <vaadin-upload id="vaadinUpload"></vaadin-upload>
     </vaadin-horizontal-layout>
     <vaadin-vertical-layout style="align-self: center; padding: var(--lumo-space-s);" id="vaadinVerticalLayout4">
      <vaadin-horizontal-layout style="align-self: flex-start;">
       <label style="align-self: center;" id="label8">Los formatos de los archivos permitidos</label>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start;" id="vaadinHorizontalLayout22">
       <label id="label9">son: .mp3, .mp4, .ogg. </label>
      </vaadin-horizontal-layout>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 100%; height: 50%; justify-content: flex-end;" id="vaadinVerticalLayout5">
     <vaadin-button style="align-self: center; width: 25%; height: 10%;" id="vaadinButton">
       Modificar 
     </vaadin-button>
     <vaadin-button style="align-self: center; flex-shrink: 1; width: 25%; height: 10%;" id="vaadinButton1">
       Volver atrás 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
