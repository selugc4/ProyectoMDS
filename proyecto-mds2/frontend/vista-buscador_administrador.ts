import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscador_administrador')
export class VistaBuscador_administrador extends LitElement {
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
 <label style="padding: var(--lumo-space-m); margin: var(--lumo-space-xl);" id="label">Resultados de la búsqueda</label>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%; margin-left: var(--lumo-space-xl); height: 100%;">
  <label id="label1" style="width: 100%;">No se han encontrado resultados para la búsqueda realizada.</label>
  <label id="label2" style="width: 100%;">Pruebe de nuevo o realice otra búsqueda.</label>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 50%;">
   <label id="label3" style="width: 50%;">¿Quiere añadir algún elemento?</label>
   <vaadin-button id="vaadinButton" style="width: 50%;">
    Ir a Administración
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="horizontalCanciones" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="horizontalArtistas"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="horizontalAlbumes"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="horizontalUsuarios"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 50%; height: 100%;" id="horizontalListas"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
