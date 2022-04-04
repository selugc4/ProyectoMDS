import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_encontrada')
export class VistaCancion_encontrada extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 1; flex-grow: 0; flex-direction: row; padding: var(--lumo-space-m); width: 100%; align-items: center;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
   <label style="width: 100%;" id="label">Canción 1</label>
   <vaadin-button style="width: 100%;" id="vaadinButton">
     Añadir 
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
