import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; flex-direction: row;" id="vaadinHorizontalLayout">
 <vaadin-vertical-layout theme="spacing" style="margin-right: var(--lumo-space-xl); width: 100%;" id="vaadinVerticalLayout">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-items: center; width: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2">
    <img id="img">
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1">
    <label id="labelDchaTitulo" style="width: 100%;">Título canción</label>
    <label id="labelDchaArtista">Nombre artista</label>
   </vaadin-vertical-layout>
   <label style="margin-right: var(--lumo-space-xl); margin: var(--lumo-space-xl);" id="labelAlbum">Álbum</label>
   <label style="margin-right: var(--lumo-space-xl); margin: var(--lumo-space-xl);" id="labelDuracion">Duración</label>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="margin: var(--lumo-space-xl);">
    <iron-icon src="https://w7.pngwing.com/pngs/261/757/png-transparent-computer-icons-google-play-music-button-play-angle-rectangle-triangle.png" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <label id="labelDebajoTitulo">Titulo canción</label>
  <label id="labelDebajoArtista">Nombre artista</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
