import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-recuperar_contrasena')
export class VistaRecuperar_contrasena extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center; padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center;" id="vaadinHorizontalLayout">
   <label style="flex-shrink: 1; flex-grow: 0; font-size: 25px; align-self: center;" id="label">Recuperar cuenta</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; align-self: center; width: 100%;" id="vaadinHorizontalLayout1">
   <label style="width: 100%; margin-right: var(--lumo-space-xl);" id="label1">Correo Electrónico</label>
   <vaadin-text-field placeholder="Email" style="margin-left: var(--lumo-space-xl);" id="vaadinTextField"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-direction: row; flex-shrink: 0; justify-content: space-between; align-items: center; align-self: center;" theme="spacing-xl" id="vaadinHorizontalLayout2">
   <vaadin-button style="flex-shrink: 1; flex-grow: 1; margin-right: var(--lumo-space-xl);" id="vaadinButton">
     Volver atrás 
   </vaadin-button>
   <vaadin-button style="flex-grow: 1; margin-left: var(--lumo-space-xl);" id="vaadinButton1">
     Confirmar 
   </vaadin-button>
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
