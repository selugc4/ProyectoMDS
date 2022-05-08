import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion_busqueda')
export class VistaCancion_busqueda extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%; height: 100%;">
  <vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start; align-self: center;" id="vaadinVerticalLayout">
   <label style="margin-top: var(--lumo-space-l); margin-left: var(--lumo-space-l);" id="label">Título de canción</label>
   <label style="margin-bottom: var(--lumo-space-l); margin-left: var(--lumo-space-l); font-size:12px" id="label1">Artista</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-button theme="icon" aria-label="Add new" style="align-self: center;" id="vaadinButton">
  <iron-icon style="height: 100%;" src="https://e7.pngegg.com/pngimages/340/866/png-clipart-computer-icons-heart-encapsulated-postscript-heart-love-heart.png" id="ironIcon"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; height: 100%;" id="vaadinButton1">
  <iron-icon src="https://w7.pngwing.com/pngs/261/757/png-transparent-computer-icons-google-play-music-button-play-angle-rectangle-triangle.png" id="ironIcon1"></iron-icon>
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
