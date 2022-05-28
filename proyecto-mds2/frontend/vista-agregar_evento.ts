import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-agregar_evento')
export class VistaAgregar_evento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;" id="vaadinVerticalLayout">
 <label style="margin: var(--lumo-space-xl); font-size:35px; font-weight: bold;" id="label">Añadir festival/concierto</label>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl); align-items: center;" id="vaadinHorizontalLayout">
  <label id="label1">¿Es un festival o un concierto?</label>
  <vaadin-combo-box id="vaadinComboBox"></vaadin-combo-box>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
