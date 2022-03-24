import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-agregar_evento')
export class VistaAgregar_evento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <label style="margin: var(--lumo-space-xl); font-size:35px; font-weight: bold;">Añadir festival/concierto</label>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl); align-items: center;">
  <label>¿Es un festival o un concierto?</label>
  <vaadin-select value="Item one">
   <template>
    <vaadin-list-box selected="0">
     <vaadin-item selected>
      Concierto
     </vaadin-item>
     <vaadin-item>
      Festival
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
