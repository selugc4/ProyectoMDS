import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-contenedor_modificar_vista_de_lista')
export class VistaContenedor_modificar_vista_de_lista extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);" id="vaadinVerticalLayout">
   <label id="label">Número de listas por página</label>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <label id="label2">5</label>
    <label id="label1">10</label>
    <label id="label3">15</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-xl); width: 4%;" id="vaadinButton">
   <iron-icon src="https://img2.freepng.es/20180427/bfe/kisspng-plus-and-minus-signs-font-awesome-plus-minus-sign-simple-blue-graphics-box-5ae309cde75d97.3939703215248286219477.jpg" id="ironIcon"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: var(--lumo-space-xl); justify-content: center;" id="vaadinHorizontalLayout2">
  <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1">
   <iron-icon src="https://cdn.pixabay.com/photo/2020/03/22/15/19/arrow-4957487_960_720.png" id="ironIcon1"></iron-icon>
  </vaadin-button>
  <label style="align-self: center;" id="label4">Página 1 de x</label>
  <vaadin-button theme="icon" aria-label="Add new" style="align-self: center; height: 90%;" id="vaadinButton2">
   <iron-icon src="https://flyclipart.com/thumb2/icono-de-desplazamiento-flecha-a-la-derecha-gratis-de-entypo-icons-768097.png" id="ironIcon2"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout3">
  <img style="width: 40px; margin-right: var(--lumo-space-xl);" src="https://cdn-icons-png.flaticon.com/512/25/25605.png" id="img">
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
