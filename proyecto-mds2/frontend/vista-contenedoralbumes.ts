import { LitElement, html, css, customElement } from 'lit-element';

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
<vaadin-horizontal-layout theme="spacing">
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl); width: 100%; align-items: center; justify-content: center;">
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon src="https://cdn.pixabay.com/photo/2020/03/22/15/19/arrow-4957487_960_720.png"></iron-icon>
  </vaadin-button>
  <label style="align-self: center;">Página 1 de x</label>
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center;">
   <iron-icon src="https://flyclipart.com/thumb2/icono-de-desplazamiento-flecha-a-la-derecha-gratis-de-entypo-icons-768097.png"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
