import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-menu_dar_alta')
export class VistaMenu_dar_alta extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; margin-bottom: var(--lumo-space-xl); flex-grow: 1; width: 75%; margin-left: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <label style="font-size: 50px; font-weight: bold; align-self: flex-start; margin-left: var(--lumo-space-xl);" id="label">Dar alta</label>
  <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 25%; border: 1px solid black;" id="vaadinVerticalLayout2">
   <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout">
    <vaadin-button style="background-color: white; border: none" id="botonCanciones">
      Canciones 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); border-bottom: 1px solid black" id="vaadinHorizontalLayout1">
    <vaadin-button style="background-color: white; border: none" id="botonEstilos">
      Estilos 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); border-bottom: 1px solid black" id="vaadinHorizontalLayout2">
    <vaadin-button style="background-color: white; border: none" id="botonAlbumes">
      Álbumes 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; padding: var(--lumo-space-m);" id="vaadinHorizontalLayout3">
    <vaadin-button style="background-color: white; border: none" id="botonArtistas">
      Artistas 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
