import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-vista_album')
export class VistaVista_album extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <img style="width: 30%;" src="https://i0.wp.com/masdecibelios.es/wp-content/uploads/2020/11/mago-de-oz-bandera-negra.jpg?resize=620%2C620&amp;ssl=1" id="img">
  <vaadin-vertical-layout style="align-self: center;" id="vaadinVerticalLayout1">
   <label style="font-weight:bold; font-size: 60px" id="label">Álbum</label>
   <label style="margin-bottom: var(--lumo-space-l); font-size:25px;" id="label1">Artista/s</label>
   <label style="font-size: 25px;" id="label2">Fecha de edición</label>
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
