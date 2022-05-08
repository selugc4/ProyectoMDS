import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-contenedoralbumes')
export class VistaContenedoralbumes extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl); width: 100%; align-items: center; justify-content: center;" id="vaadinHorizontalLayout1">
  <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
   <iron-icon src="https://cdn.pixabay.com/photo/2020/03/22/15/19/arrow-4957487_960_720.png" id="ironIcon"></iron-icon>
  </vaadin-button>
  <label style="align-self: center;" id="label">Página 1 de x</label>
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center;" id="vaadinButton1">
   <iron-icon src="https://flyclipart.com/thumb2/icono-de-desplazamiento-flecha-a-la-derecha-gratis-de-entypo-icons-768097.png" id="ironIcon1"></iron-icon>
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
