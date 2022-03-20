import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_comun';
import './vista-reproductor_completo';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-vista_buscador_usuarios')
export class VistaVista_buscador_usuarios extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-bottom: var(--lumo-space-xl);">
  <vista-cabecera_comun style="width: 100%;"></vista-cabecera_comun>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; flex-shrink: 0; flex-grow: 1;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; flex-shrink: 1;">
    <label style="font-size: 30px;">Buscador usuario: </label>
    <vaadin-text-field placeholder="Search" style="width: 15%;">
     <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
    </vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl">
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 1</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
      Editar
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
      Eliminar
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 2</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 3</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 4</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 5</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;">
    <vaadin-horizontal-layout theme="spacing">
     <img style="width: 125px; height: 125px;" src="https://electronicssoftware.net/wp-content/uploads/user.png">
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;">
     <label>Usuario 6</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing">
     <vaadin-button>
       Eliminar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vista-reproductor_completo style="width: 100%;"></vista-reproductor_completo>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
