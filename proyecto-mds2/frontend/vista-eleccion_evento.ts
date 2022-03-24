import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-eleccion_evento')
export class VistaEleccion_evento extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xl); align-items: center;">
  <label style="margin-right: var(--lumo-space-xl);">¿Es un festival o un concierto?</label>
  <vaadin-select value="Item one">
   <template>
    <vaadin-list-box>
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
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xl); align-items: center;">
  <label style="margin-right: var(--lumo-space-xl);">Nombre del festival: </label>
  <vaadin-text-field placeholder="Nombre" style="margin-left: var(--lumo-space-xl);"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); align-items: center;">
  <label style="margin-right: var(--lumo-space-xl);">Fecha del festival:</label>
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <img src="data:image/png;base64,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">
   <vaadin-button>
    Asignar fecha
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
  <vaadin-button>
   Añadir
  </vaadin-button>
  <vaadin-button>
   Volver atrás
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
