import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-buscar_elementos')
export class VistaBuscar_elementos extends LitElement {
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
 <label style="margin: var(--lumo-space-xl); font-size: 30px; font-weight: bolder;" id="label">Resultados de la búsqueda</label>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl);">
  <label id="label1" style="width: 100%;">No se han encontrado resultados para la búsqueda realizada.</label>
  <label id="label2" style="width: 100%;">Pruebe de nuevo o realice otra búsqueda.</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%; height: 100%; align-items: center;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="verticalCanciones" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="horizontalArtistas" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="verticalListas" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="horizontalAlbumes" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
