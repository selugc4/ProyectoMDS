import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ultimo_exito')
export class VistaUltimo_exito extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center; width: 100%; flex-direction: row; margin: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout theme="spacing" style="align-items: flex-start; align-self: center; width: 100%;" id="vaadinVerticalLayout1">
    <label style="font-size: 20px" id="label">Canción 1</label>
    <label id="label1">Artista</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout2">
   <vaadin-button style="width: 100%;" id="vaadinButton">
     Eliminar 
   </vaadin-button>
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
