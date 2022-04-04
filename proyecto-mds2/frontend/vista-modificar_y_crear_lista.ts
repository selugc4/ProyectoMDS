import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-modificar_y_crear_lista')
export class VistaModificar_y_crear_lista extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start; margin: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <label style="font-size:40px; font-weight:bold; align-self: center;" id="label">Modificar o crear lista</label>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end;" id="vaadinHorizontalLayout1">
   <vaadin-button style="margin: var(--lumo-space-xl); align-self: center; flex-grow: 0; flex-shrink: 1;" id="vaadinButton">
     Eliminar lista 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 95%;" id="vaadinHorizontalLayout2">
  <label style="margin-right: var(--lumo-space-xl); align-self: center;" id="label1">Título:</label>
  <vaadin-text-field label="" placeholder="Título de la lista" style="align-self: center;" id="vaadinTextField"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); align-self: flex-start; align-items: center;" id="vaadinHorizontalLayout3">
  <label style="margin-right: var(--lumo-space-xl);" id="label2">Lista de canciones</label>
  <vaadin-button style="margin-left: var(--lumo-space-xl);" id="vaadinButton1">
    Añadir canción 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: flex-end; margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-xl); align-items: center;" id="vaadinVerticalLayout1">
  <vaadin-button id="vaadinButton2">
    Crear o modificar lista 
  </vaadin-button>
  <vaadin-button id="vaadinButton3">
    Volver atrás 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
