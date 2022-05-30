import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 0; flex-grow: 1; justify-content: center; margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; border: 1px solid black; width: 100%; padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout1">
    <label style="font-weight: bolder; font-size: 30px" id="label">Dar de alta al Artista</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout2">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout3">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label1">Email*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout4">
     <vaadin-text-field error-message="Please enter a value" required invalid="" style="width: 100%;" id="vaadinTextField"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout5">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout6">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label2">Nombre de artista*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout7">
     <vaadin-text-field error-message="Please enter a value" required invalid="" style="width: 100%;" id="vaadinTextField1"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout8">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout9">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label3">Contraseña*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout10">
     <vaadin-text-field error-message="Please enter a value" required invalid="" style="width: 100%;" id="vaadinTextField2"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout11">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout12">
     <label style="padding: var(--lumo-space-s); flex-grow: 0; width: 100%;" id="label4">Confirmar contraseña*</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout13">
     <vaadin-text-field error-message="Please enter a value" required invalid="" style="width: 100%;" id="vaadinTextField3"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="padding: var(--lumo-space-s); justify-content: space-between; width: 100%;" id="vaadinHorizontalLayout14">
    <vaadin-horizontal-layout theme="spacing" style="flex-direction: row; flex-grow: 1; width: 100%;" id="vaadinHorizontalLayout15">
     <label style="padding: var(--lumo-space-s); flex-grow: 0;" id="label5">Estilo(s)</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout16">
     <vaadin-text-field error-message="Please enter a value" required invalid="" style="width: 100%;" id="vaadinTextField4"></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="flex-direction: row; width: 100%; padding: var(--lumo-space-s); margin-bottom: var(--lumo-space-xl);" id="vaadinHorizontalLayout17">
    <label style="width: 100%; align-self: center; padding: var(--lumo-space-s);" id="label6">Foto</label>
    <vaadin-horizontal-layout theme="spacing-l" style="align-items: flex-start; height: 100%; width: 100%;" id="vaadinHorizontalLayout18">
     <vaadin-upload style="flex-shrink: 1; flex-grow: 0;" id="vaadinUpload"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout19"></vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" style="justify-content: flex-end; flex-grow: 0; flex-shrink: 1; align-items: center; width: 100%; height: 100%;" id="vaadinVerticalLayout2">
    <vaadin-button id="vaadinButton">
      Dar de alta 
    </vaadin-button>
    <vaadin-button id="vaadinButton1">
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
