import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver_creditos')
export class VistaVer_creditos extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; flex-shrink: 0; margin-top: var(--lumo-space-xl); height: 11%; margin-bottom: var(--lumo-space-l);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
   <label id="label">Título de canción </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 100%;" id="vaadinHorizontalLayout1">
   <label style="width: 100%; height: 100%;" id="label1">Texto de ejemplo donde iría el título de la canción</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; height: 11%; margin-bottom: var(--lumo-space-m);" id="vaadinVerticalLayout2">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
   <label id="label2">Título del álbum</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout3">
   <label style="width: 100%; height: 100%;" id="label3">Texto de ejemplo donde iría el título del álbum</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; height: 11%; margin-bottom: var(--lumo-space-l);" id="vaadinVerticalLayout3">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
   <label id="label4">Compositores</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout5">
   <label style="width: 100%; height: 100%;" id="label5">Texto de ejemplo donde iría el nombre de los compositores</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; height: 11%; margin-bottom: var(--lumo-space-l);" id="vaadinVerticalLayout4">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7">
   <label id="label6">Productores</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout6">
   <label style="width: 100%; height: 100%;" id="label7">Texto de ejemplo donde iría el nombre de los productores</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 70%; flex-grow: 0; flex-shrink: 0; height: 11%; margin-bottom: var(--lumo-space-l);" id="vaadinVerticalLayout5">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout8">
   <label id="label8">Intérpretes</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout9">
   <label style="width: 100%; height: 100%;" id="label9">Texto de ejemplo donde iría el nombre de los intérpretes</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
