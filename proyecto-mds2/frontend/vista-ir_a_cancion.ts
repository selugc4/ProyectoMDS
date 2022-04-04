import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-ir_a_cancion')
export class VistaIr_a_cancion extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; margin: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
 <img style="height: 50%;" src="https://i.ytimg.com/vi/BXu__jhB82w/hqdefault.jpg" id="img">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 50%;" id="vaadinVerticalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
   <vaadin-vertical-layout id="vaadinVerticalLayout1">
    <label style="font-size: 25px; font-weight:bold;" src="" id="label">Nombre de canción</label>
    <label id="label1">Artista</label>
   </vaadin-vertical-layout>
   <vaadin-button theme="icon" aria-label="Add new" src="data:image/png;base64,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" id="vaadinButton">
    <iron-icon src="data:image/png;base64,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" id="ironIcon"></iron-icon>
   </vaadin-button>
   <label id="label2">xx:xx/xx:xx</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
   <vaadin-select value="Item one" id="vaadinSelect">
    <template>
     <vaadin-list-box id="vaadinListBox">
      <vaadin-item selected id="vaadinItem">
        Lista1 
      </vaadin-item>
      <vaadin-item id="vaadinItem1">
        Lista2 
      </vaadin-item>
      <vaadin-item id="vaadinItem2">
        Lista3 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-button id="vaadinButton1">
     Añadir a la lista 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
   <vaadin-button id="vaadinButton2">
     Ver créditos 
   </vaadin-button>
   <vaadin-button id="vaadinButton3">
     Añadir a favoritos 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
