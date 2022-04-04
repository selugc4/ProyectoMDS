import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-split-layout/src/vaadin-split-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_estadisticas')
export class VistaVer_estadisticas extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); margin: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <label style="font-size:50px; font-weight:bolder;" id="label">Tus estadísticas</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 94%; margin: var(--lumo-space-xl); align-self: flex-end;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="width: 75%; align-self: center;" id="vaadinVerticalLayout2">
   <vaadin-split-layout theme="minimal" style="width: 100%;" id="vaadinSplitLayout">
    <label style="font-size: 25px;" id="label1">Estilo más escuchado:</label>
    <label style="font-size: 25px; font-weight:bold;" id="label2">Estilo más escuchado</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;" id="vaadinSplitLayout1">
    <label style="font-size: 25px" id="label3">Artista más escuchado:</label>
    <label style="font-size: 25px; font-weight:bold;" id="label4">Artista más escuchado</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;" id="vaadinSplitLayout2">
    <label style="font-size: 25px" id="label5">Canción más escuchada:</label>
    <label style="font-size: 25px; font-weight:bold;" id="label6">Canción más escuchada</label>
   </vaadin-split-layout>
   <vaadin-split-layout theme="minimal" style="width: 100%;" id="vaadinSplitLayout3">
    <label style="font-size: 25px" id="label7">Horas escuchadas:</label>
    <label style="font-size: 25px; font-weight:bold;" id="label8">Horas escuchadas</label>
   </vaadin-split-layout>
  </vaadin-vertical-layout>
  <vaadin-button style="align-self: center;" id="vaadinButton">
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
