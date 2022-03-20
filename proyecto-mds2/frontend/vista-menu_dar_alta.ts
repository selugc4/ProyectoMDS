import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comun';
import './vista-reproductor_completo';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin-bottom: var(--lumo-space-xl);">
  <vista-cabecera_comun style="width: 100%; height: 100%;"></vista-cabecera_comun>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; margin-bottom: var(--lumo-space-xl); flex-grow: 1; width: 75%; margin-left: var(--lumo-space-xl);">
  <label style="font-size: 50px; font-weight: bold; align-self: flex-start; margin-left: var(--lumo-space-xl);">Dar alta</label>
  <vaadin-vertical-layout style="margin-left: var(--lumo-space-xl); width: 25%; border: 1px solid black;">
   <vaadin-horizontal-layout theme="spacing" style="border-bottom: 1px black solid; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m);">
    <vaadin-button style="background-color: white; border: none">
     Canciones
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); border-bottom: 1px solid black">
    <vaadin-button style="background-color: white; border: none">
     Estilos
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center; width: 100%; justify-content: center; height: 100%; padding: var(--lumo-space-m); border-bottom: 1px solid black">
    <vaadin-button style="background-color: white; border: none">
     Álbumes
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; width: 100%; padding: var(--lumo-space-m);">
    <vaadin-button style="background-color: white; border: none">
     Artistas
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vista-reproductor_completo style="flex-shrink: 0; flex-grow: 0; width: 100%;"></vista-reproductor_completo>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
