import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscador_cancion_para_album')
export class VistaBuscador_cancion_para_album extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; border: 1px solid black;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-bottom: var(--lumo-space-xl);">
  <vaadin-text-field placeholder="Search" style="width: 20%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-bottom: var(--lumo-space-l);">
  <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 25%; border: 1px solid black;">
   <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; height: 100%; padding: var(--lumo-space-m); align-items: center; justify-content: space-around;">
    <label style="width: 100%;">Canción 1</label>
    <vaadin-button style="width: 100%;">
     Añadir a álbum
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; height: 100%; padding: var(--lumo-space-m); align-items: center; justify-content: space-around;">
    <label style="width: 100%;">Canción 2</label>
    <vaadin-button style="width: 100%;">
     Añadir a Álbum
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; height: 100%; padding: var(--lumo-space-m); align-items: center; justify-content: space-around;">
    <label style="width: 100%;">Canción 3</label>
    <vaadin-button style="width: 100%;">
     Añadir a Álbum
    </vaadin-button>
   </vaadin-horizontal-layout>
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
