import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion_con_imagen')
export class VistaCancion_con_imagen extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
    	  width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-xl);" id="vaadinVerticalLayout">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAUhttps://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRY6iSVMisBNU5lYWkySKasOApcLdR2CVaAoA&amp;usqp=CAU" id="img">
  <label id="label">Título canción</label>
  <label id="label1">Nombre artista</label>
 </vaadin-vertical-layout>
 <label style="margin-right: var(--lumo-space-xl);" id="label2">Álbum</label>
 <label style="margin-right: var(--lumo-space-xl);" id="label3">Duración</label>
 <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
  <iron-icon src="https://w7.pngwing.com/pngs/261/757/png-transparent-computer-icons-google-play-music-button-play-angle-rectangle-triangle.png" id="ironIcon"></iron-icon>
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
